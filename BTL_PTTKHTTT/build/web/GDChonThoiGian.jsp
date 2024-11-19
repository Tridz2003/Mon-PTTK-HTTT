<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thống Kê Mặt Hàng</title>
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
            .date-container {
                display: flex;
                justify-content: center;
                align-items: center;
                background-color: white;
                padding: 20px;
                border-radius: 5px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }
            input[type="date"] {
                margin: 0 10px;
                padding: 10px;
                border: 1px solid #ccc;
                border-radius: 4px;
            }
            button {
                background-color: #4CAF50;
                color: white;
                padding: 10px 20px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                margin-left: 10px;
            }
            button:hover {
                background-color: #45a049;
            }
        </style>
    </head>
    <body>
        <div class="date-container">
            <form action="ThongkeController" method="post">
                <label for="start-date">Ngày bắt đầu:</label>
                <input type="date" id="start-date" name="start-date" required>
                <label for="end-date">Ngày kết thúc:</label>
                <input type="date" id="end-date" name="end-date" required>
                <button type="submit">Xem</button>
            </form>
        </div>
    </body>
</html>