package com.giting.bf.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.giting.bf.dao.IBfRoomDao;
import com.giting.util.common.BaseServiceImpl;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：BfRoomServiceImpl   
* 类描述：   房间表对应的业务层方法的实现类
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-2 上午12:24:16   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
@Service("bfRoomService")
public class BfRoomServiceImpl extends BaseServiceImpl implements IBfRoomService{
	
	@Resource
	private IBfRoomDao bfRoomDao;

	
}
