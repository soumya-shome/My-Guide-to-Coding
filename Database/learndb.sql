-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 24, 2023 at 06:10 PM
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
-- Database: `learndb`
--

-- --------------------------------------------------------

--
-- Table structure for table `allocation`
--

DROP TABLE IF EXISTS `allocation`;
CREATE TABLE IF NOT EXISTS `allocation` (
  `empid` varchar(50) NOT NULL,
  `empname` varchar(50) NOT NULL,
  `projectid` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `allocation`
--

INSERT INTO `allocation` (`empid`, `empname`, `projectid`) VALUES
('E300', 'Olivia', 'Infy101'),
('E301', 'Hussey', 'Infy102'),
('E302', 'Mike', 'Infy103'),
('E303', 'Jack', ''),
('E304', 'Smith', '');

-- --------------------------------------------------------

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
CREATE TABLE IF NOT EXISTS `project` (
  `projectid` varchar(50) NOT NULL,
  `projectname` varchar(50) NOT NULL,
  UNIQUE KEY `projectid` (`projectid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `project`
--

INSERT INTO `project` (`projectid`, `projectname`) VALUES
('Infy101', 'NAB'),
('Infy102', 'All State Bank'),
('Infy103', 'Suntrust'),
('Infy104', 'Swiss Insure');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
