# Host: localhost  (Version 5.5.5-10.4.22-MariaDB)
# Date: 2024-04-16 20:19:25
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "usuarios"
#

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `codigo` varchar(11) NOT NULL DEFAULT '',
  `Nome` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

#
# Data for table "usuarios"
#

INSERT INTO `usuarios` VALUES ('01','Pyethra','pyethra.ribeiro@etec.sp.gov.br','senha01'),('02','Samuel','samuel.puci@etec.sp.gov.br','senha02'),('03','Gabrielle','gabrielle.elle@etec.sp.gov.br','senha03');
