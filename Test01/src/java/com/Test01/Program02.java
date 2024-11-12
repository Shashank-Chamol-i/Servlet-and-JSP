package com.Test01;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class Program02 extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.print("<h2>You have successfully registered !!</h2>");
    String name = request.getParameter("user_name");
    String pass = request.getParameter("user_password");
    String email = request.getParameter("user_email");
    String course = request.getParameter("user_course");
    String gender = request.getParameter("user_gender");
    String condition = request.getParameter("condition");
    
    if(condition!=null){
    if(condition.equals("checked")){
        out.println("<h2> Name : "+ name + "</h2>");
        out.println("<h2> Password : "+ pass + "</h2>");
        out.println("<h2> Email  : "+ email + "</h2>");
        out.println("<h2> Course : "+ course + "</h2>");
        out.println("<h2> Gender : "+ gender + "</h2>");
        
        RequestDispatcher rd = request.getRequestDispatcher("success");
        rd.forward(request, response);
        
    }else{
        out.print("<h2>Terms and Condition not accepted...</h2>");
    }
    }else{
        out.print("<h2>Terms and Condition not accepted...</h2>");
        
        RequestDispatcher rd = request.getRequestDispatcher("index.html");
        rd.include(request,response);
    }
    
    
    }
    
}
