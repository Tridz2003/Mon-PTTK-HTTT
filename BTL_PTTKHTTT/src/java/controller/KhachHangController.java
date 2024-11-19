/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dao.DAO;
import dao.KhachHangDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.KhachHang722;

/**
 *
 * @author ADMIN
 */
@WebServlet(name="KhachHangController", urlPatterns={"/KhachHangController"})
public class KhachHangController extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        // Chuyển hướng đến trang GDDangNhap.jsp
        request.getRequestDispatcher("GDDangNhap.jsp").forward(request, response);
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
        // Lấy dữ liệu từ request và tạo đối tượng KhachHang
        String ten = request.getParameter("Ten");
        String tendangnhap = request.getParameter("Tendangnhap");
        String matkhau = request.getParameter("Matkhau");
        String diachi = request.getParameter("Diachi");
        String email = request.getParameter("Email");
        String sodienthoai = request.getParameter("Sodienthoai");
        String ghichu = request.getParameter("Ghichu");

        KhachHang722 khachHang = new KhachHang722(ten, tendangnhap, matkhau, diachi, email, sodienthoai, ghichu);
       
        // Xử lý đối tượng KhachHang (lưu vào cơ sở dữ liệu, v.v.))
        KhachHangDAO x = new KhachHangDAO();
        int res = x.saveKhachHang(khachHang);

        // Chuyển hướng đến trang thành công hoặc thông báo
        // Chuyển hướng đến trang thành công hoặc thông báo
        if (res == 0) {
            request.setAttribute("successMessage", "Đăng ký thành công");
            request.getRequestDispatcher("GDDangKi.jsp").forward(request, response);
        } else if (res == 1) {
            request.setAttribute("errorMessage", "Tên đăng nhập đã tồn tại");
            request.getRequestDispatcher("GDDangKi.jsp").forward(request, response);
        } else if (res == 2) {
            request.setAttribute("errorMessage", "Số điện thoại đã tồn tại");
            request.getRequestDispatcher("GDDangKi.jsp").forward(request, response);
        }
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
