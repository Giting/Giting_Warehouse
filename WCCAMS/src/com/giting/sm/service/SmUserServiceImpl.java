package com.giting.sm.service;

import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.giting.bf.dao.IBfAcommunityDao;
import com.giting.entities.table.SmAnnouncement;
import com.giting.entities.table.SmCommunityusers;
import com.giting.entities.table.SmUser;
import com.giting.sm.dao.ISmUserDao;
import com.giting.util.CheckCode;
import com.giting.util.common.BaseServiceImpl;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：BfAcommunityServiceImpl   
* 类描述：用户表对应的业务层方法的实现类
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-2 上午12:24:06   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
@Service("smUserService")
public class SmUserServiceImpl extends BaseServiceImpl implements ISmUserService{
	
	@Resource
	private ISmUserDao smUserDao;

	@Override
	public Map<String,Object> getSmUserState(String userName, String passWord, String commonuser) throws Exception {
		
		//参数合法性验证
		if(userName == null || "".equals(userName.trim())){
			return null;
		}
		if(passWord == null || "".equals(passWord.trim())){
			return null;
		}
		if(commonuser == null || "".equals(commonuser.trim())){
			return null;
		}
		
		
		//登录业务逻辑
		int number = smUserDao.getSmUserByCommonuser(userName, passWord,commonuser);//返回实体的个数
		if(number != 0){
			return CheckCode.getLoginMapSuccess();
		}
		int count = 0;
		count =smUserDao.getSmUserByName(userName);
		if(count == 0){
			return CheckCode.getLoginMapUserError();
		}
		count =smUserDao.getSmUserByPassWord(userName, passWord);
		if(count == 0){
			return CheckCode.getLoginMapPassWordError();
		}
		
		return CheckCode.getLoginMapCommonuserNameError();
	}

	@Override
	public SmUser getSmUser(String userName, String passWord, String commonuser) throws Exception {
		//参数合法性验证
		if(userName == null || "".equals(userName.trim())){
			return null;
		}
		if(passWord == null || "".equals(passWord.trim())){
			return null;
		}
		if(commonuser == null || "".equals(commonuser.trim())){
			return null;
		}

		SmUser smUserm = smUserDao.getSmUser(userName, passWord,commonuser);//返回实体
		return smUserm;
	}
	
	
	
}
