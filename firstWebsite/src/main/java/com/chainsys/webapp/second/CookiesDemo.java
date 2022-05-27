package com.chainsys.webapp.second;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CookiesDemo
 */
public class CookiesDemo extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesDemo() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
       Cookie[] allCookies =request.getCookies();
       if(allCookies ==null) {
           System.out.println("No cookies found");
           // TODO use logManager and log message instead if sysout.
           return;
       }
       int cookieLength = allCookies.length;
       for(int i=0;i<cookieLength;i++) {
           System.out.println(allCookies[i].getName()+"-"+allCookies[i].getValue());
       }
    }
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session =request.getSession(true); 
        Cookie firstCookie = new Cookie("Captain", "Kohli");
             firstCookie.setMaxAge(-1); // If value is less than zero then cookie will be deleted.
            //If the value is positive then the cookie will expire after the specified seconds.
             response.addCookie(firstCookie);
             Cookie secondCookie = new Cookie("Captain", "Messi");
         //    response.addCookie(22460*60);    
             secondCookie.setMaxAge(22460*60);
             Cookie thirdCookie = new Cookie("Dessert", "IceCream");
             response.addCookie(thirdCookie);    
             Cookie fourthCookie = new Cookie("Fruit", "Apple");
             response.addCookie(fourthCookie);    
    }
}