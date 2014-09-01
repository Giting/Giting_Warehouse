/**   
 * @Title: BaseDao.java 
 * @Package com.company.base 
 * @Description: 数据持久层原子操作基类Dao接口
 * @author 付成刚  
 * @date 2014年4月30日 上午11:13:40 
 * @version V1.0   
 */
package com.giting.util.common;

import java.util.Collection;
import java.util.List;

import com.giting.exception.BaseDaoException;


/**
 * @ClassName: BaseDao
 * @Description: 数据持久层原子操作基类Dao接口
 * @author 付成刚
 * @date 2014年4月30日 上午11:13:40
 * 
 */
public interface IBaseDao {

	/**
	 * @throws BaseDaoException 
	 * @Title: getTotalCount
	 * @Description: 根据hql语句得到记录总数
	 * @param @param hql
	 * @param @return 设定文件
	 * @return int 返回类型
	 * @throws
	 */
	public int getTotalCount(String hql) throws BaseDaoException;

	/**
	 * @Title: getTotalCountBySql
	 * @Description: 根据sql语句得到记录总数
	 * @param @param sql
	 * @param @return 设定文件
	 * @return int 返回类型
	 * @throws
	 */
	public int getTotalCountBySql(String sql) throws BaseDaoException;

	/**
	 * @Title: getTotalCount
	 * @Description: 根据hql语句得到记录总数
	 * @param @param hql
	 * @param @param obj
	 * @param @return 设定文件
	 * @return int 返回类型
	 * @throws
	 */
	public int getTotalCount(String hql, Object obj)  throws BaseDaoException;

	/**
	 * @Title: getTotalCount
	 * @Description: 根据hql语句得到记录总数
	 * @param @param hql
	 * @param @param params
	 * @param @return 设定文件
	 * @return int 返回类型
	 * @throws
	 */
	public int getTotalCount(String hql, List<?> params)  throws BaseDaoException;

	/**
	 * @Title: getTotalCountBySql
	 * @Description: 根据sql语句得到记录总数
	 * @param @param sql
	 * @param @param params
	 * @param @return 设定文件
	 * @return int 返回类型
	 * @throws
	 */
	public int getTotalCountBySql(String sql, List<?> params)  throws BaseDaoException;

	/**
	 * @return
	 * @Title: create
	 * @Description: 增加记录
	 * @param @param entity 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public boolean save(Object entity)  throws BaseDaoException;

	/**
	 * @return 
	 * @Title: update
	 * @Description: 修改记录
	 * @param @param entity 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public boolean update(Object entity)  throws BaseDaoException;

	/**
	 * @return
	 * @Title: delete
	 * @Description: 删除记录
	 * @param @param entity 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public boolean delete(Object entity)  throws BaseDaoException;

	/**
	 * @return
	 * @Title: delete
	 * @Description:删除数据
	 * @param @param clazz
	 * @param @param id 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public boolean delete(Class<?> clazz, long id)  throws BaseDaoException;

	/**
	 * @return
	 * @Title: batchDelete
	 * @Description: 批量删除数据
	 * @param @param clazz
	 * @param @param id 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public boolean batchDelete(Class<?> clazz, long[] id)  throws BaseDaoException;

	/**
	 * @return
	 * @Title: deleteAll
	 * @Description: 删除表中的所有的记录
	 * @param @param clazz 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public boolean deleteAll(Class<?> clazz)  throws BaseDaoException;

	/**
	 * @return
	 * @Title: deleteAll
	 * @Description: 删除记录集中的所有的记录
	 * @param @param entities 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public boolean deleteAll(Collection<?> entities)  throws BaseDaoException;

	/**
	 * @Title: getByPk
	 * @Description: 通过主键查询记录
	 * @param @param clazz
	 * @param @param id
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	public Object getByPk(Class<?> clazz, int id) throws BaseDaoException;

	/**
	 * @Title: getByPk
	 * @Description: 通过主键查询记录
	 * @param @param clazz
	 * @param @param id
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	public Object getByPk(Class<?> clazz, String id)  throws BaseDaoException;

	/**
	 * @Title: getByPk
	 * @Description: 通过主键查询记录
	 * @param @param clazz
	 * @param @param id
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	public Object getByPk(Class<?> clazz, Long id)  throws BaseDaoException;

	/**
	 * @Title: loadByPk
	 * @Description: 通过关键字和值来进行查询
	 * @param @param clazz
	 * @param @param keyName
	 * @param @param keyValue
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	public Object loadByPk(Class<?> clazz, String keyName, Object keyValue)  throws BaseDaoException;

	/**
	 * @Title: find
	 * @Description: 根据hql查询记录
	 * @param @param hql
	 * @param @return 设定文件
	 * @return List 返回类型
	 * @throws
	 */
	public List<?> find(String hql)  throws BaseDaoException;

	/**
	 * @Title: find
	 * @Description: 根据hql查询记录
	 * @param @param hql
	 * @param @param param
	 * @param @return 设定文件
	 * @return List 返回类型
	 * @throws
	 */
	public List<?> find(String hql, Object param)  throws BaseDaoException;

	/**
	 * @Title: findByNamedParam
	 * @Description: 根据hql查询记录
	 * @param @param hql
	 * @param @param name
	 * @param @param param
	 * @param @return 设定文件
	 * @return List 返回类型
	 * @throws
	 */
	public List<?> findByNamedParam(String hql, String name, Object param)  throws BaseDaoException;

	/**
	 * @Title: findBySql
	 * @Description: SQL查询
	 * @param @param sql
	 * @param @return 设定文件
	 * @return List 返回类型
	 * @throws
	 */
	public List<?> findBySql(String sql)  throws BaseDaoException;

	/**
	 * @Title: findBySql
	 * @Description: 查询符合条件的记录。
	 * @param @param sql
	 * @param @param params
	 * @param @return 设定文件
	 * @return List 返回类型
	 * @throws
	 */
	public List<?> findBySql(String sql, List<?> params)  throws BaseDaoException;

	/**
	 * @Title: query
	 * @Description: 分页查询
	 * @param @param pageNo
	 * @param @param pageSize
	 * @param @param hql
	 * @param @return 设定文件
	 * @return List 返回类型
	 * @throws
	 */
	public List<?> query(int pageNo, int pageSize, String hql)  throws BaseDaoException;

	/**
	 * @Title: query
	 * @Description: 分页查询
	 * @param @param pageNo
	 * @param @param pageSize
	 * @param @param hql
	 * @param @param obj
	 * @param @return 设定文件
	 * @return List 返回类型
	 * @throws
	 */
	public List<?> query(int pageNo, int pageSize, String hql, Object obj)  throws BaseDaoException;

	/**
	 * @Title: query
	 * @Description: 分页查询
	 * @param @param pageNo
	 * @param @param pageSize
	 * @param @param hql
	 * @param @param params
	 * @param @return 设定文件
	 * @return List 返回类型
	 * @throws
	 */
	public List<?> query(int pageNo, int pageSize, String hql, List<?> params)  throws BaseDaoException;

	/**
	 * @Title: queryBySql
	 * @Description:分页查询
	 * @param @param pageNo
	 * @param @param pageSize
	 * @param @param sql
	 * @param @return 设定文件
	 * @return List 返回类型
	 * @throws
	 */
	public List<?> queryBySql(int pageNo, int pageSize, String sql)  throws BaseDaoException;

	/**
	 * @Title: queryBySql
	 * @Description: 分页查询
	 * @param @param pageNo
	 * @param @param pageSize
	 * @param @param sql
	 * @param @param params
	 * @param @return 设定文件
	 * @return List 返回类型
	 * @throws
	 */
	public List<?> queryBySql(int pageNo, int pageSize, String sql,
			List<?> params)  throws BaseDaoException;

	/**
	 * @return
	 * @Title: excuteSql
	 * @Description: 执行SQL语句，主要是更新与删除记录的SQL语句
	 * @param @param sql 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public boolean excuteSql(String sql)  throws BaseDaoException;

	/**
	 * 功能：得到记录数的方法
	 * 
	 * @param list
	 * @return
	 */
	public int getNum(List<?> list)  throws BaseDaoException;

	/**
	 * 功能：得到查询记录总数的语句（包含sql与hql）
	 * 
	 * @param queryString
	 * @return
	 */
	public String getQueryTotalCountString(String queryString)  throws BaseDaoException;

}
