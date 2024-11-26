-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 24, 2023 at 06:09 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rideara`
--

-- --------------------------------------------------------

--
-- Table structure for table `rides`
--

DROP TABLE IF EXISTS `rides`;
CREATE TABLE IF NOT EXISTS `rides` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `pick` text NOT NULL,
  `dest` text NOT NULL,
  `b_time` varchar(10) NOT NULL,
  `p_time` varchar(10) NOT NULL,
  `d_time` varchar(10) NOT NULL,
  `tot_time` varchar(10) NOT NULL,
  `tot_fare` varchar(15) NOT NULL,
  `status` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rides`
--

INSERT INTO `rides` (`id`, `username`, `pick`, `dest`, `b_time`, `p_time`, `d_time`, `tot_time`, `tot_fare`, `status`) VALUES
(5, 'admin', 'New Town', 'Salt Lake', '10:58', '', '', '', '', 'Booked'),
(3, 'admin', 'Science City', 'New Town', '10:18', '', '', '', '', 'Booked'),
(6, 'admin', 'New Town', 'Salt Lake', '0:40', '', '', '', '', 'Booked'),
(7, 'admin', 'New Town', 'Salt Lake', '17:34', '', '', '', '', 'Booked');

-- --------------------------------------------------------

--
-- Table structure for table `stations`
--

DROP TABLE IF EXISTS `stations`;
CREATE TABLE IF NOT EXISTS `stations` (
  `s_id` varchar(5) NOT NULL,
  `name` text NOT NULL,
  `bike_avail` int(11) NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stations`
--

INSERT INTO `stations` (`s_id`, `name`, `bike_avail`) VALUES
('S0001', 'New Town', 10),
('S0002', 'Salt Lake', 10),
('S0003', 'Science City', 10),
('S0004', 'Ruby', 10);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(50) NOT NULL,
  `Fname` text NOT NULL,
  `Lname` text NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `Fname`, `Lname`, `password`) VALUES
('admin', 'Administrator', 'Admin', 'admin'),
('hello', 'hello', 'hello', 'hello'),
('world', 'world', 'world', 'world');

-- --------------------------------------------------------

--
-- Table structure for table `wallet`
--

DROP TABLE IF EXISTS `wallet`;
CREATE TABLE IF NOT EXISTS `wallet` (
  `username` varchar(50) NOT NULL,
  `balance` int(11) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wallet`
--

INSERT INTO `wallet` (`username`, `balance`) VALUES
('admin', 100),
('hello', 0),
('world', 0);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
