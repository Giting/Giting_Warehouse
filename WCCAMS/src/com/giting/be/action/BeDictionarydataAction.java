package com.giting.be.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.giting.be.service.IBeDictionarydataService;
import com.opensymphony.xwork2.ActionSupport;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：BeDictionarydataAction   
* 类描述： 字典数据表对应的数据交换层
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-1 下午11:59:08   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
@Controller("beDictionarydataAction")
public class BeDictionarydataAction extends ActionSupport{

	/** 
	* @Fields serialVersionUID : 序列号 
	*/ 
	private static final long serialVersionUID = 1L;

	@Resource
	private IBeDictionarydataService beDictionarydataService;

	
}
