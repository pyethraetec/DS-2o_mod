# Host: localhost  (Version 5.5.5-10.4.22-MariaDB)
# Date: 2024-06-05 21:42:06
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "produtos"
#

DROP TABLE IF EXISTS `produtos`;
CREATE TABLE `produtos` (
  `Cod` int(11) NOT NULL AUTO_INCREMENT,
  `Produto` varchar(11) COLLATE latin1_general_ci NOT NULL DEFAULT '0',
  `Quant` int(11) NOT NULL DEFAULT 0,
  `Preco` double NOT NULL DEFAULT 0,
  `Acao` varchar(24) COLLATE latin1_general_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`Cod`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

#
# Data for table "produtos"
#

INSERT INTO `produtos` VALUES (1,'Teclado',10,99,'0'),(2,'Mouse',25,55,'0'),(3,'Celular Sam',10,999,'0');
