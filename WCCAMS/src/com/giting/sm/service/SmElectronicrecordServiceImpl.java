package com.giting.sm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.giting.bf.dao.IBfAcommunityDao;
import com.giting.sm.dao.ISmElectronicrecordDao;
import com.giting.util.common.BaseServiceImpl;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：BfAcommunityServiceImpl   
* 类描述：   电子档案记录表表对应的业务层方法的实现类
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-2 上午12:24:06   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
@Service("smElectronicrecordService")
public class SmElectronicrecordServiceImpl extends BaseServiceImpl implements ISmElectronicrecordService{
	
	@Resource
	private ISmElectronicrecordDao smElectronicrecordDao;

}
