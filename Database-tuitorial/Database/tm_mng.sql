-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 21, 2023 at 09:27 AM
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
-- Database: `tm_mng`
--

-- --------------------------------------------------------

--
-- Table structure for table `player_det`
--

DROP TABLE IF EXISTS `player_det`;
CREATE TABLE IF NOT EXISTS `player_det` (
  `no` int(11) NOT NULL,
  `name` text NOT NULL,
  `m_position` text NOT NULL,
  `DoB` date NOT NULL,
  `Age` int(11) NOT NULL,
  `Height` decimal(10,0) NOT NULL,
  `o_position` text NOT NULL,
  `joined` date NOT NULL,
  `cont_exp` date NOT NULL,
  PRIMARY KEY (`no`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `player_stat`
--

DROP TABLE IF EXISTS `player_stat`;
CREATE TABLE IF NOT EXISTS `player_stat` (
  `name` text NOT NULL,
  `no` int(11) NOT NULL,
  `tournament` text NOT NULL,
  `appearance` int(11) NOT NULL,
  `goals` int(11) NOT NULL,
  `assit` int(11) NOT NULL,
  `own_goal` int(11) NOT NULL,
  `subs_on` int(11) NOT NULL,
  `subs_off` int(11) NOT NULL,
  `y_c` int(11) NOT NULL,
  `sy_c` int(11) NOT NULL,
  `r_c` int(11) NOT NULL,
  `p_g` int(11) NOT NULL,
  `mins_ply` int(11) NOT NULL,
  PRIMARY KEY (`no`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `team_dets`
--

DROP TABLE IF EXISTS `team_dets`;
CREATE TABLE IF NOT EXISTS `team_dets` (
  `nam` text NOT NULL,
  `address` text NOT NULL,
  `website` text NOT NULL,
  `founded` date NOT NULL,
  `club_colour` text NOT NULL,
  `stadium` text NOT NULL,
  `other_sprts` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
