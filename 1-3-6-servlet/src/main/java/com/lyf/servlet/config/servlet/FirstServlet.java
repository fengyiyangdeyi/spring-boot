package com.lyf.servlet.config.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: LYF
 * @Date: 2019/5/14 10:48
 */
@WebServlet(name = "firstServlet", urlPatterns = "/firstServlet")  //标记为servlet，以便启动器扫描。
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().append("firstServlet");
    }

}
