package com.giting.pmgm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.giting.be.dao.IBeDictionaryclassDao;
import com.giting.pmgm.dao.IPmgmBranchactivitiesDao;
import com.giting.util.common.BaseServiceImpl;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：BeDictionaryclassServiceImpl   
* 类描述： 党支部活动表对应的业务层方法的实现类
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-1 下午8:06:59   
* 修改人：  
* 修改时间：   
* 修改备注：   
* @version    
*    
*/ 
@Service("pmgmBranchactivitiesService")
public class PmgmBranchactivitiesServiceImpl extends BaseServiceImpl implements IPmgmBranchactivitiesService {
	
	@Resource
	private IPmgmBranchactivitiesDao pmgmBranchactivitiesDao;

	public void setPmgmBranchactivitiesDao(IPmgmBranchactivitiesDao pmgmBranchactivitiesDao) {
		this.pmgmBranchactivitiesDao = pmgmBranchactivitiesDao;
	}
	
}
