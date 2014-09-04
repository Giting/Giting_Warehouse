package com.giting.sm.acion;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.giting.sm.service.ISmModuleService;
import com.giting.sm.service.ISmUserService;
import com.opensymphony.xwork2.ActionSupport;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：BfAcommunityAction   
* 类描述： 用户表对应的数据交换层
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-2 上午12:23:08   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
@Controller("smUserAction")
public class SmUserAction extends ActionSupport{

	/** 
	* @Fields serialVersionUID : 序列号 
	*/ 
	private static final long serialVersionUID = 1L;
	
	/** 
	* @Fields username : 登录名 
	*/ 
	private String username;
	/** 
	* @Fields password : 密码
	*/ 
	private String password;
	/** 
	* @Fields commonuser : 所在社区
	*/ 
	private String commonuser;

	/** 
	* @Fields result : 返回结果
	*/ 
	private String result;
	@Resource
	private ISmUserService smUserService;
	
	public String login() throws Exception{

		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCommonuser() {
		return commonuser;
	}

	public void setCommonuser(String commonuser) {
		this.commonuser = commonuser;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
