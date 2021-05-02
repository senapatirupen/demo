-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ecomapp
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `ad_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `address_line_one` varchar(255) NOT NULL,
  `address_line_two` varchar(255) NOT NULL,
  `city_village` varchar(255) NOT NULL,
  `country` varchar(255) NOT NULL,
  `landmark` varchar(255) NOT NULL,
  `pe_id` bigint DEFAULT NULL,
  `state` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `zipcode` varchar(255) NOT NULL,
  PRIMARY KEY (`ad_id`),
  KEY `FKkfx142sdliilfsugydhdwxow5` (`pe_id`),
  CONSTRAINT `FKkfx142sdliilfsugydhdwxow5` FOREIGN KEY (`pe_id`) REFERENCES `person` (`pe_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'Rupen','2021-05-02 20:18:08.161000',_binary '','Rupen','2021-05-02 20:18:08.161000','Active','Sanathanarcade','Belathur','Bangalore','India','near hdfc bank',1,'Karnataka','BILLING','560076');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `billing_address`
--

DROP TABLE IF EXISTS `billing_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `billing_address` (
  `biad_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `address_line_one` varchar(255) DEFAULT NULL,
  `address_line_two` varchar(255) DEFAULT NULL,
  `city_village` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `landmark` varchar(255) DEFAULT NULL,
  `od_id` bigint DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `zipcode` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`biad_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `billing_address`
--

LOCK TABLES `billing_address` WRITE;
/*!40000 ALTER TABLE `billing_address` DISABLE KEYS */;
INSERT INTO `billing_address` VALUES (1,'Rupen','2021-05-02 20:18:19.306000',_binary '','Rupen','2021-05-02 20:18:19.306000','Active',NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,'560076');
/*!40000 ALTER TABLE `billing_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'Java'),(2,'Node'),(3,'Python');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart` (
  `ca_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `cart_status` varchar(255) NOT NULL,
  `pe_id` bigint NOT NULL,
  PRIMARY KEY (`ca_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT INTO `cart` VALUES (1,'Rupen','2021-05-02 20:37:20.207000',_binary '','Rupen','2021-05-02 20:37:49.395000','Active','open',1);
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classics`
--

DROP TABLE IF EXISTS `classics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `classics` (
  `author` varchar(128) DEFAULT NULL,
  `title` varchar(128) DEFAULT NULL,
  `type` varchar(16) DEFAULT NULL,
  `year` char(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classics`
--

LOCK TABLES `classics` WRITE;
/*!40000 ALTER TABLE `classics` DISABLE KEYS */;
/*!40000 ALTER TABLE `classics` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delivery`
--

DROP TABLE IF EXISTS `delivery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `delivery` (
  `de_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `delivery_status` varchar(255) NOT NULL,
  `end_date` datetime(6) DEFAULT NULL,
  `expected_date` datetime(6) DEFAULT NULL,
  `is_delivered` bit(1) DEFAULT NULL,
  `packaging_status` varchar(255) DEFAULT NULL,
  `pr_ids` varchar(255) DEFAULT NULL,
  `product_health_status` varchar(255) DEFAULT NULL,
  `sh_id` bigint DEFAULT NULL,
  `start_date` datetime(6) DEFAULT NULL,
  `dead_id` bigint DEFAULT NULL,
  PRIMARY KEY (`de_id`),
  KEY `FKd4boqr4fgj2ixrjbr3v5ktbd9` (`dead_id`),
  CONSTRAINT `FKd4boqr4fgj2ixrjbr3v5ktbd9` FOREIGN KEY (`dead_id`) REFERENCES `delivery_address` (`dead_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivery`
--

LOCK TABLES `delivery` WRITE;
/*!40000 ALTER TABLE `delivery` DISABLE KEYS */;
INSERT INTO `delivery` VALUES (1,'Rupen','2021-05-02 20:27:11.254000',_binary '','Rupen','2021-05-02 20:27:11.434000','Active','OPEN',NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,1);
/*!40000 ALTER TABLE `delivery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delivery_address`
--

DROP TABLE IF EXISTS `delivery_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `delivery_address` (
  `dead_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `address_line_one` varchar(255) DEFAULT NULL,
  `address_line_two` varchar(255) DEFAULT NULL,
  `city_village` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `de_id` bigint DEFAULT NULL,
  `landmark` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `type` varchar(255) NOT NULL,
  `zipcode` varchar(255) NOT NULL,
  PRIMARY KEY (`dead_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivery_address`
--

LOCK TABLES `delivery_address` WRITE;
/*!40000 ALTER TABLE `delivery_address` DISABLE KEYS */;
INSERT INTO `delivery_address` VALUES (1,'Rupen','2021-05-02 20:27:11.272000',_binary '','Rupen','2021-05-02 20:27:11.272000','Active','Sanathanarcade','Belathur','Bangalore','India',NULL,'near hdfc bank','Karnataka','DELIVERY','560076');
/*!40000 ALTER TABLE `delivery_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback` (
  `fe_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `feedback` varchar(255) NOT NULL,
  `or_ids` varchar(255) DEFAULT NULL,
  `pr_id` bigint DEFAULT NULL,
  `rating` varchar(255) NOT NULL,
  `review` varchar(255) NOT NULL,
  PRIMARY KEY (`fe_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invoice` (
  `in_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `authorized_signature` varchar(255) NOT NULL,
  `cgst` float NOT NULL,
  `cin` varchar(255) NOT NULL,
  `communication_address` varchar(255) NOT NULL,
  `customer_detail` varchar(255) NOT NULL,
  `customer_name` varchar(255) NOT NULL,
  `discount` float NOT NULL,
  `grand_total` float NOT NULL,
  `gross_amount` float NOT NULL,
  `gstin` varchar(255) NOT NULL,
  `invoice_number` varchar(255) NOT NULL,
  `od_id` bigint NOT NULL,
  `order_start_date` datetime(6) NOT NULL,
  `pan` varchar(255) NOT NULL,
  `pe_id` bigint NOT NULL,
  `pr_id` bigint NOT NULL,
  `product_detail` varchar(255) NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `qty` bigint NOT NULL,
  `sgst` float NOT NULL,
  `sh_id` bigint NOT NULL,
  `ship_from_address` varchar(255) NOT NULL,
  `ship_to_address` varchar(255) NOT NULL,
  `start_date` datetime(6) NOT NULL,
  `taxable_amount` float NOT NULL,
  `total_amount` float NOT NULL,
  PRIMARY KEY (`in_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opt`
--

DROP TABLE IF EXISTS `opt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `opt` (
  `option_id` bigint NOT NULL AUTO_INCREMENT,
  `option_value` varchar(255) DEFAULT NULL,
  `poll_id` bigint DEFAULT NULL,
  PRIMARY KEY (`option_id`),
  KEY `FKmc600s03k6a9raj0p0kcilmxs` (`poll_id`),
  CONSTRAINT `FKmc600s03k6a9raj0p0kcilmxs` FOREIGN KEY (`poll_id`) REFERENCES `poll` (`poll_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opt`
--

LOCK TABLES `opt` WRITE;
/*!40000 ALTER TABLE `opt` DISABLE KEYS */;
/*!40000 ALTER TABLE `opt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `pa_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `offer_percentage` float DEFAULT NULL,
  `payment_status` varchar(255) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pa_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES (1,'Rupen','2021-05-02 20:18:54.421000',_binary '','Rupen','2021-05-02 20:18:54.421000','Active',NULL,NULL,NULL,11000,NULL);
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pe_order`
--

DROP TABLE IF EXISTS `pe_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pe_order` (
  `od_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `end_date` datetime(6) DEFAULT NULL,
  `expected_date` datetime(6) DEFAULT NULL,
  `is_delivered` bit(1) DEFAULT NULL,
  `order_status` varchar(255) DEFAULT NULL,
  `pe_id` bigint DEFAULT NULL,
  `start_date` datetime(6) DEFAULT NULL,
  `biad_id` bigint DEFAULT NULL,
  `pa_id` bigint DEFAULT NULL,
  PRIMARY KEY (`od_id`),
  KEY `FKnn05n66e4p1k98ct23d7warmb` (`biad_id`),
  KEY `FKgxyrgeuqgp8nafd6tl7sempst` (`pa_id`),
  KEY `FK4wrjbyca22i8xgcvhoowfeyvo` (`pe_id`),
  CONSTRAINT `FK4wrjbyca22i8xgcvhoowfeyvo` FOREIGN KEY (`pe_id`) REFERENCES `person` (`pe_id`),
  CONSTRAINT `FKgxyrgeuqgp8nafd6tl7sempst` FOREIGN KEY (`pa_id`) REFERENCES `payment` (`pa_id`),
  CONSTRAINT `FKnn05n66e4p1k98ct23d7warmb` FOREIGN KEY (`biad_id`) REFERENCES `billing_address` (`biad_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pe_order`
--

LOCK TABLES `pe_order` WRITE;
/*!40000 ALTER TABLE `pe_order` DISABLE KEYS */;
INSERT INTO `pe_order` VALUES (1,'Rupen','2021-05-02 19:58:51.789000',_binary '','Rupen','2021-05-02 20:18:54.488000','Active',NULL,NULL,NULL,NULL,1,NULL,1,1),(2,'Rupen','2021-05-02 20:37:49.236000',_binary '','Rupen','2021-05-02 20:37:49.395000','Active',NULL,NULL,NULL,NULL,1,NULL,NULL,NULL);
/*!40000 ALTER TABLE `pe_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person` (
  `pe_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `ca_id` bigint DEFAULT NULL,
  `us_id` bigint DEFAULT NULL,
  PRIMARY KEY (`pe_id`),
  KEY `FK3m9h8dnu75f0ue2nqp8456jbl` (`ca_id`),
  KEY `FKdp8n98ams22jyyifgnpslqt6n` (`us_id`),
  CONSTRAINT `FK3m9h8dnu75f0ue2nqp8456jbl` FOREIGN KEY (`ca_id`) REFERENCES `cart` (`ca_id`),
  CONSTRAINT `FKdp8n98ams22jyyifgnpslqt6n` FOREIGN KEY (`us_id`) REFERENCES `user_detail` (`us_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (1,'Rupen','2021-05-02 19:46:23.664000',_binary '','Rupen','2021-05-02 20:37:20.394000','Active',1,1);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `poll`
--

DROP TABLE IF EXISTS `poll`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `poll` (
  `poll_id` bigint NOT NULL AUTO_INCREMENT,
  `question` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`poll_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `poll`
--

LOCK TABLES `poll` WRITE;
/*!40000 ALTER TABLE `poll` DISABLE KEYS */;
/*!40000 ALTER TABLE `poll` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `pr_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `mrp` float DEFAULT NULL,
  `ca_id` bigint DEFAULT NULL,
  `discount_on_mrp` float DEFAULT NULL,
  `is_stock_available` bit(1) NOT NULL,
  `model` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `od_id` bigint DEFAULT NULL,
  `pe_id` bigint DEFAULT NULL,
  `product_status` varchar(255) NOT NULL,
  `sell_price` float DEFAULT NULL,
  `fe_id` bigint DEFAULT NULL,
  `wi_id` bigint DEFAULT NULL,
  PRIMARY KEY (`pr_id`),
  KEY `FKsto6oh2hd0x9xjnyem14csl4k` (`fe_id`),
  KEY `FKojnu4esj76lvwgxxvn6tlkuxn` (`wi_id`),
  KEY `FKeda5kdrr58kw60yyusmxyicvg` (`pe_id`),
  KEY `FKqva1g3pxp6etddtjq3cds6654` (`od_id`),
  KEY `FK60xrjhcxbs1ejh5ly13j680by` (`ca_id`),
  CONSTRAINT `FK60xrjhcxbs1ejh5ly13j680by` FOREIGN KEY (`ca_id`) REFERENCES `cart` (`ca_id`),
  CONSTRAINT `FKeda5kdrr58kw60yyusmxyicvg` FOREIGN KEY (`pe_id`) REFERENCES `person` (`pe_id`),
  CONSTRAINT `FKojnu4esj76lvwgxxvn6tlkuxn` FOREIGN KEY (`wi_id`) REFERENCES `wish_list` (`wi_id`),
  CONSTRAINT `FKqva1g3pxp6etddtjq3cds6654` FOREIGN KEY (`od_id`) REFERENCES `pe_order` (`od_id`),
  CONSTRAINT `FKsto6oh2hd0x9xjnyem14csl4k` FOREIGN KEY (`fe_id`) REFERENCES `feedback` (`fe_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'Rupen','2021-05-02 19:58:06.058000',_binary '','Rupen','2021-05-02 20:37:49.286000','Active',NULL,NULL,NULL,_binary '','iphone6','iphone',2,NULL,'Available',11000,NULL,NULL);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_description`
--

DROP TABLE IF EXISTS `product_description`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_description` (
  `prde_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `long_desc` longblob,
  `short_desc` longblob,
  PRIMARY KEY (`prde_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_description`
--

LOCK TABLES `product_description` WRITE;
/*!40000 ALTER TABLE `product_description` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_description` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_feature`
--

DROP TABLE IF EXISTS `product_feature`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_feature` (
  `prfe_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `description` longblob NOT NULL,
  `highlight` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  PRIMARY KEY (`prfe_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_feature`
--

LOCK TABLES `product_feature` WRITE;
/*!40000 ALTER TABLE `product_feature` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_feature` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_filter`
--

DROP TABLE IF EXISTS `product_filter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_filter` (
  `prfi_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `filter` varchar(255) NOT NULL,
  PRIMARY KEY (`prfi_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_filter`
--

LOCK TABLES `product_filter` WRITE;
/*!40000 ALTER TABLE `product_filter` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_filter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_inventory`
--

DROP TABLE IF EXISTS `product_inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_inventory` (
  `prin_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `exp_date` datetime(6) NOT NULL,
  `mfd_date` datetime(6) NOT NULL,
  `model` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `offer_percentage` float NOT NULL,
  `price` float NOT NULL,
  `product_status` varchar(255) NOT NULL,
  `specification` varchar(255) NOT NULL,
  `prde_id` bigint DEFAULT NULL,
  `prsp_id` bigint DEFAULT NULL,
  `st_id` bigint DEFAULT NULL,
  PRIMARY KEY (`prin_id`),
  KEY `FKny6wvd9u9g54dfgvlhtkd9y36` (`prde_id`),
  KEY `FK7lq8wyw7os4h2ymmig2wwoqmh` (`prsp_id`),
  KEY `FK59eci0e6vwxwpp7cp9s45hyvy` (`st_id`),
  CONSTRAINT `FK59eci0e6vwxwpp7cp9s45hyvy` FOREIGN KEY (`st_id`) REFERENCES `stock` (`st_id`),
  CONSTRAINT `FK7lq8wyw7os4h2ymmig2wwoqmh` FOREIGN KEY (`prsp_id`) REFERENCES `product_specification` (`prsp_id`),
  CONSTRAINT `FKny6wvd9u9g54dfgvlhtkd9y36` FOREIGN KEY (`prde_id`) REFERENCES `product_description` (`prde_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_inventory`
--

LOCK TABLES `product_inventory` WRITE;
/*!40000 ALTER TABLE `product_inventory` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_specification`
--

DROP TABLE IF EXISTS `product_specification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_specification` (
  `prsp_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `category` varchar(255) DEFAULT NULL,
  `info` longblob,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`prsp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_specification`
--

LOCK TABLES `product_specification` WRITE;
/*!40000 ALTER TABLE `product_specification` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_specification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receipt`
--

DROP TABLE IF EXISTS `receipt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `receipt` (
  `re_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  PRIMARY KEY (`re_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receipt`
--

LOCK TABLES `receipt` WRITE;
/*!40000 ALTER TABLE `receipt` DISABLE KEYS */;
/*!40000 ALTER TABLE `receipt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `return_address`
--

DROP TABLE IF EXISTS `return_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `return_address` (
  `read_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `address_line_one` varchar(255) DEFAULT NULL,
  `address_line_two` varchar(255) DEFAULT NULL,
  `city_village` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `landmark` varchar(255) DEFAULT NULL,
  `re_id` bigint DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `type` varchar(255) NOT NULL,
  `zipcode` varchar(255) NOT NULL,
  PRIMARY KEY (`read_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `return_address`
--

LOCK TABLES `return_address` WRITE;
/*!40000 ALTER TABLE `return_address` DISABLE KEYS */;
INSERT INTO `return_address` VALUES (1,'Rupen','2021-05-02 20:27:36.020000',_binary '','Rupen','2021-05-02 20:27:36.020000','Active','Sanathanarcade','Belathur','Bangalore','India','near hdfc bank',NULL,'Karnataka','PICKUP','560076');
/*!40000 ALTER TABLE `return_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `return_product`
--

DROP TABLE IF EXISTS `return_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `return_product` (
  `re_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `end_date` datetime(6) DEFAULT NULL,
  `expected_date` datetime(6) DEFAULT NULL,
  `is_returned` bit(1) DEFAULT NULL,
  `pr_ids` varchar(255) DEFAULT NULL,
  `return_status` varchar(255) NOT NULL,
  `sh_id` bigint DEFAULT NULL,
  `start_date` datetime(6) DEFAULT NULL,
  `read_id` bigint DEFAULT NULL,
  PRIMARY KEY (`re_id`),
  KEY `FKfionvmlkaa5fhmhjeblm8j011` (`read_id`),
  CONSTRAINT `FKfionvmlkaa5fhmhjeblm8j011` FOREIGN KEY (`read_id`) REFERENCES `return_address` (`read_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `return_product`
--

LOCK TABLES `return_product` WRITE;
/*!40000 ALTER TABLE `return_product` DISABLE KEYS */;
INSERT INTO `return_product` VALUES (1,'Rupen','2021-05-02 20:27:36.020000',_binary '','Rupen','2021-05-02 20:27:36.079000','Active',NULL,NULL,NULL,NULL,'OPEN',2,NULL,1);
/*!40000 ALTER TABLE `return_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shipping`
--

DROP TABLE IF EXISTS `shipping`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shipping` (
  `sh_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `courier_person` varchar(255) DEFAULT NULL,
  `end_date` datetime(6) DEFAULT NULL,
  `expected_date` datetime(6) DEFAULT NULL,
  `od_id` bigint DEFAULT NULL,
  `packaging_charge` float DEFAULT NULL,
  `pr_ids` varchar(255) DEFAULT NULL,
  `product_health_status` varchar(255) DEFAULT NULL,
  `shipping_status` varchar(255) NOT NULL,
  `start_date` datetime(6) DEFAULT NULL,
  `areturn_re_id` bigint DEFAULT NULL,
  `delivery_de_id` bigint DEFAULT NULL,
  `shad_id` bigint DEFAULT NULL,
  PRIMARY KEY (`sh_id`),
  KEY `FKn9upunen21kg62fcwu4tyloul` (`areturn_re_id`),
  KEY `FK1x7svpgdjp69goy46i5xk85dp` (`delivery_de_id`),
  KEY `FKcsel91x6ift4apgerqa5y1u0a` (`shad_id`),
  KEY `FKrg1qvbla3s0fenugy8nssohst` (`od_id`),
  CONSTRAINT `FK1x7svpgdjp69goy46i5xk85dp` FOREIGN KEY (`delivery_de_id`) REFERENCES `delivery` (`de_id`),
  CONSTRAINT `FKcsel91x6ift4apgerqa5y1u0a` FOREIGN KEY (`shad_id`) REFERENCES `shipping_address` (`shad_id`),
  CONSTRAINT `FKn9upunen21kg62fcwu4tyloul` FOREIGN KEY (`areturn_re_id`) REFERENCES `return_product` (`re_id`),
  CONSTRAINT `FKrg1qvbla3s0fenugy8nssohst` FOREIGN KEY (`od_id`) REFERENCES `pe_order` (`od_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shipping`
--

LOCK TABLES `shipping` WRITE;
/*!40000 ALTER TABLE `shipping` DISABLE KEYS */;
INSERT INTO `shipping` VALUES (1,'Rupen','2021-05-02 20:27:11.378000',_binary '','Rupen','2021-05-02 20:27:11.378000','Active',NULL,NULL,NULL,1,NULL,NULL,NULL,'OPEN',NULL,NULL,1,NULL),(2,'Rupen','2021-05-02 20:27:36.046000',_binary '','Rupen','2021-05-02 20:27:36.046000','Active',NULL,NULL,NULL,1,NULL,NULL,NULL,'OPEN',NULL,1,NULL,NULL);
/*!40000 ALTER TABLE `shipping` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shipping_address`
--

DROP TABLE IF EXISTS `shipping_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shipping_address` (
  `shad_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `address_line_one` varchar(255) DEFAULT NULL,
  `address_line_two` varchar(255) DEFAULT NULL,
  `city_village` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `landmark` varchar(255) DEFAULT NULL,
  `sh_id` bigint DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `type` varchar(255) NOT NULL,
  `zipcode` varchar(255) NOT NULL,
  PRIMARY KEY (`shad_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shipping_address`
--

LOCK TABLES `shipping_address` WRITE;
/*!40000 ALTER TABLE `shipping_address` DISABLE KEYS */;
/*!40000 ALTER TABLE `shipping_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock` (
  `st_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `end_date` datetime(6) NOT NULL,
  `expected_date` datetime(6) NOT NULL,
  `is_available` bit(1) NOT NULL,
  `name` varchar(255) NOT NULL,
  `quantity` int NOT NULL,
  `start_date` datetime(6) NOT NULL,
  `stock_status` varchar(255) NOT NULL,
  PRIMARY KEY (`st_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_detail`
--

DROP TABLE IF EXISTS `user_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_detail` (
  `us_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `dob` datetime(6) NOT NULL,
  `email_id` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone_number` varchar(255) NOT NULL,
  `re_password` varchar(255) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  PRIMARY KEY (`us_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_detail`
--

LOCK TABLES `user_detail` WRITE;
/*!40000 ALTER TABLE `user_detail` DISABLE KEYS */;
INSERT INTO `user_detail` VALUES (1,'Rupen','2021-05-02 19:46:23.541000',_binary '','Rupen','2021-05-02 19:46:23.541000','Active','2020-12-26 00:00:00.000000','se@gmail.com','rupen','senapati','thispassword','8147713016','thispassword','senapati');
/*!40000 ALTER TABLE `user_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_role` (
  `ur_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  PRIMARY KEY (`ur_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `user_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `admin` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vote`
--

DROP TABLE IF EXISTS `vote`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vote` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `option_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK7e840almsnlpf4u142ecjl3g1` (`option_id`),
  CONSTRAINT `FK7e840almsnlpf4u142ecjl3g1` FOREIGN KEY (`option_id`) REFERENCES `opt` (`option_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vote`
--

LOCK TABLES `vote` WRITE;
/*!40000 ALTER TABLE `vote` DISABLE KEYS */;
/*!40000 ALTER TABLE `vote` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wish_list`
--

DROP TABLE IF EXISTS `wish_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `wish_list` (
  `wi_id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) NOT NULL,
  `created_date` datetime(6) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `last_modified_by` varchar(255) NOT NULL,
  `last_modified_date` datetime(6) NOT NULL,
  `status` varchar(255) NOT NULL,
  `wish_list_status` varchar(255) NOT NULL,
  PRIMARY KEY (`wi_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wish_list`
--

LOCK TABLES `wish_list` WRITE;
/*!40000 ALTER TABLE `wish_list` DISABLE KEYS */;
/*!40000 ALTER TABLE `wish_list` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-02 20:41:00
