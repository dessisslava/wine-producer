CREATE DATABASE  IF NOT EXISTS `grapesproducernorth` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `grapesproducernorth`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: grapesproducernorth
-- ------------------------------------------------------
-- Server version	5.6.14-enterprise-commercial-advanced-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `delivery_estimation`
--

DROP TABLE IF EXISTS `delivery_estimation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `delivery_estimation` (
  `Region` varchar(20) NOT NULL,
  `Delivery_Time` int(11) DEFAULT NULL,
  PRIMARY KEY (`Region`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivery_estimation`
--

LOCK TABLES `delivery_estimation` WRITE;
/*!40000 ALTER TABLE `delivery_estimation` DISABLE KEYS */;
INSERT INTO `delivery_estimation` VALUES ('HER',48),('RET',72);
/*!40000 ALTER TABLE `delivery_estimation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grapes_inventory`
--

DROP TABLE IF EXISTS `grapes_inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grapes_inventory` (
  `Id_grapes` int(11) NOT NULL AUTO_INCREMENT,
  `Grapes_variety` varchar(45) NOT NULL,
  `Quantity_Available` double DEFAULT NULL,
  `Price` double DEFAULT NULL,
  `Quantity_reserved` double DEFAULT NULL,
  PRIMARY KEY (`Id_grapes`,`Grapes_variety`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grapes_inventory`
--

LOCK TABLES `grapes_inventory` WRITE;
/*!40000 ALTER TABLE `grapes_inventory` DISABLE KEYS */;
INSERT INTO `grapes_inventory` VALUES (1,'RED',6485,10,925),(2,'WHITE',7661,13.4,NULL),(3,'BLUE',3570,23,NULL);
/*!40000 ALTER TABLE `grapes_inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grapes_orders`
--

DROP TABLE IF EXISTS `grapes_orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grapes_orders` (
  `Order_Id` varchar(20) NOT NULL,
  `Order_date` date DEFAULT NULL,
  `Grapes_variety` varchar(45) DEFAULT NULL,
  `Quantity` varchar(45) DEFAULT NULL,
  `Order_Status` varchar(45) DEFAULT NULL,
  `Delivery_address` varchar(45) DEFAULT NULL,
  `Expected_delivery_date` date DEFAULT NULL,
  `Transportation_company` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Order_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grapes_orders`
--

LOCK TABLES `grapes_orders` WRITE;
/*!40000 ALTER TABLE `grapes_orders` DISABLE KEYS */;
INSERT INTO `grapes_orders` VALUES ('116lc4atqa','2014-06-19','RED','100.0','Waiting','HER',NULL,NULL),('1tq7pojpfc','2014-06-19','RED','100.0','Waiting','HER',NULL,NULL),('cfog5p4ipm','2014-06-19','RED','100.0','Waiting','HER',NULL,NULL),('cn44l03jkk','2014-06-19','RED','100.0','Waiting','HER',NULL,NULL),('dupm3dg0cu','2014-06-19','RED','10.0','Waiting','HER',NULL,NULL),('fbondoc5fm','2014-06-19','RED','100.0','Waiting','HER',NULL,NULL),('fimn5a678k','2014-06-19','RED','100.0','Waiting','HER',NULL,NULL),('lq6si63ku','2014-06-19','RED','100.0','Waiting','HER',NULL,NULL),('ls310dfj64','2014-06-19','RED','5.0','Waiting','HER',NULL,NULL),('o1vj56k5vi','2014-06-19','RED','5.0','Waiting','HER',NULL,NULL),('sme5p1vv7l','2014-06-19','RED','5.0','Waiting','HER',NULL,NULL);
/*!40000 ALTER TABLE `grapes_orders` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-06-19 20:04:49
CREATE DATABASE  IF NOT EXISTS `grapesproducersouth` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `grapesproducersouth`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: grapesproducersouth
-- ------------------------------------------------------
-- Server version	5.6.14-enterprise-commercial-advanced-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `delivery_estimation`
--

DROP TABLE IF EXISTS `delivery_estimation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `delivery_estimation` (
  `Region` varchar(20) NOT NULL,
  `Delivery_Time` int(11) DEFAULT NULL,
  PRIMARY KEY (`Region`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivery_estimation`
--

LOCK TABLES `delivery_estimation` WRITE;
/*!40000 ALTER TABLE `delivery_estimation` DISABLE KEYS */;
INSERT INTO `delivery_estimation` VALUES ('HER',48),('RET',72);
/*!40000 ALTER TABLE `delivery_estimation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grapes_inventory`
--

DROP TABLE IF EXISTS `grapes_inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grapes_inventory` (
  `Id_grapes` int(11) NOT NULL AUTO_INCREMENT,
  `Grapes_variety` varchar(45) NOT NULL,
  `Quantity_Available` double DEFAULT NULL,
  `Price` double DEFAULT NULL,
  PRIMARY KEY (`Id_grapes`,`Grapes_variety`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grapes_inventory`
--

LOCK TABLES `grapes_inventory` WRITE;
/*!40000 ALTER TABLE `grapes_inventory` DISABLE KEYS */;
INSERT INTO `grapes_inventory` VALUES (1,'RED',2500,12),(2,'WHITE',5000,15);
/*!40000 ALTER TABLE `grapes_inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grapes_orders`
--

DROP TABLE IF EXISTS `grapes_orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grapes_orders` (
  `Order_Id` varchar(20) NOT NULL,
  `Order_date` date DEFAULT NULL,
  `Grapes_variety` varchar(45) DEFAULT NULL,
  `Quantity` varchar(45) DEFAULT NULL,
  `Order_Status` varchar(45) DEFAULT NULL,
  `Delivery_address` varchar(45) DEFAULT NULL,
  `Expected_delivery_date` date DEFAULT NULL,
  `Transportation_company` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Order_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grapes_orders`
--

LOCK TABLES `grapes_orders` WRITE;
/*!40000 ALTER TABLE `grapes_orders` DISABLE KEYS */;
INSERT INTO `grapes_orders` VALUES ('fo30gpjhj5','2014-06-19','WHITE','10.0','Waiting','HER',NULL,NULL),('ssd3jpktl4','2014-06-19','RED','10.0','Waiting','HER',NULL,NULL);
/*!40000 ALTER TABLE `grapes_orders` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-06-19 20:04:49
