package com.giting.pm.service;

import java.sql.Timestamp;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.giting.entities.table.PmFamily;
import com.giting.exception.BaseDaoException;
import com.giting.pm.dao.IPmFamilyDao;
import com.giting.util.CheckCode;
import com.giting.util.UUIDutil;
import com.giting.util.common.BaseServiceImpl;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：BeDictionaryclassServiceImpl   
* 类描述：  家庭表对应的业务层方法的实现类
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-1 下午8:06:59   
* 修改人：  
* 修改时间：   
* 修改备注：   
* @version    
*    
*/ 
@Service("pmFamilyService")
public class PmFamilyServiceImpl extends BaseServiceImpl implements IPmFamilyService {
	
	@Resource
	private IPmFamilyDao pmFamilyDao;

	/**
	 * 
	 * 描述：新增家庭信息
	 * 作者：石超
	 * 日期 :2014-9-5 下午09:17:43
	 */
	@Override
	public Map<String,Object> addPmFamily(PmFamily pf) {
		//添加家庭信息
		pf.setPkId(UUIDutil.getUUID());
		pf.setIsDelete(false);
		pf.setCtTime( new Timestamp(System.currentTimeMillis()));
		boolean result = false;
		try {
			//保存家庭信息
			result = pmFamilyDao.save(pf);
		} catch (BaseDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result){
			return CheckCode.getAddMapSuccess();
		}else{
			return CheckCode.getAddMapError();
		}
		
	}
	 /**
	    * 
	    * 描述：删除家庭信息
	    * 作者：石超
	    * 日期 :2014-9-5 下午09:19:11
	    */
	@Override
	public Map<String,Object> deletePmFamily(String pkId) {
		boolean result = false;
		//实例化家庭信息实体
		PmFamily pf = new PmFamily();
		try {
			//根据主键查询家庭信息
			pf = (PmFamily)pmFamilyDao.getByPk(PmFamily.class, pkId);
			if(pf!=null){
				pf.setIsDelete(true);
				pf.setDtDate(new Timestamp(System.currentTimeMillis()));
                pmFamilyDao.update(pf);
				result = true;
				
			}
		} catch (BaseDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result){
			return CheckCode.getDeleteMapSuccess();
		}else{
			return CheckCode.getDeleteMapError();
		}
		
	}
	/**
	  * 
	  * 描述：修改家庭信息
	  * 作者：石超
	  * 日期 :2014-9-5 下午09:21:13
	  */
	@Override
	public Map<String,Object> updatePmFamily(PmFamily pf) {
		boolean result = false;
		try {
			//根据主键查询家庭信息
			PmFamily tmpPf = (PmFamily)pmFamilyDao.getByPk(PmFamily.class, pf.getPkId());
			if(tmpPf!=null){
				tmpPf.setDaFnumber(pf.getDaFnumber());
				tmpPf.setDaHouseheadName(pf.getDaHouseheadName());
				tmpPf.setFkFamilyStatusId(pf.getFkFamilyStatusId());
				tmpPf.setDaHomePhone(pf.getDaHomePhone());
				tmpPf.setDaCellPhone(pf.getDaCellPhone());
				tmpPf.setFkAccommodationTypeId(pf.getFkAccommodationTypeId());
				tmpPf.setDaHomeAddress(pf.getDaHomeAddress());
				tmpPf.setDaIppf(pf.getDaIppf());
				tmpPf.setFkHousingStatusId(pf.getFkHousingStatusId());
				tmpPf.setDaRoomNumber(pf.getDaRoomNumber());
				tmpPf.setDaLivingArea(pf.getDaLivingArea());
				tmpPf.setDaConstructionArea(pf.getDaConstructionArea());
				tmpPf.setDaFamilySize(pf.getDaFamilySize());
				tmpPf.setDaMan(pf.getDaMan());
				tmpPf.setDaWoman(pf.getDaWoman());
				tmpPf.setDaOutNumber(pf.getDaOutNumber());
				tmpPf.setDaRemark(pf.getDaRemark());
				tmpPf.setIsDelete(pf.getIsDelete());
				tmpPf.setDtDate(pf.getDtDate());
				tmpPf.setRkOrder(pf.getRkOrder());
				tmpPf.setCtTime(pf.getCtTime());
				pmFamilyDao.update(tmpPf);
				result = true;
			}
			
		} catch (BaseDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result){
			return CheckCode.getUpadteMapSuccess();
		}else{
			return CheckCode.getUpadteMapError();
		}
	}

}
