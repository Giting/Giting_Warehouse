package com.giting.sm.dao;

import com.giting.entities.table.SmUser;
import com.giting.util.common.IBaseDao;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：IBfAcommunityDao   
* 类描述：  用户表数据访问层的接口设计
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-2 上午12:23:43   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
public interface ISmUserDao extends IBaseDao{
	
	/** 
	 * @Title: getSmUser 
	 * @Description: 查询用户
	 * @param  username 用户名
	 * @param  password 密码
	 * @param  设定文件 
	 * @return SmUser 返回类型 
	 * @throws 
	 */ 
	public SmUser getSmUser(String username, String password);

}
