package com.giting.sm.acion;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.jms.Session;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;

import com.giting.entities.table.SmUser;
import com.giting.sm.service.ISmUserService;
import com.giting.util.CheckCode;
import com.giting.util.common.BaseAction;
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
public class SmUserAction extends BaseAction{

	/** 
	* @Fields serialVersionUID : 序列号 
	*/ 
	private static final long serialVersionUID = 1L;
	
	/** 
	* @Fields username : 登录名 
	*/ 
	private String userName;
	/** 
	* @Fields password : 密码
	*/ 
	private String passWord;
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
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		try {
			 map = smUserService.getSmUserState(userName, passWord, commonuser);
		} catch (Exception e) {
			 map=CheckCode.getLoginMapAllError();
		}
		
		SmUser smUser =new SmUser();
		if(map != null){
			if((Integer)map.get("result") == 1){
				smUser = smUserService.getSmUser(userName, passWord, commonuser);
			}
		}
		Map<String,Object>  sessionMap = getSession();
		

		this.setResult(JSONObject.fromObject(map).toString());
		return SUCCESS;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
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
