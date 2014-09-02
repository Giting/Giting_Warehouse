/**   
 * @Title: BaseDaoImpl.java 
 * @Package com.company.base 
 * @Description: 基类Dao实现类
 * @author 付成刚
 * @date 2014年4月30日 下午12:20:10 
 * @version V1.0   
 */
package com.giting.util.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: BaseDaoImpl
 * @Description: 基类Dao实现类
 * @author 付成刚
 * @date 2014年4月30日 下午12:20:10
 * 
 */
@Repository("baseDao")
public class BaseDaoImpl implements IBaseDao {

	private Logger logger = Logger.getLogger(this.getClass());

	@Resource
	private SessionFactory sessionFactory;
	
	@Resource
	private HibernateTemplate hibernateTemplate;
	
	private Session session;

	/**
	 * @Title: getSession
	 * @Description: 得到操作对象Session
	 * @param 设定文件
	 * @return Session 返回类型
	 * @throws
	 */
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * @Title: getTotalCount
	 * @Description: 根据hql语句得到记录总数
	 * @param hql
	 * @param 设定文件
	 * @return int 返回类型
	 * @throws
	 */
	@Override
	public int getTotalCount(String hql) {
		// TODO Auto-generated method stub
		logger.debug("getTotalCount() strhql=" + hql);
		int result = 0;
		String strsql = this.getQueryTotalCountString(hql);
		Query query = this.getSession().createQuery(strsql);
		List<?> list = query.list();
		result = this.getNum(list);
		return result;
	}

	/**
	 * @Title: getTotalCountBySql
	 * @Description: 根据sql语句得到记录总数
	 * @param  sql
	 * @param  设定文件
	 * @return int 返回类型
	 * @throws
	 */
	@Override
	public int getTotalCountBySql(String sql) {
		logger.debug("getTotalCountBySql(String) strsql=" + sql);
		int result = 0;
		String strsql = this.getQueryTotalCountString(sql);
		logger.debug("strsql==" + strsql);
		List<?> list = this.getSession().createSQLQuery(strsql).list();
		result = this.getNum(list);
		return result;
	}

	/**
	 * @Title: getTotalCount
	 * @Description: 根据hql语句得到记录总数
	 * @param hql
	 * @param obj
	 * @param 设定文件
	 * @return int 返回类型
	 * @throws
	 */
	@Override
	public int getTotalCount(String hql, Object obj) {
		logger.debug("getTotalCount(String,Object)  strhql=" + hql + ""
				+ obj.getClass().getName());
		int result = 0;
		String strsql = this.getQueryTotalCountString(hql);
		logger.debug("strsql=" + strsql);
		List<?> list = this.getSession().createQuery(strsql).setProperties(obj)
				.list();
		result = this.getNum(list);
		return result;
	}

	/**
	 * @Title: getTotalCount
	 * @Description: 根据hql语句得到记录总数
	 * @param  hql
	 * @param  params
	 * @param  设定文件
	 * @return int 返回类型
	 * @throws
	 */
	@Override
	public int getTotalCount(String hql, List<?> params) {
		String paramnameArray = "";
		if (params.size() > 0) {
			for (int i = 0; i < params.size(); i++) {
				if (i > 0) {
					paramnameArray += " , " + params.get(i);
				} else {
					paramnameArray = "" + params.get(i);
				}
			}
		}
		logger.debug("getTotalCount(String, List) strhql=" + hql + " , List="
				+ paramnameArray);
		int result = 0;
		String strquery = this.getQueryTotalCountString(hql);
		logger.debug("strquery==" + strquery);
		Query query = this.getSession().createQuery(strquery);
		if (params.size() > 0) {
			for (int i = 0; i < params.size(); i++) {
				query.setParameter(i, params.get(i));
			}

		}
		List<?> list = query.list();
		result = this.getNum(list);
		return result;
	}

	/**
	 * @Title: getTotalCountBySql
	 * @Description: 根据sql语句得到记录总数
	 * @param sql
	 * @param params
	 * @param 设定文件
	 * @return int 返回类型
	 * @throws
	 */
	@Override
	public int getTotalCountBySql(String sql, List<?> params) {
		// TODO Auto-generated method stub
		String paramnameArray = "";
		if (params != null) {
			for (int i = 0; i < params.size(); i++) {
				if (i > 0)
					paramnameArray += " , " + params.get(i);
				else
					paramnameArray = "" + params.get(i);
			}
		}
		logger.debug("getTotalCountBySql(String, List) strsql=" + sql
				+ " , List=" + paramnameArray);
		int result = 0;
		String strsql = this.getQueryTotalCountString(sql);
		logger.debug("strsql==" + strsql);
		SQLQuery query = session.createSQLQuery(strsql);
		if (params.size() > 0) {
			for (int i = 0; i < params.size(); i++) {
				query.setParameter(i, params.get(i));
			}
		}
		List<?> list = query.list();
		result = this.getNum(list);
		return result;
	}

	/**
	 * @Title: save
	 * @Description: 增加记录
	 * @param @param entity
	 * @param @return 设定文件
	 * @return boolean 返回类型
	 * @throws
	 */
	@Override
	public boolean save(Object entity) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			this.getSession().save(entity);
			logger.debug("保存" + entity.getClass().getName() + " 的实例到数据库成功！");
			flag = true;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * @Title: update
	 * @Description: 修改记录
	 * @param entity
	 * @param 设定文件
	 * @return boolean 返回类型
	 * @throws
	 */
	@Override
	public boolean update(Object entity) {
		logger.debug("update(Object) entity.class="+ entity.getClass().getName());
		boolean flag = false;
		this.getSession().update(entity);
		flag = true;
		return flag;
	}

	/**
	 * @Title: delete
	 * @Description: 删除记录
	 * @param entity
	 * @param 设定文件
	 * @return boolean 返回类型
	 * @throws
	 */
	@Override
	public boolean delete(Object entity) {
		boolean flag = false;
		try {
			logger.debug("delete(Object) entity.class="+ entity.getClass().getName());
			this.getSession().delete(entity);
			flag = true;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * @Title: delete
	 * @Description: 删除数据
	 * @param clazz
	 * @param id
	 * @param 设定文件
	 * @return boolean 返回类型
	 * @throws
	 */
	@Override
	public boolean delete(Class<?> clazz, long id) {
		boolean flag = false;
		try {
			logger.debug("ClassName=" + clazz.getName() + "  ,id=" + id);
			Object entity = this.getByPk(clazz, id);
			if (entity != null) {
				this.delete(entity);
			} else {
				logger.debug(clazz.getName() + " 的关键字为 " + id + "  的对象不存在 ");
			}
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * @Title: batchDelete
	 * @Description:批量删除数据
	 * @param clazz
	 * @param id
	 * @param 设定文件
	 * @return boolean 返回类型
	 * @throws
	 */
	@Override
	public boolean batchDelete(Class<?> clazz, long[] id) {
		boolean flag = false;
		try {
			String strId = "";
			for (int i = 0; i < id.length; i++) {
				if (i > 0)
					strId += "," + id[i];
				else
					strId = "" + id[i];
			}
			logger.debug("batchDelete(Class, long[])  id[]={" + strId + "}");
			for (int i = 0; i < id.length; i++) {
				this.delete(clazz, id[i]);
			}
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * @Title: deleteAll
	 * @Description: 删除表中的所有的记录
	 * @param clazz
	 * @param 设定文件
	 * @return boolean 返回类型
	 * @throws
	 */
	@Override
	public boolean deleteAll(Class<?> clazz) {

		boolean flag = false;
		try {
			logger.debug("deleteAll(Class) ClassName=" + clazz.getName());
			this.getSession().createQuery("delete from" + clazz.getName()).executeUpdate();
			flag = true;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * @Title: deleteAll
	 * @Description: 删除记录集中的所有的记录
	 * @param entities
	 * @param 设定文件
	 * @return boolean 返回类型
	 * @throws
	 */
	@Override
	public boolean deleteAll(Collection<?> entities) {
		boolean flag = false;
		try {
			Iterator<?> ite = entities.iterator();
			while (ite.hasNext()) {
				this.delete(ite.next());
			}
			flag = true;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * @Title: getByPk
	 * @Description: 通过主键查询记录
	 * @param clazz
	 * @param id
	 * @param 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Override
	public Object getByPk(Class<?> clazz, int id) {
		logger.debug("getByPk(Class, Integer) class=" + clazz.getName()+ " , ID=" + id);
		Object result = this.getSession().get(clazz, new Integer(id));
		return result;
	}

	/**
	 * @Title: getByPk
	 * @Description: 通过主键查询记录
	 * @param clazz
	 * @param id
	 * @param 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Override
	public Object getByPk(Class<?> clazz, String id) {
		logger.debug("getByPk(Class, String) Class=" + clazz.getName() + ",id="+ id);
		Object result = this.getSession().get(clazz, id);
		return result;
	}

	/**
	 * @Title: loadByPk
	 * @Description: 通过关键字和值来进行查询
	 * @param clazz
	 * @param keyName
	 * @param keyValue
	 * @param 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Override
	public Object loadByPk(Class<?> clazz, String keyName, Object keyValue) {
		
		Object result = null;
		String query = "from " + clazz.getName() + "  where " + keyName + "=? ";
		logger.debug("loadByPk(Class, String, Object) queryString=" + query+ "  ,keyValue=" + keyValue);
		result = session.createCriteria(clazz).add(Restrictions.eq(keyName, keyValue)).list();

		return result;
	}

	/**
	 * @Title: find
	 * @Description: 根据hql查询记录
	 * @param hql
	 * @param 设定文件
	 * @return List<?> 返回类型
	 * @throws
	 */
	@Override
	public List<?> find(String hql) {
		List<?> result = null;
		logger.debug("find(String) queryString=" + hql);
		result = this.getSession().createQuery(hql).list();
		return result;
	}

	/**
	 * @Title: find
	 * @Description: 根据hql查询记录
	 * @param hql
	 * @param param
	 * @param 设定文件
	 * @return List<?> 返回类型
	 * @throws
	 */
	@Override
	public List<?> find(String hql, Object param) {
		logger.debug("find(String, Object) queryString=" + hql + " ,param="+ param);
		List<?> result = null;
		Query query = this.getSession().createQuery(hql);
		query.setParameter(0, param);
		result = query.list();
		return result;
	}

	/**
	 * @Title: findByNamedParam
	 * @Description: 根据hql查询记录
	 * @param hql
	 * @param name
	 * @param param
	 * @param 设定文件
	 * @return List<?> 返回类型
	 * @throws
	 */
	@Override
	public List<?> findByNamedParam(String hql, String name, Object param) {
		logger.debug("findByNamedParam(String, String, Object) strhql=" + hql+ "name=" + name + " ,param=" + param);
		List<?> result = null;
		Query query = this.getSession().createQuery(hql);
		query.setParameter(name, param);
		result = query.list();
		return result;
	}

	/**
	 * @Title: findBySql
	 * @Description: SQL查询
	 * @param sql
	 * @param 设定文件
	 * @return List<?> 返回类型
	 * @throws
	 */
	@Override
	public List<?> findBySql(String sql) {
		logger.debug("exceuteSQL(String) strsql=" + sql);
		List<?> result = null;
		result = this.getSession().createSQLQuery(sql).list();
		return result;
	}

	/**
	 * @Title: findBySql
	 * @Description: 查询符合条件的记录。
	 * @param sql
	 * @param params
	 * @param 设定文件
	 * @return List<?> 返回类型
	 * @throws
	 */
	@Override
	public List<?> findBySql(String sql, List<?> params) {
		String paramnameArray = "";
		if (params.size() > 0) {
			for (int i = 0; i < params.size(); i++) {
				if (i > 0) {
					paramnameArray += " , " + params.get(i);
				} else {
					paramnameArray = "" + params.get(i);
				}
			}
		}
		logger.debug("excuteSql(String, List) strsql=" + sql + " , List="+ paramnameArray);
		List<?> result = null;
		SQLQuery query = this.getSession().createSQLQuery(sql);
		if (params.size() > 0) {
			for (int i = 0; i < params.size(); i++) {
				query.setParameter(i, params.get(i));
			}
		}
		result = query.list();
		return result;
	}

	/**
	 * @Title: query
	 * @Description: 分页查询
	 * @param pageNo
	 * @param pageSize
	 * @param hql
	 * @param 设定文件
	 * @return List<?> 返回类型
	 * @throws
	 */
	@Override
	public List<?> query(int pageNo, int pageSize, String hql) {
		logger.debug("query(int, int, String) pageNo=" + pageNo + ",pageSize="+ pageSize + " ,strhql=" + hql);
		List<?> result = null;
		Query query = this.getSession().createQuery(hql);
		if (pageNo > 0 && pageSize > 0) {
			query.setFirstResult((pageNo - 1) * pageSize);
			query.setMaxResults(pageSize);
		}
		result = query.list();
		return result;
	}

	/**
	 * @Title: query
	 * @Description:分页查询
	 * @param pageNo
	 * @param pageSize
	 * @param hql
	 * @param obj
	 * @param 设定文件
	 * @return List<?> 返回类型
	 * @throws
	 */
	@Override
	public List<?> query(int pageNo, int pageSize, String hql, Object obj) {
		logger.debug("query(int, int, String, Object) pageNo=" + pageNo + ",pageSize=" + pageSize + "strhql=" + hql + "  ,obj"+ obj.getClass().getName());
		List<?> result = null;
		Query query = this.getSession().createQuery(hql);
		query.setProperties(obj);
		if (pageNo > 0 && pageSize > 0) {
			query.setFirstResult((pageNo - 1) * pageSize);
			query.setMaxResults(pageSize);
		}
		result = query.list();
		return result;
	}

	/**
	 * @Title: query
	 * @Description: 分页查询
	 * @param pageNo
	 * @param pageSize
	 * @param hql
	 * @param params
	 * @param 设定文件
	 * @return List<?> 返回类型
	 * @throws
	 */
	@Override
	public List<?> query(int pageNo, int pageSize, String hql, List<?> params) {
		logger.debug("query(int, int, String, Object) pageNo=" + pageNo+ ",pageSize=" + pageSize + ",strhql=" + hql);
		String paramnameArray = "";
		if (params != null) {
			for (int i = 0; i < params.size(); i++) {
				if (i > 0)
					paramnameArray += " , " + params.get(i);
				else
					paramnameArray = "" + params.get(i);
			}
		}
		logger.debug("params=" + paramnameArray);
		List<?> result = null;
		Query query = this.getSession().createQuery(hql);
		if (params.size() > 0) {
			for (int i = 0; i < params.size(); i++) {
				query.setParameter(i, params.get(i));
			}
		}
		if (pageNo > 0 && pageSize > 0) {
			query.setFirstResult((pageNo - 1) * pageSize);
			query.setMaxResults(pageSize);
		}
		result = query.list();
		return result;
	}

	/**
	 * @Title: queryBySql
	 * @Description:分页查询
	 * @param pageNo
	 * @param pageSize
	 * @param sql
	 * @param 设定文件
	 * @return List<?> 返回类型
	 * @throws
	 */
	@Override
	public List<?> queryBySql(int pageNo, int pageSize, String sql) {
		logger.debug("query(int, int, String) pageNo=" + pageNo + ",pageSize="+ pageSize + " ,strsql=" + sql);
		List<?> result = null;
		SQLQuery query = this.getSession().createSQLQuery(sql);
		if (pageNo > 0 && pageSize > 0) {
			query.setFirstResult((pageNo - 1) * pageSize);
			query.setMaxResults(pageSize);
		}
		result = query.list();
		return result;
	}

	/**
	 * @Title: queryBySql
	 * @Description: 分页查询
	 * @param pageNo
	 * @param pageSize
	 * @param sql
	 * @param params
	 * @param 设定文件
	 * @return List<?> 返回类型
	 * @throws
	 */
	@Override
	public List<?> queryBySql(int pageNo, int pageSize, String sql,List<?> params) {
		logger.debug("query(int, int, String, Object) pageNo=" + pageNo + ",pageSize=" + pageSize + " , strsql=" + sql);
		String paramnameArray = "";
		if (params.size() > 0) {
			for (int i = 0; i < params.size(); i++) {
				if (i > 0) {
					paramnameArray += " , " + params.get(i);
				} else {
					paramnameArray = "" + params.get(i);
				}
			}
		}
		logger.debug("params=" + paramnameArray);
		List<?> result = null;
		SQLQuery query = this.getSession().createSQLQuery(sql);
		if (params != null) {
			for (int i = 0; i < params.size(); i++) {
				query.setParameter(i, params.get(i));
			}
		}
		if (pageNo > 0 && pageSize > 0) {
			query.setFirstResult((pageNo - 1) * pageSize);
			query.setMaxResults(pageSize);
		}
		result = query.list();
		return result;
	}

	/**
	 * @Title: excuteSql
	 * @Description: 执行SQL语句，主要是更新与删除记录的SQL语句
	 * @param sql
	 * @param 设定文件
	 * @return boolean 返回类型
	 * @throws
	 */
	@Override
	public boolean excuteSql(String sql) {
		logger.debug("excuteSql(String) strsql=" + sql);
		boolean flag = false;
		this.getSession().createSQLQuery(sql).executeUpdate();
		flag = true;
		return flag;
	}

	/**
	 * @Title: getByPk
	 * @Description:根据主键查询记录
	 * @param clazz
	 * @param id
	 * @param 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Override
	public Object getByPk(Class<?> clazz, Long id) {
		logger.debug("getByPk(Class, Long) Class=" + clazz.getName() + ",id="+ id);
		Object result = this.getSession().get(clazz, new Long(id));
		return result;
	}

	/**
	 * @Title: getNum
	 * @Description: 得到记录数的方法
	 * @param list
	 * @param 设定文件
	 * @return int 返回类型
	 * @throws
	 */
	@SuppressWarnings("null")
	@Override
	public int getNum(List<?> list) {
		int result = 0;
		if (list != null || list.size() > 0) {
			result = Integer.parseInt(list.get(0).toString());
		}
		return result;
	}

	/**
	 * @Title: getQueryTotalCountString
	 * @Description: 得到查询记录总数的语句（包含sql与hql）
	 * @param queryString
	 * @param 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	@Override
	public String getQueryTotalCountString(String queryString) {
		int form_index = queryString.indexOf("from ");
		int orderby_index = queryString.indexOf(" order by ");
		if (form_index < 0) {
			// 异常处理
		}
		String strsql = " select count(*) ";
		if (orderby_index > -1) {
			strsql = strsql + queryString.substring(form_index, orderby_index);
		} else {
			strsql = strsql + queryString.substring(form_index);
		}
		return strsql;
	}

}
