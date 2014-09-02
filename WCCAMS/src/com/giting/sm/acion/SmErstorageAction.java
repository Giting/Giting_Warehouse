package com.giting.sm.acion;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.giting.sm.service.ISmEmployeesService;
import com.giting.sm.service.ISmErstorageService;
import com.opensymphony.xwork2.ActionSupport;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：BfAcommunityAction   
* 类描述：   电子档案存储表对应的数据交换层
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-2 上午12:23:08   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
@Controller("smErstorageAction")
public class SmErstorageAction extends ActionSupport{

	/** 
	* @Fields serialVersionUID : 序列号 
	*/ 
	private static final long serialVersionUID = 1L;

	@Resource
	private ISmErstorageService smErstorageService;

	public void setSmErstorageService(ISmErstorageService smErstorageService) {
		this.smErstorageService = smErstorageService;
	}
	
	
}
