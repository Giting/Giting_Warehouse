package com.giting.pmgm.acion;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.giting.be.service.IBeDictionaryclassService;
import com.giting.pmgm.service.IPmgmPartyService;
import com.opensymphony.xwork2.ActionSupport;
/**   
*    
* 项目名称：WCCAMS   
* 类名称：BeDictionaryclassAction   
* 类描述： 党员信息表对应的数据交换层
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-2 上午12:12:49   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
@Controller("pmgmPartyAction")
public class PmgmPartyAction extends ActionSupport{

	/** 
	* @Fields serialVersionUID : 序列号
	*/ 
	private static final long serialVersionUID = 1L;
	
	@Resource
	private IPmgmPartyService pmgmPartyService;

	public void setPmgmPartyService(IPmgmPartyService pmgmPartyService) {
		this.pmgmPartyService = pmgmPartyService;
	}
	
	
	
	
	
}
