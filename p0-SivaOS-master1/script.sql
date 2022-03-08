CREATE TABLE `account` (
  `account_id` int NOT NULL AUTO_INCREMENT,
  `owner_id` int DEFAULT NULL,
  `balance` double DEFAULT NULL,
  `account_type` varchar(45) DEFAULT NULL,
  `approved` tinyint DEFAULT NULL,
  `transaction` json DEFAULT NULL,
  PRIMARY KEY (`account_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `p0_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `user_type` varchar(45) DEFAULT NULL,
  `accounts` json DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `transactions` (
  `id` int NOT NULL AUTO_INCREMENT,
  `from_accountId` varchar(45) DEFAULT NULL,
  `to_accountId` varchar(45) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `transaction_type` varchar(20) DEFAULT NULL,
  `timestamp` timestamp(2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
