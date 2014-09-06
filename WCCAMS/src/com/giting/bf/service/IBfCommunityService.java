package com.giting.bf.service;

import java.util.List;

import com.giting.entities.table.BfCommunity;
import com.giting.util.common.IBaseService;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：IBfCommunityDaoService   
* 类描述：   小区表业务层的接口设计
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-2 上午12:24:30   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
public interface IBfCommunityService extends IBaseService{
	/**
	 * 
	 * @author ad
	 * 描述:获得小区表中数据
	 * @date:2014年9月5日
	 * @param page
	 * @param row
	 * @return
	 */
	public List<BfCommunity> getAllCommunity(int page, int row);
}
