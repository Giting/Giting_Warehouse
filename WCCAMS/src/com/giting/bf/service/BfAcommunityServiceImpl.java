package com.giting.bf.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.giting.bf.dao.IBfAcommunityDao;
import com.giting.util.common.BaseServiceImpl;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：BfAcommunityServiceImpl   
* 类描述：   社区表对应的业务层方法的实现类
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-2 上午12:24:06   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
@Service("bfAcommunityService")
public class BfAcommunityServiceImpl extends BaseServiceImpl implements IBfAcommunityService{
	
	@Resource
	private IBfAcommunityDao bfAcommunityDao;

	public void setBfAcommunityDao(IBfAcommunityDao bfAcommunityDao) {
		this.bfAcommunityDao = bfAcommunityDao;
	}
	
	
}
