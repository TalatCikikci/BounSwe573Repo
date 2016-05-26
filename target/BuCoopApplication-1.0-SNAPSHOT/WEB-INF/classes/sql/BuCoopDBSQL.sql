CREATE USER 'bucoopdb'@'localhost' IDENTIFIED BY 'bucoopdb';
CREATE DATABASE bucoopdb
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;
GRANT ALL ON bucoopdb.* TO 'bucoopdb'@'localhost';