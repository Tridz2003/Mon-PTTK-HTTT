<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.TKCTMatHang722"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Chi Tiết Mặt Hàng</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            display: flex;
            flex-direction: column;
            align-items: center;
            padding: 20px;
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        table {
            width: 80%;
            border-collapse: collapse;
            margin: 0 auto;
            background-color: white;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
    </style>
</head>
<body>
    <h2>Chi Tiết Mặt Hàng</h2>
    <p>Ngày bắt đầu: <%= request.getAttribute("startDateStr") %></p>
    <p>Ngày kết thúc: <%= request.getAttribute("endDateStr") %></p>
    <p><strong>Tên mặt hàng:</strong> <%= request.getAttribute("tenMatHang") %></p> <!-- Hiển thị tên mặt hàng -->

    <table>
        <tr>
            <th>Tên Khách Hàng</th>
            <th>ID Hóa Đơn</th>
            <th>Ngày Bán</th>
            <th>Số Lượng</th>
            <th>Tổng thu</th>
        </tr>
        <%
            ArrayList<TKCTMatHang722> chiTietList = (ArrayList<TKCTMatHang722>) request.getAttribute("chiTietList");
            if (chiTietList != null) {
                for (TKCTMatHang722 chiTiet : chiTietList) {
        %>
        <tr>
            <td><%= chiTiet.getTenKH() %></td>
            <td><%= chiTiet.getHoadonID() %></td>
            <td><%= chiTiet.getNgayban() %></td>
            <td><%= chiTiet.getSoluongban() %></td>
            <td><%= String.format("%.2f", chiTiet.getTongtien()) %></td>

        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="4">Không có dữ liệu để hiển thị.</td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>