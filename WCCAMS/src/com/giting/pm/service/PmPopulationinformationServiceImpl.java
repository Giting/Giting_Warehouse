package com.giting.pm.service;

import java.sql.Timestamp;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.giting.be.dao.IBeDictionaryclassDao;
import com.giting.entities.table.PmFamily;
import com.giting.entities.table.PmPopulationinformation;
import com.giting.exception.BaseDaoException;
import com.giting.pm.dao.IPmFamilyDao;
import com.giting.pm.dao.IPmPopulationinformationDao;
import com.giting.util.CheckCode;
import com.giting.util.UUIDutil;
import com.giting.util.common.BaseServiceImpl;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：BeDictionaryclassServiceImpl   
* 类描述：  人口信息表对应的业务层方法的实现类
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-1 下午8:06:59   
* 修改人：  
* 修改时间：   
* 修改备注：   
* @version    
*    
*/ 
@Service("pmPopulationinformationService")
public class PmPopulationinformationServiceImpl extends BaseServiceImpl implements IPmPopulationinformationService {
	
	@Resource
	private IPmPopulationinformationDao pmPopulationinformationDao;
	@Resource
	private IPmFamilyDao pmFamilyDao;
	/**
	 * 
	 * 描述：新增人口信息
	 * 作者：石超
	 * 日期 :2014-9-5 下午10:48:26
	 */
	@Override
	public Map<String, Object> addPmPopulationinformation(
			PmPopulationinformation pp,String pmFamilyId) {
		boolean result = false;
		//根据家庭主键查询家庭信息
		PmFamily pf = new PmFamily();
		try {
			pf = (PmFamily)pmFamilyDao.getByPk(PmFamily.class, pmFamilyId);
		} catch (BaseDaoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		pp.setPkId(UUIDutil.getUUID());
		pp.setPmFamily(pf);
		pp.setIsDelete(false);
		pp.setCtTime(new Timestamp(System.currentTimeMillis()));
		try {
			//保存家庭信息
			result = pmPopulationinformationDao.save(pp);
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
     * 描述：删除人口信息
     * 作者：石超
     * 日期 :2014-9-5 下午10:49:14
     */
	@Override
	public Map<String, Object> deletePmPopulationinformation(String pkId) {
		boolean result = false;
		//实例化人口信息实体
		PmPopulationinformation pp = new PmPopulationinformation();
		try {
			//根据主键查询人口信息
			pp = (PmPopulationinformation)pmPopulationinformationDao
			                           .getByPk(PmPopulationinformation.class, pkId);
			if(pp!=null){
				pp.setIsDelete(true);
				pp.setDtDate(new Timestamp(System.currentTimeMillis()));
				pmPopulationinformationDao.update(pp);
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
     * 描述：修改人口信息
     * 作者：石超
     * 日期 :2014-9-5 下午10:49:50
     */
	@Override
	public Map<String, Object> updatePmPopulationinformation(
			PmPopulationinformation pp) {
		boolean result = false;
		try {
			//根据主键查询人口信息
			PmPopulationinformation tmpPp = (PmPopulationinformation)pmPopulationinformationDao
			            .getByPk(PmPopulationinformation.class, pp.getPkId());
			if(tmpPp!=null){
				tmpPp.setDaName(pp.getDaName());
				tmpPp.setDaIdCard(pp.getDaIdCard());
				tmpPp.setDaBirthDate(pp.getDaBirthDate());
				tmpPp.setFkAccountTypeId(pp.getFkAccountTypeId());
				tmpPp.setFkSexId(pp.getFkSexId());
				tmpPp.setFkMovedId(pp.getFkMovedId());
				tmpPp.setFkHouseRelationId(pp.getFkHouseRelationId());
				tmpPp.setFkNationalId(pp.getFkNationalId());
				tmpPp.setFkEducationId(pp.getFkEducationId());
				tmpPp.setFkPersonnelCategoryId(pp.getFkPersonnelCategoryId());
				tmpPp.setDaWorkUnits(pp.getDaWorkUnits());
				tmpPp.setFkMaritalStatusId(pp.getFkMaritalStatusId());
				tmpPp.setDaMaritalDate(pp.getDaMaritalDate());
				tmpPp.setFkPoliticalAffiliationId(pp.getFkPoliticalAffiliationId());
				tmpPp.setFkVeteranStatusId(pp.getFkVeteranStatusId());
				tmpPp.setDaDomicile(pp.getDaDomicile());
				tmpPp.setDaBirthplace(pp.getDaBirthplace());
				tmpPp.setDaCurrentAddress(pp.getDaCurrentAddress());
				tmpPp.setFkHealthStatusId(pp.getFkHealthStatusId());
				tmpPp.setDaWhetherOut(pp.getDaWhetherOut());
				tmpPp.setDaIntoComDate(pp.getDaIntoComDate());
				tmpPp.setFkUnemploymentId(pp.getFkUnemploymentId());
				tmpPp.setFkDisabilityRatingId(pp.getFkDisabilityRatingId());
				tmpPp.setFkDisadvantagedGroupsId(pp.getFkDisadvantagedGroupsId());
				tmpPp.setFkDemographicId(pp.getFkDemographicId());
				tmpPp.setFkReligionId(pp.getFkReligionId());
				tmpPp.setDaOnechildNumber(pp.getDaOnechildNumber());
				tmpPp.setFkChildBonusId(pp.getFkChildBonusId());
				tmpPp.setDaPensionInsurance(pp.getDaPensionInsurance());
				tmpPp.setDaMedicalInsurance(pp.getDaMedicalInsurance());
				tmpPp.setDaOtherInfsurance(pp.getDaOtherInfsurance());
				tmpPp.setDaSocieties(pp.getDaSocieties());
				tmpPp.setDaCommunitySchool(pp.getDaCommunitySchool());
				tmpPp.setFkEmployeesId(pp.getFkEmployeesId());
				tmpPp.setDaLivingAlone(pp.getDaLivingAlone());
				tmpPp.setDaRemark(pp.getDaRemark());
				tmpPp.setFkPopulationStatusId(pp.getFkPopulationStatusId());
				tmpPp.setDaLogoutDate(pp.getDaLogoutDate());
				tmpPp.setFkLogoutId(pp.getFkLogoutId());
				tmpPp.setDaLogoutRemark(pp.getDaLogoutRemark());
				tmpPp.setDaImgUrl(pp.getDaImgUrl());
				tmpPp.setIsDelete(pp.getIsDelete());
				tmpPp.setDtDate(pp.getDtDate());
				tmpPp.setRkOrder(pp.getRkOrder());
				tmpPp.setCtTime(pp.getCtTime());
				pmPopulationinformationDao.update(tmpPp);
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
