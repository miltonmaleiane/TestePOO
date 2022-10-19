-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 19, 2022 at 11:29 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_usuario`
--

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `id` bigint(10) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `passatempos` text NOT NULL,
  `biografia` text NOT NULL,
  `nomeUsuario` varchar(255) NOT NULL,
  `habilidades` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`id`, `nome`, `senha`, `email`, `telefone`, `passatempos`, `biografia`, `nomeUsuario`, `habilidades`) VALUES
(6, 'asasas', 'asasasas', 'asas', 'saas', 'as', 'sa', 'saasteste', 'ussyasasas'),
(7, 'jonathan', '12345', 'saja', 'saka', 'game, basket', 'humble man', 'john', 'c, c#'),
(8, 'ze', '12', 'skaks', 'assaj', 'sja', 'bri', 'zeca', 'sdjds'),
(9, 'saas', 'saas', 'sas', 'sasa', 'sasa', 'saasasasasas', 'uname', 'assa'),
(10, 'asas', 'asas', 'saasass', 'asa', 'asas', 'sasaasas', '', 'as'),
(11, 'aas', 'asasas', 'asas', 'saassasa', 'saasas', 'saas', '', 'asas'),
(12, 'zxxz', 'xz', 'xzzx', 'xz', 'xzzx', 'zxxz', '', 'zx'),
(13, 'zz', 'zzzz', 'zzz', 'zz', 'zzz', 'xxxxxxxx', '', 'zz'),
(14, 'xxxxxxx', 'xxxxxxx', 'x', 'xx', 'xx', 'xxxx', '', 'xx'),
(15, 'bbbbb', 'bbbbb', 'bbbbb', 'bb', 'bbb', 'ccccc', '', 'bbb'),
(16, 'ccccccc', 'cccccc', 'c', 'cc', 'cc', 'vvv', '', 'c'),
(17, 'zz', 'zx', 'zxzz', 'zz', 'xx', 'vxc', '', 'x'),
(18, 'xz', 'zxz', 'xzxz', 'xc', 'xz', 'xcxc', '56', 'zx'),
(19, 'xxz', 'zx', 'zxxzx', '232323', 'xzzx', 'asaasas', '232323', 'xzzx'),
(20, 'dffdzdF', 'VVV', 'GGG', 'FFX', 'VV', 'NNNN', '', 'BBV'),
(21, 'ASAS', 'ASASA', 'SASAS', 'AS', 'AS', 'ASASAS', '', 'AS'),
(22, 'SAASA', 'SAS', 'ASASASASASAS', 'ASAS', 'AS', 'ASAS', '', 'AS'),
(1000, 'SASAAS', 'SASA', 'ASAS', 'AS', 'ASAS', 'ASASAS', '', 'SA'),
(1001, 'ASAS', 'ASASSA', 'SAAS', 'ASSA', 'ASAS', 'ASASAS', '', 'SA'),
(1002, 'XX', 'CCX', 'CX', 'CXC', 'ASAS', 'ASASAS', '', 'SA'),
(1003, 'CX', 'ZXZ', 'X', 'Z', 'ASAS', 'ASASAS', '', 'SA'),
(1004, 'XZZX', 'XZXZ', 'ZXZX', 'ZXXZ', 'ZZXXZ', 'XZZX', '', 'XZZX'),
(1005, 'ZXZXXZ', 'ZXXZ', 'ZXXZZXZX', 'ZXZZX', 'ZXZXXZ', 'CCCCCCCCCCCC', 'CXCX', 'XZXZ'),
(1006, 'drake', '12345', 'asas', 'saassa', 'sasa', 'asasas', 'stake', 'sa'),
(1007, 'XXZZX', '12', 'XZX', 'XZXZ', 'XZXZZX', 'SASAS', 'vin', 'XZ'),
(1008, 'assasa', '12', 'asas', 'sas', 'XZXZZX', 'SASAS', 'vin', 'XZ');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` bigint(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1009;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
