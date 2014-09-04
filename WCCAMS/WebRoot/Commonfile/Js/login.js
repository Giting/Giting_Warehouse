/** 
* @fileOverview 系统登录模块操作JS文件  
* @author <font color="red" size="5">fuchenggang</font>
* @version 0.1 
*/ 
$(function(){
	
	/** 
	* @author <font color="red" size="5">fuchenggang</font> 
	* @constructor LoginObject 
	* @description 一个登录对象的全部URL请求资源 
	* @param {Object} param 参数对象 
	*/ 
	var GlobalVariable ={
			loginUrl :""
	}
	
	/** 
	* @author <font color="red" size="5">fuchenggang</font> 
	* @constructor LoginObject 
	* @description 一个登录对象 
	* @param {Object} param 参数对象 
	*/ 
	var LoginObject={
		username ="",
		password = "",
		commonuser = "",
		loginFunctin : function(param) {
			 $('#btnLogin').click(
					 $.post(GlobalVariable.loginUrl,param,
								function (data) {
								    if (data == '验证码错误') {
								        alert('验证码错误');
								        changeValidateCode();
								        return;
								    }
								    
								    if (data == '') {
								        alert('用户名或密码错误');
								        changeValidateCode();
								        return;
								    }

								    var d = $.evalJSON(data);
								    if (d == null || d == undefined) {
								        alert('登陆失败');
								        changeValidateCode();
								        return;
								    }

								    try {

								        var etime = d.etime;
								        var exp = new Date();
								        exp.setTime(exp.getTime()+ etime* 60 * 1000);
								        document.cookie =  ("uc")+ "="+ encodeURIComponent(data)+ ";expires="+ exp.toGMTString()+ ";path=/";
								        document.location.href = p.mainUrl;
								    } catch (err) {
								        alert('本地存储失败');
								    }
								}); 
			 );
		},
	} 
	
}