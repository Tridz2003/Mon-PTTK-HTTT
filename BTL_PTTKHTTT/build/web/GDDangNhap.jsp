<%-- 
    Document   : login
    Created on : Nov 6, 2024, 8:54:07 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng Nhập</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f2f2f2;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
            }
            .login-container {
                background-color: white;
                padding: 20px;
                border-radius: 5px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }
            h2 {
                text-align: center;
            }
            input[type="text"], input[type="password"] {
                width: 100%;
                padding: 10px;
                margin: 10px 0;
                border: 1px solid #ccc;
                border-radius: 4px;
            }
            input[type="submit"], .register-button {
                background-color: #4CAF50;
                color: white;
                padding: 10px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                width: 100%;
                margin-top: 10px;
            }
            input[type="submit"]:hover, .register-button:hover {
                background-color: #45a049;
            }
            .register-button {
                background-color: #008CBA; /* Màu cho nút Đăng ký */
            }
        </style>
    </head>
    <body>
        <div class="login-container">
            <h2>Đăng Nhập</h2>
            <form action="NhanVienController" method="post">
                <input type="text" name="TenDangNhap" placeholder="Tên đăng nhập" required>
                <input type="password" name="MatKhau" placeholder="Mật khẩu" required>
                <input type="submit" value="Đăng Nhập">
            </form>
            <form action="GDDangKi.jsp" method="get">
                <input type="submit" class="register-button" value="Đăng Ký">
            </form>
        </div>
    </body>
</html>
