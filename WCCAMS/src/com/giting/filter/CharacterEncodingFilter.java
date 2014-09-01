/**   
 * @Title: CharacterEncodingFilter.java 
 * @Package com.company.filter 
 * @Description: 字符编码过滤器 
 * @author ZhangHua
 * @date 2014年5月5日 上午11:57:20 
 * @version V1.0   
 */
package com.giting.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * @ClassName: CharacterEncodingFilter
 * @Description: 字符编码过滤器
 * @author ZhangHua
 * @date 2014年5月5日 上午11:57:20
 * 
 */
public class CharacterEncodingFilter implements Filter {

	protected String encoding = null; // 声明编码变量

	public void init(FilterConfig filterConfig) throws ServletException {
		this.encoding = filterConfig.getInitParameter("encoding");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding(encoding);
		response.setContentType("text/html;charset=" + encoding);
		chain.doFilter(request, response);
	}
	
	public void destroy(){
		  
	}
}
