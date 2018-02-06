package cn.fwq.study.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/******************************************************
 ****** @ClassName   : SelectServlet.java                                            
 ****** @author      : milo ^ ^                     
 ****** @date        : 2018 02 05 16:06     
 ****** @version     : v1.0.x                      
 *******************************************************/
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
      String username = req.getParameter("username");
      String password = req.getParameter("password");
        System.out.println("username = " + username);
        System.out.println("password = " + password);
      if ("milo".equals(username)&&"123".equals(password)){
          req.getSession().setAttribute("password","123");
          try {
              req.getRequestDispatcher("/user/select").forward(req,resp);
          } catch (Exception e) {
              e.printStackTrace();
          }
      }else{
          try {
              req.setAttribute("error","密码错误");
              req.getRequestDispatcher("/login.jsp").forward(req,resp);
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
    }
}
