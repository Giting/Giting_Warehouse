/**   
 * @Title: BaseAction.java 
 * @Package com.company.base 
 * @Description: 基类Action
 * @author ZhangHua
 * @date 2014年4月30日 上午11:18:12 
 * @version V1.0   
 */
package com.giting.util.common;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName: BaseAction
 * @Description: 基类Action
 * @author 付成刚
 * @date 2014年4月30日 上午11:18:12
 * 
 */
public class BaseAction extends ActionSupport {

	/**
	 * @Fields serialVersionUID : 序列化 修改此类必须修改序列化值！
	 */
	private static final long serialVersionUID = -2343310210259298521L;

	/** 
	* @Title: setRequest 
	* @Description: 获取请求对象
	* @param      
	* @return void    返回类型 
	* @throws 
	*/ 
	public HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}

	/** 
	* @Title: setResponse 
	* @Description: 获取响应对象
	* @param     
	* @return void    返回类型 
	* @throws 
	*/ 
	public HttpServletResponse getResponse() {
		return ServletActionContext.getResponse();
	}
	
	/** 
	* @Title: setSession 
	* @Description: 获取会话对象
	* @param      
	* @return void    返回类型 
	* @throws 
	*/ 
	public Map<String, Object> getSession() {
		return ActionContext.getContext().getSession();
	}

}
