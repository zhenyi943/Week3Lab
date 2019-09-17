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
public class ArithmeticCalculatorSerlet extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request,response);
    }
    
     @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message ="---";
        String num1=request.getParameter("Fnum");
        String num2=request.getParameter("Snum");
        String operator=request.getParameter("operator");
        int a;
        int b;
        try {  
         Integer.parseInt(num1);
         //Integer.parseInt(num2);
         a=1;  
        } catch (NumberFormatException e) {  
         a=2;  
        } 
        try {  
         //Integer.parseInt(num1);
         Integer.parseInt(num2);
         b=1;  
        } catch (NumberFormatException e) {  
         b=2;  
        } 
        if (num1 == "" || num2 == ""){
            message = "Give two numbers.";
        } 
        else if (a==1 && b==1) {
           int number1 = Integer.parseInt(num1);
           int number2 = Integer.parseInt(num2);
           
           if (operator.equals("+")){
               int result=number1+number2;
               message = "Result: "+result;
           }
           else if (operator.equals("-")){
               int result=number1-number2;
               message = "Result: "+result;
           }
           else if (operator.equals("*")){
               int result=number1*number2;
               message = "Result: "+result;
           }
           else if (operator.equals("%")){
               int result=number1%number2;
               message = "Result "+result;
           }
        }
        else{
            message = "Invalid";
        }
        //create NewUser object
        //set attribute in request object
        //request.setAttribute("nw", age);//Stringname and object
        //forward to JSP
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request,response);
    }
 
     @Override
    public String getServletInfo() {
        return "Short description";
    }
}