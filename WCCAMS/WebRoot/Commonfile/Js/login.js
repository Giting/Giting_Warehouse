/** 
* @fileOverview 系统登录模块操作JS文件  
* @author <font color="red" size="5">fuchenggang</font>
* @version 0.1 
*/ 
$(function(){
	
	initFunction();
	
	//页面对象初始化方法
	var initFunction = function(){
		LoginObject.loginFunctin();
	}
	
	/** 
	* @author <font color="red" size="5">fuchenggang</font> 
	* @constructor LoginObject 
	* @description 一个登录对象的全部URL请求资源 
	* @param {Object} param 参数对象 
	*/ 
	var GlobalVariable ={
			loginUrl :"/sm/smUserAction.action",
			jumpPage :"Commonfile/Html/login.html"
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
		// 验证控件
		checkEdit:function(){
	        if (passSpace($('#login_userName').val()) == '') {
	            alert('用户名错误!');
	            $('#login_userName').focus();
	            return false;
	        }

	        if (passSpace($('#login_passWord').val()) == '') {
	            alert('密码错误!');
	            $('#login_passWord').focus();
	            return false;
	        }
	        
	        if (passSpace($('#login_communityName').val()) == '') {
	            alert('登录社区错误!');
	            $('#login_communityName').focus();
	            return false;
	        }
	        return true;
	    },
	    postFunction:function(){
	   	 	 //使用post请求
			 $.post(GlobalVariable.loginUrl,//Url地址
					param,//传递的参数
					function (data) {//服务器返回后执行的函数 参数 data保存的就是服务器发送到客户端的数据
					 	console.info(data);
						var member = eval("("+data+")");	//包数据解析为json 格式  
						console.info(member); 
						if(memer.result){
							document.location.href=GlobalVariable.jumpPage;
						}else{
						    alert(member.msg);
						    if(memer.result == 2){
						    	$('#login_userName').focus();
						    }
						    if(memer.result == 3){
						    	$('#login_passWord').focus();
						    }
						    if(memer.result == 4){
						    	$('#login_communityName').focus();
						    }
						}
					}
			   );
	    },
		loginFunctin:function(){
			 $('#btnLogin').click(
				function(){ 
				   if (this.checkEdit() == true) {
					 
					 //参数对象
					 var param = {
						username:this.username,
						password:this.password, 
						commonuser:this.commonuser 
					 };
					 
					 this.postFunction();
				   }
				}
			);
		}
	}

	
}