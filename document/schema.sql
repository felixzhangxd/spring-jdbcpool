CREATE SCHEMA IF NOT EXISTS spring_jdbcpool DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE spring_jdbcpool;

CREATE TABLE IF NOT EXISTS `spring_jdbcpool`.`user` (
 `id` INT NOT NULL AUTO_INCREMENT,
 `name` VARCHAR(12) NOT NULL,
PRIMARY KEY(id))
ENGINE=InnoDB;

GRANT ALL ON `spring_jdbcpool`.* TO `spring_jdbcpool`@`127.0.0.1` IDENTIFIED BY 'spring_jdbcpool';

INSERT INTO `user` (`id`, `name`) VALUES (1, 'felix');


