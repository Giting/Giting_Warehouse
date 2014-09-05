package com.giting.sm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.giting.entities.table.SmUser;
import com.giting.util.common.BaseDaoImpl;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：BfAcommunityDaoImpl   
* 类描述： 用户表数据访问层的实现类
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-2 上午12:23:26   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
@Repository("smUserDao")
public class SmUserDaoImpl extends BaseDaoImpl implements ISmUserDao{

	@Override
	public SmUser getSmUser(String userName, String passWord,String commonuser) throws Exception {
		
		StringBuffer sb = new StringBuffer("select sc.smUser from SmCommunityusers sc");
		sb.append(" where sc.daLoginName = ");
		sb.append(commonuser);
		sb.append(" and sc.smUser.daLoginName = ");
		sb.append(userName);
		sb.append(" and sc.smUser.daPwd =");
		sb.append(passWord);
		
		SmUser smUser = null;
		smUser=  (SmUser) getSession().createQuery(sb.toString()).uniqueResult();
		
		return smUser;
	}

	@Override
	public int getSmUserByName(String userName) {
		StringBuffer sb = new StringBuffer("from SmUser su");
		sb.append(" where su.daLoginName = ");
		sb.append(userName);
		
		int number = getSession().createQuery(sb.toString()).list().size();
		
		return number;
	}

	@Override
	public int getSmUserByPassWord(String userName,String passWord) {
		StringBuffer sb = new StringBuffer("from SmUser su");
		sb.append(" where su.daLoginName = ");
		sb.append(userName);
		sb.append(" and su.daPwd =");
		sb.append(passWord);
		
		int number = getSession().createQuery(sb.toString()).list().size();
		
		return number;
	}

	@Override
	public int getSmUserByCommonuser(String userName,String passWord,String commonuser) {
		StringBuffer sb = new StringBuffer("select sc.smUser from SmCommunityusers sc");
		sb.append(" where sc.daLoginName = ");
		sb.append(commonuser);
		sb.append(" and sc.smUser.daLoginName = ");
		sb.append(userName);
		sb.append(" and sc.smUser.daPwd =");
		sb.append(passWord);
		
		int number = getSession().createQuery(sb.toString()).list().size();
		
		return number;
	}
	


}
