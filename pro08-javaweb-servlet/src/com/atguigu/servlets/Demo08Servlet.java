package com.atguigu.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 胡金龙
 * @create 2022-03-16 11:35
 */
public class Demo08Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //服务器端内部进行重定向
        //req.getRequestDispatcher("demo09").forward(req,resp);
        //客户端重定向
        //resp.sendRedirect("demo09");
        HttpSession session = req.getSession();
        System.out.println(session.getId());
        session.setAttribute("uname","lina");
        req.getRequestDispatcher("demo09").forward(req,resp);
    }

    @Override
    //doGet方法
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
          //获取参数
//        String fname = req.getParameter("fanme");
//        //将参数打散为字节数组
//        byte [] bytes = fname.getBytes("ISO-8859-1");
//        //将字节数组重新组装成为字符串
//        fname  = new String(bytes, "UTF-8");
    }

    @Override
    //doPost方法
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
//        //设置编码只针对post方法并在所有参数获取前
//        req.setCharacterEncoding("UTF-8");
//        String fname = req.getParameter("fname");
//        //设置属性
//        req.setAttribute("fname",fname);
//        req.getAttribute("fname");
//        req.getParameter("fname");

    }
}
