CREATE DATABASE bankingSecurity;

USE bankingSecurity;

CREATE TABLE `users` (
    `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `username` VARCHAR(45) NOT NULL,
    `password` VARCHAR(45) NOT NULL,
    `enabled` INT NOT NULL
);

CREATE TABLE `authorities` (
    `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `username` VARCHAR(45) NOT NULL,
    `authority` VARCHAR(45) NOT NULL
);


INSERT IGNORE INTO `users` VALUES (NULL, 'gustavops02', '12345', 1);
INSERT IGNORE INTO `authorities` VALUES (NULL, 'gustavops02', 'write');