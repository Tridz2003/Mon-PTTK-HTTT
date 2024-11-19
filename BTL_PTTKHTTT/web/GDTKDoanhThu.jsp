<%-- 
    Document   : GDThongKe
    Created on : Nov 6, 2024, 8:55:56 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thống Kê</title>
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
            .button-container {
                text-align: center;
                display: flex;
                flex-direction: column; /* Đặt các button theo chiều dọc */
                justify-content: center;
                align-items: center;
                background-color: white; /* Màu nền cho khung */
                padding: 20px;
                border-radius: 5px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }
            button {
                background-color: #4CAF50;
                color: white;
                padding: 15px; /* Đặt padding để button có cùng diện tích */
                border: none;
                border-radius: 4px;
                cursor: pointer;
                width: 200px; /* Đặt chiều rộng cố định cho button */
                margin: 10px 0; /* Khoảng cách giữa các button */
            }
            button:hover {
                background-color: #45a049;
            }
        </style>
    </head>
    <body>
        <div class="button-container">
            <form action="GDChonThoiGian.jsp" method="get">
                <button type="submit">Mặt hàng</button>
            </form>
            <button type="submit">Khách hàng</button>
        </div>
    </body>
</html>
