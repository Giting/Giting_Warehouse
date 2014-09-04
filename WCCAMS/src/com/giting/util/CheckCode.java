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
	 * @Title: getAddMapSuccess
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return Map<String,Object> 返回类型
	 * @throws
	 */
	public static Map<String, Object> getAddMapSuccess() {
		addMapSuccess = new HashMap<String, Object>();
		addMapSuccess.put("result", true);
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
		addMapError.put("result", false);
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
		upadteMapSuccess.put("result", true);
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
		upadteMapError.put("result", false);
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
		deleteMapSuccess.put("result", false);
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
		deleteMapError.put("result", false);
		deleteMapError.put("msg", "删除失败！");
		return deleteMapError;
	}

}
