<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng Ký</title>
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
            .register-container {
                background-color: white;
                padding: 20px;
                border-radius: 5px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }
            h2 {
                text-align: center;
            }
            input[type="text"], input[type="password"], input[type="email"], input[type="tel"] {
                width: 100%;
                padding: 10px;
                margin: 10px 0;
                border: 1px solid #ccc;
                border-radius: 4px;
            }
            input[type="submit"] {
                background-color: #4CAF50;
                color: white;
                padding: 10px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                width: 100%;
                margin-top: 10px;
            }
            input[type="submit"]:hover {
                background-color: #45a049;
            }
        </style>
        <script>
            // Hàm để hiển thị alert khi có thông báo thành công
            function showSuccessMessage() {
                var successMessage = '<%= request.getAttribute("successMessage") %>';
                if (successMessage) {
                    alert(successMessage);
                }
            }
        </script>
    </head>
    <body onload="showSuccessMessage()">
        <div class="register-container">
            <h2>Đăng Ký</h2>
            <% if (request.getAttribute("errorMessage") != null) { %>
                <div style="color: red; text-align: center;">
                    <%= request.getAttribute("errorMessage") %>
                </div>
            <% } %>
            <form action="KhachHangController" method="post">
                <input type="text" name="Ten" placeholder="Tên" required>
                <input type="text" name="Tendangnhap" placeholder="Tên đăng nhập" required>
                <input type="password" name="Matkhau" placeholder="Mật khẩu" required>
                <input type="text" name="Diachi" placeholder="Địa chỉ" required>
                <input type="email" name="Email" placeholder="Email" required>
                <input type="text" name="Sodienthoai" placeholder="Số điện thoại" required>
                <input type="text" name="Ghichu" placeholder="Ghi chú" required>
                <input type="submit" value="Đăng Ký">
            </form>
        </div>
    </body>
</html>