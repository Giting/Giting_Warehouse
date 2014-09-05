package com.giting.pm.service;

import java.util.Map;

import com.giting.entities.table.PmFamily;
import com.giting.util.common.IBaseService;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：IBeDictionaryclassService   
* 类描述： 家庭表对应的业务层方法的接口设计
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-1 下午11:27:05   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
public interface IPmFamilyService extends IBaseService {
	/**
	 * 
	 * 描述：新增家庭信息
	 * 作者：石超
	 * 日期 :2014-9-5 下午09:17:43
	 */
   public Map<String,Object> addPmFamily(PmFamily pf);
   /**
    * 
    * 描述：删除家庭信息
    * 作者：石超
    * 日期 :2014-9-5 下午09:19:11
    */
   public Map<String,Object> deletePmFamily(String pkId);
   /**
    * 
    * 描述：修改家庭信息
    * 作者：石超
    * 日期 :2014-9-5 下午09:21:13
    */
   public Map<String,Object> updatePmFamily(PmFamily pf);
   
   
}
