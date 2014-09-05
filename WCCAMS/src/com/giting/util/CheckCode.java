package com.giting.util;

import java.util.HashMap;
import java.util.Map;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 
 * 项目名称：WCCAMS 类名称：CheckCode 类描述： 校验码，执行结果的封装值 创建人：fuchenggang@foxmail.com
 * 创建时间：2014-9-4 下午5:20:12 修改人： 修改时间： 修改备注：
 * 
 * @version
 * 
 */
public class CheckCode {

	/**
	 * @Fields addMap : 新增成功信息
	 */
	private static Map<String, Object> addMapSuccess;
	/**
	 * @Fields addMap : 新增失败信息
	 */
	private static Map<String, Object> addMapError;
	/**
	 * @Fields upadteMap : 更新成功信息
	 */
	private static Map<String, Object> upadteMapSuccess;
	/**
	 * @Fields upadteMap : 更新失败信息
	 */
	private static Map<String, Object> upadteMapError;
	/**
	 * @Fields deleteMap : 删除成功信息
	 */
	private static Map<String, Object> deleteMapSuccess;
	/**
	 * @Fields deleteMap : 删除失败信息
	 */
	private static Map<String, Object> deleteMapError;
	/**
	 * @Fields deleteMap : 登录成功信息
	 */
	private static Map<String, Object> loginMapSuccess;
	/**
	 * @Fields deleteMap : 登录失败信息
	 */
	private static Map<String, Object> loginMapError;

	/**
	 * @Fields LOGINERROR : 登录失败
	 */
	public final static int LOGINERROR = 0;

	/**
	 * @Fields LOGINERROR : 登录失败
	 */
	public final static String LOGINERRORMSG = "登录失败";
	
	/**
	 * @Fields userError : 用户名错误
	 */
	public final static int USERERROR = 2;
	
	/**
	 * @Fields userErrorMsg : 用户名错误信息
	 */
	public final static String USERERRORMSG = "用户名错误!";
	
	/**
	 * @Fields passWordError : 密码错误
	 */
	public final static int PASSWORDERROR = 3;
	
	/**
	 * @Fields passWordErrorMsg : 密码错误信息
	 */
	public final static String PASSWORDERRORMSG = "密码错误!";
	
	/**
	 * @Fields commonuserNameError : 社区名称错误
	 */
	public final static int COMMONUSERNAMEERROR = 4;
	
	/**
	 * @Fields commonuserNameMsg : 社区名称错误信息
	 */
	public final static String COMMONUSERNAMEEERRORMSG = "登录社区错误!";

	/**
	 * @Title: getAddMapSuccess
	 * @Description: 添加成功信息
	 * @return Map<String,Object> 返回类型
	 * @throws
	 */
	public static Map<String, Object> getAddMapSuccess() {
		addMapSuccess = new HashMap<String, Object>();
		addMapSuccess.put("result", 1);
		addMapSuccess.put("msg", "添加成功！");
		return addMapSuccess;
	}

	/**
	 * @Title: getAddMapError
	 * @Description: 获取新增成功的反馈信息
	 * @return Map<String,Object> 返回类型
	 * @throws
	 */
	public static Map<String, Object> getAddMapError() {
		addMapError = new HashMap<String, Object>();
		addMapError.put("result", 0);
		addMapError.put("msg", "添加失败！");
		return addMapError;
	}

	/**
	 * @Title: getUpadteMapSuccess
	 * @Description: 获取新增失败的反馈信息
	 * @return Map<String,Object> 返回类型
	 * @throws
	 */
	public static Map<String, Object> getUpadteMapSuccess() {
		upadteMapSuccess = new HashMap<String, Object>();
		upadteMapSuccess.put("result", 1);
		upadteMapSuccess.put("msg", "更新成功！");
		return upadteMapSuccess;
	}

	/**
	 * @Title: getUpadteMapError
	 * @Description: 获取更新成功的反馈信息
	 * @return Map<String,Object> 返回类型
	 * @throws
	 */
	public static Map<String, Object> getUpadteMapError() {
		upadteMapError = new HashMap<String, Object>();
		upadteMapError.put("result", 0);
		upadteMapError.put("msg", "更新失败！");
		return upadteMapError;
	}

	/**
	 * @Title: getDeleteMapSuccess
	 * @Description: 获取删除成功的反馈信息
	 * @return Map<String,Object> 返回类型
	 * @throws
	 */
	public static Map<String, Object> getDeleteMapSuccess() {
		deleteMapSuccess = new HashMap<String, Object>();
		deleteMapSuccess.put("result", 1);
		deleteMapSuccess.put("msg", "删除成功！");
		return deleteMapSuccess;
	}

	/**
	 * @Title: getDeleteMapError
	 * @Description: 获取删除失败的反馈信息
	 * @return Map<String,Object> 返回类型
	 * @throws
	 */
	public static Map<String, Object> getDeleteMapError() {
		deleteMapError = new HashMap<String, Object>();
		deleteMapError.put("result", 0);
		deleteMapError.put("msg", "删除失败！");
		return deleteMapError;
	}

	/**
	 * @Title: getLoginMapSuccess
	 * @Description: 登录成功信息
	 * @param 设定文件
	 * @return Map<String,Object> 返回类型
	 * @throws
	 */
	public static Map<String, Object> getLoginMapSuccess() {
		loginMapSuccess = new HashMap<String, Object>();
		loginMapSuccess.put("result", 1);
		loginMapSuccess.put("msg", "登录成功！");
		return loginMapSuccess;
	}

	public static Map<String, Object> getLoginMapError(int stateInt,
			String stateMsg) {
		loginMapError = new HashMap<String, Object>();
		loginMapError.put("result", stateInt);
		loginMapError.put("msg", stateMsg);
		return loginMapError;
	}

	/**
	 * @Title: getLoginMapUserError
	 * @Description: 登录失败信息
	 * @param 设定文件
	 * @return Map<String,Object> 返回类型
	 * @throws
	 */
	public final static Map<String, Object> getLoginMapAllError() {
		return getLoginMapError(LOGINERROR,LOGINERRORMSG);
	}
	
	/**
	 * @Title: getLoginMapUserError
	 * @Description: 登录用户名错误
	 * @param 设定文件
	 * @return Map<String,Object> 返回类型
	 * @throws
	 */
	public final static Map<String, Object> getLoginMapUserError() {
		return getLoginMapError(USERERROR, USERERRORMSG);
	}

	/**
	 * @Title: getLoginMapPassWordError
	 * @Description: 登陆密码错误
	 * @param 设定文件
	 * @return Map<String,Object> 返回类型
	 * @throws
	 */
	public static Map<String, Object> getLoginMapPassWordError() {
		return getLoginMapError(PASSWORDERROR, PASSWORDERRORMSG);
	}

	/**
	 * @Title: getLoginMapCommonuserNameError
	 * @Description: 登录社区错误
	 * @param 设定文件
	 * @return Map<String,Object> 返回类型
	 * @throws
	 */
	public static Map<String, Object> getLoginMapCommonuserNameError() {
		return getLoginMapError(COMMONUSERNAMEERROR, COMMONUSERNAMEEERRORMSG);
	}

}
