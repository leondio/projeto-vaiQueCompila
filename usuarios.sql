CREATE TABLE `itmn_usuario` (
  `idusuario` int NOT NULL AUTO_INCREMENT,
  `email` varchar(100) NOT NULL,
  `linkfoto` varchar(200) DEFAULT NULL,
  `nome` varchar(100) NOT NULL,
  `racf` varchar(7) NOT NULL,
  `senha` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idusuario`),
  UNIQUE KEY `UK_dnvgup8yi2egdo5j5ekna9272` (`email`),
  UNIQUE KEY `UK_r7euuh6tkvt3ep69x1th94984` (`rafc`)
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into itmn_usuario values(null, "a@a.com", "https://hennesseyonline.com/wp-content/uploads/2015/05/staff-placeholder-male.jpg", 'Marcos Silva', '1234567','1234');
