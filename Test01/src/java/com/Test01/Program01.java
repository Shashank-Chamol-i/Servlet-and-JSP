package com.Test01;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;
public class Program01 extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        System.out.println("This is doGet Method ");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> Using doGet method inside the Program01 class extending httpServlet class : <br>");
        out.println(new Date().toString());
        
        
    }
}
