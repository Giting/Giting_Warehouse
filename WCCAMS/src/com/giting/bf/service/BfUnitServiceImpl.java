package com.giting.bf.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.giting.bf.dao.IBfUnitDao;
import com.giting.util.common.BaseServiceImpl;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：BfUnitServiceImpl   
* 类描述：  单元表 对应的业务层方法的实现类
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-2 上午12:24:19   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
@Service("bfUnitService")
public class BfUnitServiceImpl extends BaseServiceImpl implements IBfUnitService{
	
	@Resource
	private IBfUnitDao bfUnitDao;

}
