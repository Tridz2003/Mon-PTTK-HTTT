/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import dao.NhanVienDAO;
import dao.TKMatHangDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Date;
import model.NhanVien722;
import model.TKMatHang722;

/**
 *
 * @author ADMIN
 */
@WebServlet(name="ThongkeController", urlPatterns={"/ThongkeController"})
public class ThongkeController extends HttpServlet {
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    // Chuyển hướng đến trang GDDangNhap.jsp
        request.getRequestDispatcher("GDTKDTMatHang.jsp").forward(request, response);
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
        processRequest(request, response);
    }   

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        // Thêm logic thống kê
        String startDateStr = request.getParameter("start-date");
        String endDateStr = request.getParameter("end-date");

        // Gọi phương thức getTKMatHang() để lấy dữ liệu
        TKMatHangDAO tkMatHangDAO = new TKMatHangDAO();
        ArrayList<TKMatHang722> matHangList = tkMatHangDAO.getTKMatHang(startDateStr, endDateStr);
        double totalRevenue = 0;
        int totalQuantity = 0;
        for (TKMatHang722 matHang : matHangList) {
            totalRevenue += matHang.getTongtien();
            totalQuantity += matHang.getSoluongban();
        }      
        // Gửi dữ liệu đến GDTKDTMatHang.jsp
        request.setAttribute("matHangList", matHangList);
        request.setAttribute("totalRevenue", totalRevenue); // Gửi tổng doanh thu lên web
        request.setAttribute("totalQuantity", totalQuantity);
        request.setAttribute("startDateStr", startDateStr); // Thêm startDateStr
        request.setAttribute("endDateStr", endDateStr); // Thêm endDateStr
        request.getRequestDispatcher("GDTKDTMatHang.jsp").forward(request, response);      
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
