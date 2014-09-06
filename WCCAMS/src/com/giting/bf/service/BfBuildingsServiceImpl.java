package com.giting.bf.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.giting.bf.dao.IBfBuildingsDao;
import com.giting.exception.BaseDaoException;
import com.giting.util.common.BaseServiceImpl;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：BfBuildingsServiceImpl   
* 类描述：   楼栋表对应的业务层方法的实现类
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-2 上午12:24:09   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
@Service("bfBuildingsService")
public class BfBuildingsServiceImpl extends BaseServiceImpl implements IBfBuildingsService{
	
	@Resource
	private IBfBuildingsDao bfBuildingsDao;

	@Override
	/**
	 * 
	 * @author liuyaru
	 * 描述:分页获得楼栋表中数据
	 * @date:2014年9月5日
	 * @param page
	 * @param row
	 * @return
	 */
	public List getAllBuildingInfo(int page, int row) {
		List buildingList = new ArrayList<>();
		String hql = "from BfBuildings where 1 = 1";
		try {
			buildingList = bfBuildingsDao.query(page, row, hql);
		} catch (BaseDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return buildingList;
	}

	
}
