CREATE TABLE `test`;
USE `test`;
DROP TABLE account;

CREATE TABLE account (aid int(5) NOT NULL AUTO_INCREMENT, aname varchar(50) NOT NULL, balance double NOT NULL, PRIMARY KEY (aid)) ENGINE=InnoDB DEFAULT CHARSET=utf8;