package com.giting.bf.service;

import java.util.List;

import com.giting.util.common.IBaseService;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：IBfBuildingsDaoService   
* 类描述：   楼栋表业务层的接口设计
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-2 上午12:24:26   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
public interface IBfBuildingsService extends IBaseService{
	/**
	 * 
	 * @author liuyaru
	 * 描述:分页获得楼栋表中数据
	 * @date:2014年9月5日
	 * @param page
	 * @param row
	 * @return
	 */
	List getAllBuildingInfo(int page, int row);
}
