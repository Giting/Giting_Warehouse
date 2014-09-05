package com.giting.pm.service;

import java.util.Map;

import com.giting.entities.table.PmPopulationinformation;
import com.giting.util.common.IBaseService;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：IBeDictionaryclassService   
* 类描述：  人口信息表对应的业务层方法的接口设计
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-1 下午11:27:05   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
public interface IPmPopulationinformationService extends IBaseService {
	/**
	 * 
	 * 描述：新增人口信息
	 * 作者：石超
	 * 日期 :2014-9-5 下午10:48:26
	 */
     public Map<String,Object> addPmPopulationinformation(PmPopulationinformation pp,String pmFamilyId);
     /**
      * 
      * 描述：删除人口信息
      * 作者：石超
      * 日期 :2014-9-5 下午10:49:14
      */
     public Map<String,Object> deletePmPopulationinformation(String pkId);
     /**
      * 
      * 描述：修改人口信息
      * 作者：石超
      * 日期 :2014-9-5 下午10:49:50
      */
     public Map<String,Object> updatePmPopulationinformation(PmPopulationinformation pp);
}
