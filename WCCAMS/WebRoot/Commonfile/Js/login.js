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
		username:$("#login_userName").val(),
		password:$("#login_passWord").val(),
		commonuser:$("#login_communityName").val(),
		loginFunctin:function(param){
			 $('#btnLogin').click(
					 //参数对象
					 var param = {
						username:this.username,
						password:this.password, 
						commonuser:this.commonuser 
					 }
					 //使用post请求
					 $.post(GlobalVariable.loginUrl,//Url地址
							param,//传递的参数
							function (data) {//服务器返回后执行的函数 参数 data保存的就是服务器发送到客户端的数据
							 	console.info(data);
								var member = eval("("+data+")");	//包数据解析为json 格式  
								console.info(member); 
								memer.result
							}
					 ); 
			 );
		}
	}
	
	//页面对象初始化方法
	var initFunction = function(){
		LoginObject.loginFunctin();
	}
	
}