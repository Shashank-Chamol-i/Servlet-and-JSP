package com.Test01;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;

public class Program03 extends HttpServlet{
    @Override
protected void doPost(HttpServletRequest request , HttpServletResponse response)throws ServletException,IOException{
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<h2> User Successfully Registered </h2>");  
}
}
