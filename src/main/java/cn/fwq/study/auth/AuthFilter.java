package cn.fwq.study.auth;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class AuthFilter implements Filter {


	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("filter init");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("do filter ....");
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp =(HttpServletResponse) response;
		HttpSession session = req.getSession();
		String path = req.getRequestURI();// 获得用户请求的URI
		System.out.println("请求URI = " + path);
		// 从session取得已经登录验证的凭证 我这里的demo用的是password来作为登录凭证
		String password = (String) session.getAttribute("password");

		if(path.endsWith("/index.jsp") ||
				path.endsWith("fwqstudy/") ||
				path.endsWith("/login.jsp") ||
				path.endsWith(".js") ||
				path.endsWith("/login")) {
			System.out.println("filter pass....");
			chain.doFilter(req, resp);
		} else {
			if (password == null || "".equals(password)){
				System.out.println("filter failed....");
				resp.sendRedirect("login.jsp");
			}else {
				System.out.println("filter pass....");
				chain.doFilter(req,resp);
			}
		}
	}

	public void destroy() {
		System.out.println("filter destroy");
	}
}
