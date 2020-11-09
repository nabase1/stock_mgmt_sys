-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 18, 2018 at 03:04 AM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mystore`
--

-- --------------------------------------------------------

--
-- Table structure for table `events`
--

CREATE TABLE `events` (
  `EventsId` int(11) NOT NULL,
  `SalesPersonsId` varchar(225) NOT NULL,
  `Action` varchar(225) DEFAULT NULL,
  `Date` varchar(225) DEFAULT NULL,
  `Time` varchar(225) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `events`
--

INSERT INTO `events` (`EventsId`, `SalesPersonsId`, `Action`, `Date`, `Time`) VALUES
(1, 'zak1', 'LoggedIn', '09-08-2018', '02:24:47 AM'),
(2, 'zak1', 'LoggedIn', '10-08-2018', '12:34:59 AM'),
(22, 'zak1', 'LoggedIn', '17-08-2018', '03:58:28 PM');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `ProductsId` varchar(225) NOT NULL,
  `ProductName` varchar(225) DEFAULT NULL,
  `Quantity` int(11) DEFAULT NULL,
  `UnitCostPrice` double DEFAULT NULL,
  `TotalCostPrice` double DEFAULT NULL,
  `UnitSellingPrice` double DEFAULT NULL,
  `TotalSellingPrice` double DEFAULT NULL,
  `Profit` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`ProductsId`, `ProductName`, `Quantity`, `UnitCostPrice`, `TotalCostPrice`, `UnitSellingPrice`, `TotalSellingPrice`, `Profit`) VALUES
('m2', 'Milo', 18, 10, 200, 12, 240, 40),
('n1', 'Nido', 17, 9, 180, 10, 200, 20),
('sp1', 'woodin', 10, 10, 100, 12, 120, 20),
('spp1', 'men shirt', 15, 10, 200, 12, 240, 40);

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `SalesId` int(11) NOT NULL,
  `SalesPersonsId` varchar(225) NOT NULL,
  `ProductsId` varchar(225) NOT NULL,
  `Quantity` int(11) DEFAULT NULL,
  `Amount` double DEFAULT NULL,
  `Profit` double DEFAULT NULL,
  `Date` varchar(225) DEFAULT NULL,
  `time` varchar(225) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `salespersons`
--

CREATE TABLE `salespersons` (
  `SalesPersonsId` varchar(225) NOT NULL,
  `position` varchar(225) DEFAULT NULL,
  `FirstName` varchar(225) DEFAULT NULL,
  `LastName` varchar(225) DEFAULT NULL,
  `Phone` varchar(225) DEFAULT NULL,
  `Address` varchar(225) DEFAULT NULL,
  `password` varchar(225) DEFAULT NULL,
  `shop_id` char(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `salespersons`
--

INSERT INTO `salespersons` (`SalesPersonsId`, `position`, `FirstName`, `LastName`, `Phone`, `Address`, `password`, `shop_id`) VALUES
('zak1', 'Administrator', 'Bugase', 'Nabase', '+233 553181665', 'Nkawie', 'zak123', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `shop_info`
--

CREATE TABLE `shop_info` (
  `shop_id` char(20) NOT NULL,
  `shop_name` varchar(225) DEFAULT NULL,
  `phone` char(20) DEFAULT NULL,
  `phone2` char(20) DEFAULT NULL,
  `address` varchar(225) DEFAULT NULL,
  `email` varchar(225) DEFAULT NULL,
  `discount` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `shop_info`
--

INSERT INTO `shop_info` (`shop_id`, `shop_name`, `phone`, `phone2`, `address`, `email`, `discount`) VALUES
('shop1', 'I MIND MA BUSINESS MARKET', '+233 553181665', '', 'BUGASE STATE', 'nabase1.nr@gmail.com', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `events`
--
ALTER TABLE `events`
  ADD PRIMARY KEY (`EventsId`),
  ADD KEY `fk_Events_SalesPersons1_idx` (`SalesPersonsId`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`ProductsId`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`SalesId`),
  ADD KEY `fk_Sales_products_idx` (`ProductsId`),
  ADD KEY `fk_Sales_SalesPersons1_idx` (`SalesPersonsId`);

--
-- Indexes for table `salespersons`
--
ALTER TABLE `salespersons`
  ADD PRIMARY KEY (`SalesPersonsId`),
  ADD KEY `fk_SalesPersons_shop_info1_idx` (`shop_id`);

--
-- Indexes for table `shop_info`
--
ALTER TABLE `shop_info`
  ADD PRIMARY KEY (`shop_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `events`
--
ALTER TABLE `events`
  MODIFY `EventsId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `SalesId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `events`
--
ALTER TABLE `events`
  ADD CONSTRAINT `fk_Events_SalesPersons1` FOREIGN KEY (`SalesPersonsId`) REFERENCES `salespersons` (`SalesPersonsId`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `sales`
--
ALTER TABLE `sales`
  ADD CONSTRAINT `fk_Sales_SalesPersons1` FOREIGN KEY (`SalesPersonsId`) REFERENCES `salespersons` (`SalesPersonsId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Sales_products` FOREIGN KEY (`ProductsId`) REFERENCES `products` (`ProductsId`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `salespersons`
--
ALTER TABLE `salespersons`
  ADD CONSTRAINT `fk_SalesPersons_shop_info1` FOREIGN KEY (`shop_id`) REFERENCES `shop_info` (`shop_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
