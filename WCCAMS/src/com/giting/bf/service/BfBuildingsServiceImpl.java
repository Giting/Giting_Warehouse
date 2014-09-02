package com.giting.bf.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.giting.bf.dao.IBfBuildingsDao;
import com.giting.util.common.BaseServiceImpl;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：BfBuildingsServiceImpl   
* 类描述：   楼栋表对应的业务层方法的实现类
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-2 上午12:24:09   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
@Service("bfBuildingsService")
public class BfBuildingsServiceImpl extends BaseServiceImpl implements IBfBuildingsService{
	
	/** 
	* @Fields bfBuildingsDao : TODO(用一句话描述这个变量表示什么) 
	*/ 
	@Resource
	private IBfBuildingsDao bfBuildingsDao;

	
}
