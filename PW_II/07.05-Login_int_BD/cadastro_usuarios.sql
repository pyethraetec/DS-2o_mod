# Host: localhost  (Version 5.5.5-10.4.22-MariaDB)
# Date: 2024-05-15 19:59:23
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "cadastro_usuarios"
#

CREATE TABLE `cadastro_usuarios` (
  `Id` varchar(11) NOT NULL DEFAULT '',
  `Nome` varchar(100) NOT NULL DEFAULT '0',
  `Email` varchar(100) NOT NULL DEFAULT '0',
  `Senha` varchar(100) NOT NULL DEFAULT '0',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

#
# Data for table "cadastro_usuarios"
#

INSERT INTO `cadastro_usuarios` VALUES ('01','Pyethra','pyethra.ribeiro@etec.sp.gov.br','A1234');
INSERT INTO `cadastro_usuarios` VALUES ('02','Vitor','vitor@etec.sp.gov.br','B1234');
