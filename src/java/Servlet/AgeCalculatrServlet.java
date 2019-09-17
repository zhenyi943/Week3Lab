package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 797494
 */
public class AgeCalculatrServlet extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message ="---";
        String nextage=request.getParameter("userage");
        int a;
        try {  
         Integer.parseInt(nextage);  
         a=1;  
        } catch (NumberFormatException e) {  
         a=2;  
        } 
        if (nextage == ""){
            message = "You must give your current age.";
        } 
        else if (a==1) {
           int age = Integer.parseInt(nextage);
           age++;
           message = "Your age next birthday will be "+age;
        }
        else{
            message = "You must enter a number.";
        }
  
        
        
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
    }


    @Override
    public String getServletInfo() {
        return "Description";
    }// </editor-fold>

}
