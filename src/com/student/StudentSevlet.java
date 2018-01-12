package com.student;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;


@WebServlet("/list.do")
public class StudentSevlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getMethod().equalsIgnoreCase("get")){
            Connection connection = MyDbUtil.getConnection();
            String sql = "SELECT sno,sname,ssex,sage,sbirthday,clazz FROM student";
            List<Student> list = MyDbUtil.executeQuery(connection,Student.class,sql);
            JsonUtil.printByJSON(resp,list);

        }else {
            System.out.println();

        }
    }
}
