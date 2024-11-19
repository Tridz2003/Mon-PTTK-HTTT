package controller;

import dao.NhanVienDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.NhanVien722;

/**
 *
 * @author ADMIN
 */
@WebServlet(name="NhanVienController", urlPatterns={"/NhanVienController"})
public class NhanVienController extends HttpServlet {
   
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
        String username = request.getParameter("TenDangNhap");
        String password = request.getParameter("MatKhau");

        NhanVien722 nhanVien = new NhanVien722();
        nhanVien.setTendangnhap(username);
        nhanVien.setMatkhau(password);

        NhanVienDAO nhanVienDAO = new NhanVienDAO();
        boolean isLoginSuccessful = nhanVienDAO.isLogin(nhanVien);

        if (isLoginSuccessful) {
            // Nếu đăng nhập thành công, chuyển hướng đến GDThongKe.jsp
            request.getRequestDispatcher("GDQuanLi.jsp").forward(request, response);
        } else {
            // Nếu đăng nhập không thành công, quay lại GDDangNhap.jsp
            request.getRequestDispatcher("GDDangNhap.jsp").forward(request, response);
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
