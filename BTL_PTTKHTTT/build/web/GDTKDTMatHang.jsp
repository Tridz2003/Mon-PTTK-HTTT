<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.TKMatHang722"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Thống Kê Doanh Thu Mặt Hàng</title>
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
    <h2>Thống Kê Doanh Thu Mặt Hàng</h2>
    <p>Ngày bắt đầu: <%= request.getAttribute("startDateStr") %></p> <!-- Hiển thị startDateStr -->
    <p>Ngày kết thúc: <%= request.getAttribute("endDateStr") %></p> <!-- Hiển thị endDateStr -->
    <table>
        <tr>
            <th>ID</th>
            <th>Tên mặt hàng</th>
            <th>Xuất xứ</th>
            <th>Đã bán</th>
            <th>Tổng thu</th>
        </tr>
        <%
            ArrayList<TKMatHang722> matHangList = (ArrayList<TKMatHang722>) request.getAttribute("matHangList");
            if (matHangList != null) {
                for (TKMatHang722 matHang : matHangList) {
        %>
        <tr onclick="window.location.href='TKChiTietController?id=<%= matHang.getID() %>&ten=<%= matHang.getTen() %>&startDate=<%= request.getAttribute("startDateStr") %>&endDate=<%= request.getAttribute("endDateStr") %>'" style="cursor: pointer;">
            <td><%= matHang.getID() %></td>
            <td><%= matHang.getTen() %></td>
            <td><%= matHang.getXuatxu() %></td>
            <td><%= matHang.getSoluongban() %></td>
            <td><%= String.format("%.2f", matHang.getTongtien()) %></td>
        </tr>
        <%  
                }
         %>
        <tr class="total-row">
            <td colspan="3">Tổng:</td>
            <td><%= request.getAttribute("totalQuantity") %></td> <!-- Hiển thị tổng số lượng đã bán -->
            <td><%= String.format("%.2f", request.getAttribute("totalRevenue")) %></td> <!-- Hiển thị tổng doanh thu -->
        </tr>
        <%
            } else {
        %>
        <tr>
            <td colspan="6">Không có dữ liệu để hiển thị.</td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>