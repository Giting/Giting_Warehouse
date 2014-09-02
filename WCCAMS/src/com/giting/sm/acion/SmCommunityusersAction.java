package com.giting.sm.acion;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.giting.sm.service.ISmAnnouncementService;
import com.giting.sm.service.ISmCommunityusersService;
import com.opensymphony.xwork2.ActionSupport;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：BfAcommunityAction   
* 类描述：   社区用户关联表对应的数据交换层
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-2 上午12:23:08   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
@Controller("smCommunityusersAction")
public class SmCommunityusersAction extends ActionSupport{

	/** 
	* @Fields serialVersionUID : 序列号 
	*/ 
	private static final long serialVersionUID = 1L;

	@Resource
	private ISmCommunityusersService smCommunityusersService;

	public void setSmCommunityusersService(ISmCommunityusersService smCommunityusersService) {
		this.smCommunityusersService = smCommunityusersService;
	}
	
	
}
