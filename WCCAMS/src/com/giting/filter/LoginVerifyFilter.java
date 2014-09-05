package com.giting.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**   
*    
* 项目名称：WCCAMS   
* 类名称：RightFilter   
* 类描述：使用filter过滤器实现登陆权限验证
* 创建人：fuchenggang@foxmail.com   
* 创建时间：2014-9-5 下午4:37:02   
* 修改人：  
* 修改时间：  
* 修改备注：   
* @version    
*    
*/ 
public class LoginVerifyFilter implements javax.servlet.Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
	    HttpServletResponse res = (HttpServletResponse) response;
	    
	    HttpSession session = req.getSession(true);
	    
	    //从session里取的用户名信息
	    String username = (String) session.getAttribute("username");
	    //判断如果没有取到用户信息,就跳转到登陆页面
	    if (username == null || "".equals(username)) {
	      //跳转到登陆页面
	      res.sendRedirect("http://"+req.getHeader("Host")+"/login.jsp");
	    }
	    else {
	      //已经登陆,继续此次请求
	      chain.doFilter(request,response);
	    }
	}

	@Override
	public void init(FilterConfig chain) throws ServletException {
		// TODO Auto-generated method stub

	}

}
