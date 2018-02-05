package cn.fwq.study.servlet;

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
public class SelectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("111111111111111");
        try {
            req.setCharacterEncoding("UTF-8");
            resp.sendRedirect("/version.jsp");
            System.out.println("22222222222222222222222222222222");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
