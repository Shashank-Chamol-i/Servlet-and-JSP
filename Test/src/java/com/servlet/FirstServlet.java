/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
public class FirstServlet implements Servlet {
    
    // Life Cycle Method
    ServletConfig conf;
   
    public void init(ServletConfig conf)
    {
    this.conf = conf;
    System.out.println("Creating Objects....");
    }
  
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
       System.out.println("Servicing......");
       //Set the Content type of response
       res.setContentType("text/html");
       PrintWriter out = res.getWriter();
       out.println("<h2>This is my Method calling from Inside Servlet Method :</h2>");
       out.println("<h2>Today's date is "+new Date().toString()+"</h2>");
    }
   
    public void destroy()
    {
    System.out.println("Going to destroy Servlet Object....");
    }
    // Non Life Cycle Method
    
  
    public ServletConfig getServletConfig()
    {
        return this.conf;
    }
 
    public String getServletInfo()
    {
    return "This Servlet is created by a Programmer";
    }

    
}
