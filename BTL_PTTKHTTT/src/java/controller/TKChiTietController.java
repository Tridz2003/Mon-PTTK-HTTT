/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import dao.ChiTietMatHangDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.TKCTMatHang722;

/**
 *
 * @author ADMIN
 */
@WebServlet(name="TKChiTietController", urlPatterns={"/TKChiTietController"})
public class TKChiTietController extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TKChiTietController</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TKChiTietController at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String idStr = request.getParameter("id");
        String startDateStr = request.getParameter("startDate"); // Nhận startDate
        String endDateStr = request.getParameter("endDate"); // Nhận endDate
        String tenMatHang = request.getParameter("ten"); // Nhận tên mặt hàng

        int id = Integer.parseInt(idStr);

        // Gọi phương thức để lấy thông tin chi tiết mặt hàng theo ID
        ChiTietMatHangDAO chiTietMatHangDAO = new ChiTietMatHangDAO();
        ArrayList<TKCTMatHang722> chiTietList = chiTietMatHangDAO.getCTMatHang(id, startDateStr, endDateStr);

        // Gửi dữ liệu đến GDTKCTMatHang.jsp
        request.setAttribute("chiTietList", chiTietList);
        request.setAttribute("startDateStr", startDateStr); // Gửi startDateStr
        request.setAttribute("endDateStr", endDateStr); // Gửi endDateStr
        request.setAttribute("tenMatHang", tenMatHang); // Gửi tên mặt hàng
        request.getRequestDispatcher("GDTKCTMatHang.jsp").forward(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
