-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 21, 2023 at 07:21 AM
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
-- Database: `assignment`
--

-- --------------------------------------------------------

--
-- Table structure for table `cdb_cms_agent`
--

DROP TABLE IF EXISTS `cdb_cms_agent`;
CREATE TABLE IF NOT EXISTS `cdb_cms_agent` (
  `LICENSE` int(11) NOT NULL,
  `E_DATE` varchar(256) DEFAULT NULL,
  `NAME` varchar(256) DEFAULT NULL,
  `GRADE` varchar(256) DEFAULT NULL,
  `CONTACT` varchar(256) DEFAULT NULL,
  `EMAIL` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`LICENSE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cdb_cms_agent`
--

INSERT INTO `cdb_cms_agent` (`LICENSE`, `E_DATE`, `NAME`, `GRADE`, `CONTACT`, `EMAIL`) VALUES
(123, '1999-02-16', 'Alice', 'DA', '9988345456', 'alice@gmail.com'),
(124, '1988-09-25', 'Bob', 'GE', '6758345456', 'bob@gmail.com'),
(125, '1989-10-15', 'Allen', 'GO', '6345625456', 'allen@gmail.com'),
(126, '2000-02-16', 'Caive', 'DA', '9988445556', 'caive@gmail.com'),
(127, '2002-09-25', 'Elle', 'SL', '6766775456', 'elle@gmail.com'),
(128, '2008-11-13', 'Drewt', 'GO', '7989225456', 'allen@gmail.com'),
(129, '2000-02-16', 'Sam', 'GE', '9922334556', 'sam@gmail.com'),
(130, '2012-11-05', 'Humie', 'DA', '9115575456', 'humie@gmail.com'),
(131, '2018-07-10', 'Yelly', 'SL', '9390225456', 'yelle@gmail.com'),
(132, '2020-11-09', 'Archie', 'GO', '9030225456', 'archie@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `cdw_cms_d_agent`
--

DROP TABLE IF EXISTS `cdw_cms_d_agent`;
CREATE TABLE IF NOT EXISTS `cdw_cms_d_agent` (
  `AGENT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `AGENT_LICENSE` int(11) DEFAULT NULL,
  `ENROLL_DATE` date DEFAULT NULL,
  `AGENT_NAME` varchar(256) DEFAULT NULL,
  `AGENT_GRADE` varchar(256) DEFAULT NULL,
  `AGENT_CONTACT` varchar(256) DEFAULT NULL,
  `AGENT_EMAIL` varchar(256) DEFAULT NULL,
  `START_DATE` date DEFAULT NULL,
  `END_DATE` date DEFAULT NULL,
  PRIMARY KEY (`AGENT_ID`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cdw_cms_d_agent`
--

INSERT INTO `cdw_cms_d_agent` (`AGENT_ID`, `AGENT_LICENSE`, `ENROLL_DATE`, `AGENT_NAME`, `AGENT_GRADE`, `AGENT_CONTACT`, `AGENT_EMAIL`, `START_DATE`, `END_DATE`) VALUES
(1, 123, '1999-02-16', 'Alice', 'Diamond', '9988345456', 'alice@gmail.com', '2022-06-15', '2999-12-31'),
(2, 124, '1988-09-25', 'Bob', 'General', '6758345456', 'bob@gmail.com', '2022-06-15', '2999-12-31'),
(3, 125, '1989-10-15', 'Allen', 'Gold', '6345625456', 'allen@gmail.com', '2022-06-15', '2999-12-31'),
(4, 126, '2000-02-16', 'Caive', 'Diamond', '9988445556', 'caive@gmail.com', '2022-06-15', '2999-12-31'),
(5, 127, '2002-09-25', 'Elle', 'Silver', '6766775456', 'elle@gmail.com', '2022-06-15', '2999-12-31'),
(6, 128, '2008-11-13', 'Drewt', 'Gold', '7989225456', 'allen@gmail.com', '2022-06-15', '2999-12-31'),
(7, 129, '2000-02-16', 'Sam', 'General', '9922334556', 'sam@gmail.com', '2022-06-15', '2999-12-31'),
(8, 130, '2012-11-05', 'Humie', 'Diamond', '9115575456', 'humie@gmail.com', '2022-06-15', '2999-12-31'),
(9, 131, '2018-07-10', 'Yelly', 'Silver', '9390225456', 'yelle@gmail.com', '2022-06-15', '2999-12-31'),
(10, 132, '2020-11-09', 'Archie', 'Gold', '9030225456', 'archie@gmail.com', '2022-06-15', '2999-12-31');

-- --------------------------------------------------------

--
-- Table structure for table `cdw_cms_d_policy`
--

DROP TABLE IF EXISTS `cdw_cms_d_policy`;
CREATE TABLE IF NOT EXISTS `cdw_cms_d_policy` (
  `POLICY_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CUST_ID` bigint(20) DEFAULT NULL,
  `AGENT_ID` bigint(20) DEFAULT NULL,
  `YEARS` int(11) DEFAULT NULL,
  `SUM_INSURED` int(11) DEFAULT NULL,
  `PREMIUM` decimal(10,0) DEFAULT NULL,
  `POLICY_TYPE` varchar(256) DEFAULT NULL,
  `KEY_NO` varchar(256) DEFAULT NULL,
  `START_DATE` date DEFAULT NULL,
  `END_DATE` date DEFAULT NULL,
  PRIMARY KEY (`POLICY_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
