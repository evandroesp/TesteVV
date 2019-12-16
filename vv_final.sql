-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 24-Jun-2018 às 15:34
-- Versão do servidor: 10.1.28-MariaDB
-- PHP Version: 7.1.11

-- 2019 Criando database para .SH
-- CREATE DATABASE IF NOT EXISTS vv_final;
-- USE vv_final;

drop TABLE if exists carro;
drop TABLE if exists placa;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vv_final`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `carro`
--

CREATE TABLE `carro` (
  `idCarro` int(11) NOT NULL,
  `ano` int(11) NOT NULL,
  `modelo` varchar(40) NOT NULL,
  `montadora` varchar(40) NOT NULL,
  `idPlaca` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `carro`
--

INSERT INTO `carro` (`idCarro`, `ano`, `modelo`, `montadora`, `idPlaca`) VALUES
(1, 2018, 'F50', 'Ferrari', 1),
(2, 2015, 'New Beetle', 'Volkswagen', 2),
(3, 2013, 'MP4-12C', 'McLaren ', 3),
(4, 1985, 'Carroça', 'de Madeira', 4),
(5, 1978, 'Fusca', 'Volkswagen', 5),
(6, 1908, 'Modelo T', 'Ford', 6),
(7, 2000, 'Kombi', 'Volkswagen', 7),
(8, 1990, 'Brasilia', 'Volkswagen', 8);

-- --------------------------------------------------------

--
-- Estrutura da tabela `placa`
--

CREATE TABLE `placa` (
  `idPlaca` int(11) NOT NULL,
  `letras` varchar(3) NOT NULL,
  `numeros` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `placa`
--

INSERT INTO `placa` (`idPlaca`, `letras`, `numeros`) VALUES
(1, 'FRZ', '5000'),
(2, 'YFQ', '3497'),
(3, 'ZXY', '9876'),
(4, 'AS', '4321'),
(5, 'IAB', '1307'),
(6, 'A', '3'),
(7, 'IFC', '5319'),
(8, 'IBH', '3388');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `carro`
--
ALTER TABLE `carro`
  ADD PRIMARY KEY (`idCarro`);

--
-- Indexes for table `placa`
--
ALTER TABLE `placa`
  ADD PRIMARY KEY (`idPlaca`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `carro`
--
ALTER TABLE `carro`
  MODIFY `idCarro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `placa`
--
ALTER TABLE `placa`
  MODIFY `idPlaca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
