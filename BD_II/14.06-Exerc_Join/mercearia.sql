-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 15-Jun-2024 às 02:55
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 7.4.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `mercearia`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `ID` int(11) NOT NULL,
  `CLINOME` varchar(100) NOT NULL,
  `CLIENDERECO` varchar(40) DEFAULT NULL,
  `CLITELEFONE` varchar(14) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`ID`, `CLINOME`, `CLIENDERECO`, `CLITELEFONE`) VALUES
(108, 'CLIENTE CLI#1', NULL, NULL),
(109, 'CLIENTE CLI#2', 'RUA SAMARA 118', '3248-6090'),
(110, 'CLIENTE CLI#3', NULL, '3242-2525'),
(111, 'CLIENTE CLI#4', NULL, NULL),
(112, 'CLIENTE CLI#5', 'RUA BITUVAS 110', NULL),
(113, 'CLIENTE CLI#6', 'RUA DOS MORCEGOS', '9141-2626'),
(114, 'CLIENTE CLI#7', 'AV. 7 SETEMBRO 77', '3247-7777'),
(115, 'CLIENTE CLI#8', 'AV. 4 JULHO 1973', NULL),
(116, 'CLIENTE CLI#9', NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE `fornecedor` (
  `ID` int(11) NOT NULL,
  `FORNOME` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`ID`, `FORNOME`) VALUES
(20, 'FORNECEDOR FOR#1'),
(30, 'FORNECEDOR FOR#2'),
(40, 'FORNECEDOR FOR#3'),
(50, 'FORNECEDOR FOR#4'),
(60, 'FORNECEDOR FOR#5');

-- --------------------------------------------------------

--
-- Estrutura da tabela `notadetalhe`
--

CREATE TABLE `notadetalhe` (
  `SEQUENCIA` int(11) NOT NULL,
  `IDNOTAFISCAL` int(11) NOT NULL,
  `QUANTIDADE` float NOT NULL,
  `VALORUNITARIO` float NOT NULL,
  `IDPRODUTO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `notadetalhe`
--

INSERT INTO `notadetalhe` (`SEQUENCIA`, `IDNOTAFISCAL`, `QUANTIDADE`, `VALORUNITARIO`, `IDPRODUTO`) VALUES
(1, 300, 2, 20.53, 111),
(2, 300, 3, 19.9, 110),
(3, 300, 1, 19.9, 101),
(4, 400, 2, 20.53, 109),
(5, 400, 3, 19.9, 103),
(6, 400, 1, 19.9, 104),
(7, 400, 1, 35, 106),
(8, 300, 2, 20.53, 111),
(9, 500, 5, 19.9, 109),
(10, 500, 6, 19.9, 110),
(11, 500, 2.5, 21.35, 102),
(12, 500, 8, 35, 106),
(13, 600, 2, 10.55, 100),
(14, 600, 3, 17.9, 101),
(15, 600, 7, 15.5, 110),
(16, 600, 3.5, 21.35, 103),
(17, 600, 1, 36, 107),
(18, 600, 1, 36, 107),
(19, 701, 2, 10.55, 100),
(20, 701, 3, 17.9, 101);

-- --------------------------------------------------------

--
-- Estrutura da tabela `notafiscal`
--

CREATE TABLE `notafiscal` (
  `ID` int(11) NOT NULL,
  `NOTAEMISSAO` date NOT NULL,
  `IDCLIENTE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `notafiscal`
--

INSERT INTO `notafiscal` (`ID`, `NOTAEMISSAO`, `IDCLIENTE`) VALUES
(300, '0000-00-00', 108),
(400, '0000-00-00', 112),
(500, '0000-00-00', 115),
(600, '0000-00-00', 112),
(701, '0000-00-00', 114);

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `ID` int(11) NOT NULL,
  `PRONOME` varchar(100) NOT NULL,
  `PROVLRUNITARIO` float NOT NULL,
  `IDFORNECEDOR` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`ID`, `PRONOME`, `PROVLRUNITARIO`, `IDFORNECEDOR`) VALUES
(100, 'PRODUTO PRO#1', 10.55, 20),
(101, 'PRODUTO PRO#2', 2.3, 20),
(102, 'PRODUTO PRO#3', 15.1, 30),
(103, 'PRODUTO PRO#4', 98, 20),
(104, 'PRODUTO PRO#5', 100, 40),
(106, 'PRODUTO PRO#6', 101.5, 20),
(107, 'PRODUTO PRO#7', 25.66, 60),
(108, 'PRODUTO PRO#8', 30.31, 50),
(109, 'PRODUTO PRO#90', 60.66, 40),
(110, 'PRODUTO PRO#80', 70.13, 20),
(111, 'PRODUTO PRO#108', 82.3, 30);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`ID`);

--
-- Índices para tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`ID`);

--
-- Índices para tabela `notadetalhe`
--
ALTER TABLE `notadetalhe`
  ADD PRIMARY KEY (`SEQUENCIA`),
  ADD KEY `FK_NOTADET` (`IDNOTAFISCAL`),
  ADD KEY `FK_NOTAPROD` (`IDPRODUTO`);

--
-- Índices para tabela `notafiscal`
--
ALTER TABLE `notafiscal`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_NOTA` (`IDCLIENTE`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_PROD` (`IDFORNECEDOR`);

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `notadetalhe`
--
ALTER TABLE `notadetalhe`
  ADD CONSTRAINT `FK_NOTADET` FOREIGN KEY (`IDNOTAFISCAL`) REFERENCES `notafiscal` (`ID`),
  ADD CONSTRAINT `FK_NOTAPROD` FOREIGN KEY (`IDPRODUTO`) REFERENCES `produto` (`ID`);

--
-- Limitadores para a tabela `notafiscal`
--
ALTER TABLE `notafiscal`
  ADD CONSTRAINT `FK_NOTA` FOREIGN KEY (`IDCLIENTE`) REFERENCES `cliente` (`ID`);

--
-- Limitadores para a tabela `produto`
--
ALTER TABLE `produto`
  ADD CONSTRAINT `FK_PROD` FOREIGN KEY (`IDFORNECEDOR`) REFERENCES `fornecedor` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
