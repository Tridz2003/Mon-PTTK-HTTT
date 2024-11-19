-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1:3306
-- Thời gian đã tạo: Th10 19, 2024 lúc 03:03 PM
-- Phiên bản máy phục vụ: 8.2.0
-- Phiên bản PHP: 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `pttk_1`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblchitiethoadon722`
--

DROP TABLE IF EXISTS `tblchitiethoadon722`;
CREATE TABLE IF NOT EXISTS `tblchitiethoadon722` (
  `ID` int NOT NULL,
  `Soluong` int NOT NULL,
  `tblHoaDonBanHang722ID` int NOT NULL,
  `tblMatHangBan722ID` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `tblHoaDonBanHang722ID` (`tblHoaDonBanHang722ID`),
  KEY `tblMatHangBan722ID` (`tblMatHangBan722ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `tblchitiethoadon722`
--

INSERT INTO `tblchitiethoadon722` (`ID`, `Soluong`, `tblHoaDonBanHang722ID`, `tblMatHangBan722ID`) VALUES
(1, 2, 1, 1),
(2, 2, 2, 2),
(3, 1, 3, 3),
(4, 1, 3, 4),
(5, 1, 4, 4),
(6, 1, 4, 5);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblchitiethoadonnhap722`
--

DROP TABLE IF EXISTS `tblchitiethoadonnhap722`;
CREATE TABLE IF NOT EXISTS `tblchitiethoadonnhap722` (
  `ID` int NOT NULL,
  `Soluong` int NOT NULL,
  `tblHoaDonNhapHang722ID` int NOT NULL,
  `tblMatHangNhap722ID` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `tblHoaDonNhapHang722ID` (`tblHoaDonNhapHang722ID`),
  KEY `tblMatHangNhap722ID` (`tblMatHangNhap722ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblhoadonbanhang722`
--

DROP TABLE IF EXISTS `tblhoadonbanhang722`;
CREATE TABLE IF NOT EXISTS `tblhoadonbanhang722` (
  `ID` int NOT NULL,
  `Ngayban` date NOT NULL,
  `Tongtien` float NOT NULL,
  `Trangthai` varchar(225) NOT NULL,
  `tblNhanVien722ID` int DEFAULT NULL,
  `tblKhachHang722ID` int DEFAULT NULL,
  `tblNhanVienGiaoHang722ID` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `tblNhanVien722ID` (`tblNhanVien722ID`),
  KEY `tblKhachHang722ID` (`tblKhachHang722ID`),
  KEY `tblNhanVienGiaoHang722ID` (`tblNhanVienGiaoHang722ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `tblhoadonbanhang722`
--

INSERT INTO `tblhoadonbanhang722` (`ID`, `Ngayban`, `Tongtien`, `Trangthai`, `tblNhanVien722ID`, `tblKhachHang722ID`, `tblNhanVienGiaoHang722ID`) VALUES
(1, '2024-11-06', 24000, '', 2, 2, 1),
(2, '2024-11-05', 20000, '', 2, 3, 2),
(3, '2024-11-04', 14000, '', 2, 3, 1),
(4, '2024-11-03', 17000, '', 2, 3, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblhoadonnhaphang722`
--

DROP TABLE IF EXISTS `tblhoadonnhaphang722`;
CREATE TABLE IF NOT EXISTS `tblhoadonnhaphang722` (
  `ID` int NOT NULL,
  `Ngaynhap` date NOT NULL,
  `Thue` int NOT NULL,
  `Tongtien` float NOT NULL,
  `tblNhaCungCap722ID` int NOT NULL,
  `tblNhanVien722ID` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `tblNhaCungCap722ID` (`tblNhaCungCap722ID`),
  KEY `tblNhanVien722ID` (`tblNhanVien722ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblkhachhang722`
--

DROP TABLE IF EXISTS `tblkhachhang722`;
CREATE TABLE IF NOT EXISTS `tblkhachhang722` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Ten` varchar(255) NOT NULL,
  `Tendangnhap` varchar(255) NOT NULL,
  `Matkhau` varchar(255) NOT NULL,
  `Diachi` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Sodienthoai` varchar(255) NOT NULL,
  `Ghichu` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `tblkhachhang722`
--

INSERT INTO `tblkhachhang722` (`ID`, `Ten`, `Tendangnhap`, `Matkhau`, `Diachi`, `Email`, `Sodienthoai`, `Ghichu`) VALUES
(1, 'Nguyen Van Quy', 'quy', '123', 'Thai Binh', 'vanquy@gmail.com', '0947382717', 'VIP'),
(2, 'Nguyen Tien Dat', 'dat', '123', 'Bac Ninh', 'tiendat@gmail.com', '0918473645', 'Normal'),
(3, 'Le Minh Phu', 'phu', '123', 'Thai Binh', 'minhphu@gmail.com', '0928374657', 'Normal');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblmathang722`
--

DROP TABLE IF EXISTS `tblmathang722`;
CREATE TABLE IF NOT EXISTS `tblmathang722` (
  `ID` int NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `Xuatxu` varchar(255) NOT NULL,
  `Mota` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `tblmathang722`
--

INSERT INTO `tblmathang722` (`ID`, `Ten`, `Xuatxu`, `Mota`) VALUES
(1, 'Laptop LENOVO L390', 'Trung Quoc', 'New 100%'),
(2, 'Tivi SONY V3', 'Trung Quoc', 'New 100%'),
(3, 'Điều hòa Panasonic', 'Han Quoc', 'New 100%'),
(4, 'Laptop ASUS Legion', 'Han Quoc', 'New 100%'),
(5, 'Máy giặt LG L1112', 'Nhat Ban', 'New 100%');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblmathangban722`
--

DROP TABLE IF EXISTS `tblmathangban722`;
CREATE TABLE IF NOT EXISTS `tblmathangban722` (
  `tblMatHang722ID` int NOT NULL,
  `Giaban` float NOT NULL,
  `Soluong` int NOT NULL,
  PRIMARY KEY (`tblMatHang722ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `tblmathangban722`
--

INSERT INTO `tblmathangban722` (`tblMatHang722ID`, `Giaban`, `Soluong`) VALUES
(1, 12000, 3),
(2, 10000, 4),
(3, 8000, 3),
(4, 6000, 5),
(5, 11000, 6);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblmathangnhap722`
--

DROP TABLE IF EXISTS `tblmathangnhap722`;
CREATE TABLE IF NOT EXISTS `tblmathangnhap722` (
  `tblMatHang722ID` int NOT NULL,
  `Gianhap` float NOT NULL,
  `Soluong` int NOT NULL,
  PRIMARY KEY (`tblMatHang722ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblnhacungcap722`
--

DROP TABLE IF EXISTS `tblnhacungcap722`;
CREATE TABLE IF NOT EXISTS `tblnhacungcap722` (
  `ID` int NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `Diachi` varchar(255) NOT NULL,
  `Sodienthoai` varchar(255) NOT NULL,
  `Mota` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblnhanvien722`
--

DROP TABLE IF EXISTS `tblnhanvien722`;
CREATE TABLE IF NOT EXISTS `tblnhanvien722` (
  `ID` int NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `Tendangnhap` varchar(255) NOT NULL,
  `Matkhau` varchar(255) NOT NULL,
  `Diachi` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Sodienthoai` varchar(255) NOT NULL,
  `Vitri` varchar(255) NOT NULL,
  `Tinhtrang` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `tblnhanvien722`
--

INSERT INTO `tblnhanvien722` (`ID`, `Ten`, `Tendangnhap`, `Matkhau`, `Diachi`, `Email`, `Sodienthoai`, `Vitri`, `Tinhtrang`) VALUES
(1, 'Duong Minh Tri', 'tri', '123', 'Thanh Hoa', 'minhtri@gmail.com', '0934284732', 'Manager', 'Active'),
(2, 'Vu Quoc', 'quoc', '123', 'Thanh Hoa', 'Quoc@gmail.com', '0938374575', 'Seller', 'Active');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblnhanviengiaohang722`
--

DROP TABLE IF EXISTS `tblnhanviengiaohang722`;
CREATE TABLE IF NOT EXISTS `tblnhanviengiaohang722` (
  `ID` int NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `Sodienthoai` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `tblnhanviengiaohang722`
--

INSERT INTO `tblnhanviengiaohang722` (`ID`, `Ten`, `Sodienthoai`) VALUES
(1, 'Le Trong Tan', '0938475856'),
(2, 'Vu Quoc Huy', '0947586754');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
