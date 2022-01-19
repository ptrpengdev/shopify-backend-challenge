DROP TABLE IF EXISTS location;
DROP TABLE IF EXISTS inventory;

CREATE TABLE location (
  `id` int NOT NULL AUTO_INCREMENT,
  `location` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `location_UNIQUE` (`location`)
);

CREATE TABLE inventory (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_name` varchar(45) NOT NULL,
  `product_type` varchar(45) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  `location` int NOT NULL,
  `quantity` int NOT NULL DEFAULT '0',
  `updated_dt` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_dt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_prod_location` (`product_name`,`location`),
  foreign key (location) references location(id)
 
);
