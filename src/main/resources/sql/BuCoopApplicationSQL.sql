DROP TABLE IF EXISTS `userbasic`;

CREATE TABLE `userbasic`
(
  `id` INT(10) PRIMARY KEY AUTO_INCREMENT,
  `username` VARCHAR(40) NOT NULL,
  `password` VARCHAR(40) NOT NULL,
  `type` VARCHAR(10) NOT NULL DEFAULT 'basic',
  `active` BOOLEAN NOT NULL DEFAULT TRUE
);
CREATE UNIQUE INDEX userbasic_username_uindex ON userbasic (username);

DROP TABLE IF EXISTS `useradditional`;

CREATE TABLE `useradditional` (
  `id` INT(10) PRIMARY KEY,
  `email` VARCHAR(40) NOT NULL,
  `firstname` VARCHAR(40),
  `surname` VARCHAR(40),
  `avatar` VARBINARY(10240),
  `about` LONGTEXT
);

CREATE UNIQUE INDEX useradditional_email_uindex ON useradditional (email);

DROP TABLE IF EXISTS `userprivacy`;

CREATE TABLE `userprivacy` (
  `id` INT(10) PRIMARY KEY,
  `emailpriv` BOOLEAN NOT NULL DEFAULT FALSE,
  `firstnamepriv` BOOLEAN NOT NULL DEFAULT FALSE,
  `surnamepriv` BOOLEAN NOT NULL DEFAULT FALSE,
  `avatarpriv` BOOLEAN NOT NULL DEFAULT FALSE,
  `aboutpriv` BOOLEAN NOT NULL DEFAULT FALSE
);

DROP TABLE IF EXISTS `producer`;

CREATE TABLE `producer` (
  `id` INT(10) PRIMARY KEY,
  `producername` VARCHAR(40) DEFAULT NULL,
  `producerdesc` LONGTEXT,
  `location` VARCHAR(400),
  `active` BOOLEAN NOT NULL DEFAULT TRUE
);

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` INT(10) PRIMARY KEY,
  `productname` VARCHAR(40) DEFAULT NULL,
  `productdesc` LONGTEXT,
  `producer` INT(10) NOT NULL,
  `category` INT(10),
  `active` BOOLEAN NOT NULL DEFAULT TRUE
);

DROP TABLE IF EXISTS `tag`;

CREATE TABLE `tag` (
  `id` INT(10) PRIMARY KEY AUTO_INCREMENT,
  `tagname` VARCHAR(40) NOT NULL,
  `productid` VARCHAR(1000),
  `active` BOOLEAN DEFAULT TRUE
);

DROP TABLE IF EXISTS `inventory`;

CREATE TABLE `inventory` (
  `id` INT(10) PRIMARY KEY AUTO_INCREMENT,
  `productid` INT(10) NOT NULL,
  `quantity` INT(10),
  `active` BOOLEAN DEFAULT TRUE
);

DROP TABLE IF EXISTS `announcement`;

CREATE TABLE `announcement` (
  `id` INT(10) PRIMARY KEY AUTO_INCREMENT,
  `announcementtitle` VARCHAR(100) NOT NULL,
  `announcementbody` LONGTEXT,
  `active` BOOLEAN DEFAULT TRUE
);

DROP TABLE IF EXISTS `commentrate`;

CREATE TABLE `commentrate` (
  `id` INT(10) PRIMARY KEY AUTO_INCREMENT,
  `commenttitle` VARCHAR(100),
  `commentbody` LONGTEXT,
  `productid` INT(10),
  `rating` INT(5),
  `active` BOOLEAN DEFAULT TRUE
);

DROP TABLE IF EXISTS `memberrequest`;

CREATE TABLE `memberrequest` (
  `id` INT(10) PRIMARY KEY AUTO_INCREMENT,
  `requesterid` INT(10)
);

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `id` INT(10) PRIMARY KEY AUTO_INCREMENT,
  `categoryname` VARCHAR(100) NOT NULL
);

INSERT INTO userbasic (username,password,type,active) VALUES ('superadmin','super123','superadmin',1);

CREATE VIEW userall AS (SELECT a.id, a.username, a.password, a.type, a.active, a.isapplicant, b.email, b.firstname, b.surname, b.avatar, b.about, c.emailpriv, c.firstnamepriv, c.surnamepriv, c.avatarpriv, c.aboutpriv FROM userbasic a INNER JOIN useradditional b ON a.id=b.id INNER JOIN userprivacy c ON b.id=c.id);

CREATE VIEW productall AS (SELECT a.id, a.productname, a.productdesc, a.active as productactive, b.categoryname, c.producername, c.producerdesc, c.active as produceractive FROM product a INNER JOIN category b ON a.category=b.id INNER JOIN producer c ON a.producer=c.id);
