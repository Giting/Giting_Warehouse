package com.giting.be.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.giting.be.dao.IBeDictionarydataDao;
import com.giting.util.common.BaseServiceImpl;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：BeDictionarydataServiceImpl   
* 类描述：字典数据表业务层的实现类   
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-1 下午11:27:01   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
@Service("beDictionarydataService")
public class BeDictionarydataServiceImpl extends BaseServiceImpl implements IBeDictionarydataService{
	
	/** 
	* @Fields beDictionarydataDao : TODO(用一句话描述这个变量表示什么) 
	*/ 
	@Resource
	private IBeDictionarydataDao beDictionarydataDao;

	public void setBeDictionarydataDao(IBeDictionarydataDao beDictionarydataDao) {
		this.beDictionarydataDao = beDictionarydataDao;
	}
	
	
}
