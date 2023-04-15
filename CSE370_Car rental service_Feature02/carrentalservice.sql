-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 18, 2021 at 01:28 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.4.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `carrentalservice`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Admin_id` int(11) NOT NULL,
  `Admin_Full_Name` varchar(100) NOT NULL,
  `Admin_Password` varchar(100) NOT NULL,
  `Recent_Log_Date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Admin_id`, `Admin_Full_Name`, `Admin_Password`, `Recent_Log_Date`) VALUES
(19101153, 'Sarder Tanvir Ahmed', '1234', '2028-04-20 18:00:00'),
(19101384, 'Sifat Abdullah', '12345', '2024-04-20 18:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `billing_confirmation`
--

CREATE TABLE `billing_confirmation` (
  `customerid` int(11) NOT NULL,
  `bookingid` int(11) NOT NULL,
  `No_Of_Rental_Plans` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `id` int(11) NOT NULL,
  `user_Email` varchar(100) NOT NULL,
  `Vehicle_id` int(11) NOT NULL,
  `Booked_Status` tinyint(1) NOT NULL,
  `License_Plate_No` int(8) NOT NULL,
  `Posting_Date` date NOT NULL,
  `Total_Cost` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `brands`
--

CREATE TABLE `brands` (
  `Brand_id` int(11) NOT NULL,
  `Brand_Name` varchar(50) NOT NULL,
  `Creation_Date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `Active_Status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Customer_id` int(11) NOT NULL,
  `Full Name` varchar(120) NOT NULL,
  `Email` varchar(120) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `ContactNo` int(11) NOT NULL,
  `Address` varchar(250) NOT NULL,
  `City` varchar(100) NOT NULL,
  `Country` varchar(100) NOT NULL,
  `NID` varchar(10) NOT NULL,
  `Reg_Date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `Confirm_Date` date NOT NULL,
  `Active_Status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT=' Represents the data of the customer. Primary key: Id';

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Customer_id`, `Full Name`, `Email`, `Password`, `ContactNo`, `Address`, `City`, `Country`, `NID`, `Reg_Date`, `Confirm_Date`, `Active_Status`) VALUES
(1153, 'Emanuel Kant', 'eman@gmail.com', 'Kant', 1610015060, 'L53/1 Middle Badda Post office Road', 'Dhaka', 'Bangaladesh', '33340550', '2021-05-06 11:42:03', '2025-04-21', 1),
(1167, 'Nabed Hasan', 'nabed10@gmail.com', 'wepo88', 1515151511, 'House-09,Road-07,Rupnagar R/A, Mirpur,Dhaka.', 'Dhaka', 'Bangladesh', '25793548', '2021-05-17 05:24:04', '2021-05-17', 1),
(1199, 'Karim Sheikh', 'karim99@gmail.com', 'lo992', 1355566644, 'House-23,Road-44,Block-C,Section-6,Mirpur,Dhaka-1216', 'Dhaka', 'Bangladesh', '16987412', '2021-05-17 05:44:48', '2021-05-17', 1),
(1245, 'Karl Marx', 'Karl@gmail.com', 'Marx', 1310016070, 'Gulshan 1 Kola Street', 'Dhaka', 'Bangaladesh', '33340551', '2014-02-20 18:00:00', '2024-02-21', 1);

-- --------------------------------------------------------

--
-- Table structure for table `customer_reviews`
--

CREATE TABLE `customer_reviews` (
  `user_id` int(11) NOT NULL,
  `user_email` varchar(100) NOT NULL,
  `review` mediumtext NOT NULL,
  `review_date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `Approval_status` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer_reviews`
--

INSERT INTO `customer_reviews` (`user_id`, `user_email`, `review`, `review_date`, `Approval_status`) VALUES
(1153, 'eman@gmail.com', 'I am satisfied with their service. Will Book cars from them again. Highly recommended!', '2021-05-11 19:47:04', 1),
(1167, 'nabed10@gmail.com', 'Driver was very unprofessional.', '2021-05-17 08:44:32', 1),
(1199, 'karim99@gmail.com', 'Excellent service. Driver was very good and professional.', '2021-05-17 08:43:12', 1);

-- --------------------------------------------------------

--
-- Table structure for table `order_confirmation`
--

CREATE TABLE `order_confirmation` (
  `Veh_id` int(11) NOT NULL,
  `Book_id` int(11) NOT NULL,
  `totalcost` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `rental_availability_check`
--

CREATE TABLE `rental_availability_check` (
  `Totalcost` int(5) NOT NULL,
  `Vehicleid` int(11) NOT NULL,
  `Rental_Token_No` int(5) NOT NULL,
  `No_Of_Days` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `vehicle`
--

CREATE TABLE `vehicle` (
  `Vehicle_id` int(11) NOT NULL,
  `Vehicle_brand` varchar(50) NOT NULL,
  `License_plate_No` varchar(8) NOT NULL,
  `Price_Per_Day` int(11) NOT NULL,
  `Seat_Capacity` int(11) NOT NULL,
  `Fuel_Type` varchar(100) NOT NULL,
  `Model_Year` int(6) NOT NULL,
  `Reg_Date` date NOT NULL,
  `Active_Status` tinyint(1) NOT NULL,
  `Air_Conditioned` tinyint(1) NOT NULL,
  `Bluetooth_Music` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vehicle`
--

INSERT INTO `vehicle` (`Vehicle_id`, `Vehicle_brand`, `License_plate_No`, `Price_Per_Day`, `Seat_Capacity`, `Fuel_Type`, `Model_Year`, `Reg_Date`, `Active_Status`, `Air_Conditioned`, `Bluetooth_Music`) VALUES
(1123, 'Tesla', '800TYM3N', 1200, 4, 'Electric', 2015, '2020-05-03', 1, 1, 1),
(1238, 'Toyota Corola', 'Z00TYM3N', 500, 4, 'Natural Gas', 2011, '2020-03-06', 1, 0, 0),
(1345, 'Audi', 'S00TYM3N', 1500, 2, 'Diesel', 2016, '2020-06-06', 1, 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Admin_id`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `License_Plate_No` (`License_Plate_No`);

--
-- Indexes for table `brands`
--
ALTER TABLE `brands`
  ADD PRIMARY KEY (`Brand_id`),
  ADD UNIQUE KEY `Brand_Name` (`Brand_Name`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`Customer_id`),
  ADD UNIQUE KEY `Email` (`Email`,`NID`);

--
-- Indexes for table `customer_reviews`
--
ALTER TABLE `customer_reviews`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `review` (`review`) USING HASH,
  ADD UNIQUE KEY `review_2` (`review`) USING HASH;

--
-- Indexes for table `vehicle`
--
ALTER TABLE `vehicle`
  ADD PRIMARY KEY (`Vehicle_id`),
  ADD UNIQUE KEY `License_plate_No` (`License_plate_No`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customer_reviews`
--
ALTER TABLE `customer_reviews`
  ADD CONSTRAINT `customer_reviews_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `customer` (`Customer_id`) ON DELETE CASCADE ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
