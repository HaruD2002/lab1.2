/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author macbookair
 */
public class ComputeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            //float fNum = Float.parseFloat(firstNum);
            PrintWriter out = response.getWriter();
          
            String first = request.getParameter("First");         
            float fnum = Float.parseFloat(first);
            
            String second = request.getParameter("Second");
            float snum = Float.parseFloat(second);   
            
            String init_result  = request.getParameter("Result");
            float result = Float.parseFloat(init_result);          
            
            String operators = request.getParameter("operators");
            
           
            switch(operators){
                case "+":
                    result = fnum + snum;
                    break;
                case "-":
                    result = fnum - snum;
                    break;
                case "*":
                    result = fnum * snum;
                    break;    
               case "/":
                    result = fnum / snum;
                    break;
            }
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");                 
            out.println("</head>");
            out.println("<body>");
            out.println("<table");
            out.println("<tr>");
            out.println("<td>First</td>");
            out.println("<td><input readonly type = \"summit\" value= " +fnum +"></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td> Second</td><td><input readonly type=\"text\" value= "+snum+"> </td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Operator</td>");
            out.println("<td>");
            out.println("<select disabled>");
            out.println("<option>"+operators+"</option>");
            out.println("<option>"+operators+"</option>");
            out.println("<option>"+operators+"</option>");
            out.println("<option>"+operators+"</option>");
            out.println("</select>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr><td></td> <td><input type=\"text\" value = \"=\" readonly</td></tr>");
            out.println("<tr><td>Result</td><td><input readonly type = \"text\" name= \"Result\" value="+result+"></td></tr>");
            out.println("</table>");
            out.println("<br><a href = \"index.html\"><input type= \"button\" value=\"Return\"/> </a> ");
            out.println("</body>");
            out.println("</html>");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
