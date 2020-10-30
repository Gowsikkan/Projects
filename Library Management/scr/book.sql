CREATE TABLE `book` (
  `lcode` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `author` varchar(45) NOT NULL,
  `quantity` int DEFAULT NULL,
  PRIMARY KEY (`lcode`,`name`,`author`),
  UNIQUE KEY `lcode_UNIQUE` (`lcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci