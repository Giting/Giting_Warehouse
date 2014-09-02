package com.giting.be.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.giting.be.dao.IBeDictionaryclassDao;
import com.giting.util.common.BaseServiceImpl;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：BeDictionaryclassServiceImpl   
* 类描述：    字典类型表对应的业务层方法的实现类
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-1 下午8:06:59   
* 修改人：  
* 修改时间：   
* 修改备注：   
* @version    
*    
*/ 
@Service("beDictionaryclassService")
public class BeDictionaryclassServiceImpl extends BaseServiceImpl implements IBeDictionaryclassService {
	
	@Resource
	private IBeDictionaryclassDao beDictionaryclassDao;

	public void setBeDictionaryclassDao(IBeDictionaryclassDao beDictionaryclassDao) {
		this.beDictionaryclassDao = beDictionaryclassDao;
	}
	
	
}
