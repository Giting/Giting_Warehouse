package com.giting.sm.service;

import com.giting.entities.table.SmUser;
import com.giting.util.common.IBaseService;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：IBfAcommunityService   
* 类描述：   用户表业务层的接口设计
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-2 上午12:24:23   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
public interface ISmUserService extends IBaseService{
	
	/** 
	 * @Title: getSmUser 
	 * @Description: 登录方法
	 * @param  username 用户名
	 * @param  password 密码
	 * @param  commonuser 所在社区
	 * @return SmUser 返回类型 
	 * @throws 
	 */ 
	public SmUser getSmUser(String username,String password,String commonuser);

}
