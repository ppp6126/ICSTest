-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: icsdb
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `ID` bigint(20) NOT NULL,
  `CATEGORY_NAME` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `GENDER` tinyblob,
  `SIZES` tinyblob,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (24,'Plain',_binary '�\�\0ur\0[Ljava.lang.String;�\�V\�\�{G\0\0xp\0\0\0t\0	ชาย',_binary '�\�\0ur\0[Ljava.lang.String;�\�V\�\�{G\0\0xp\0\0\0t\0Mt\0Lt\0XL'),(25,'Color',_binary '�\�\0ur\0[Ljava.lang.String;�\�V\�\�{G\0\0xp\0\0\0t\0	ชายt\0หญิง',_binary '�\�\0ur\0[Ljava.lang.String;�\�V\�\�{G\0\0xp\0\0\0t\0SXt\0St\0Mt\0Lt\0XL'),(26,'Pattern',_binary '�\�\0ur\0[Ljava.lang.String;�\�V\�\�{G\0\0xp\0\0\0t\0	ชายt\0หญิง',_binary '�\�\0ur\0[Ljava.lang.String;�\�V\�\�{G\0\0xp\0\0\0t\0St\0Mt\0Lt\0XL'),(27,'Figure',_binary '�\�\0ur\0[Ljava.lang.String;�\�V\�\�{G\0\0xp\0\0\0t\0หญิง',_binary '�\�\0ur\0[Ljava.lang.String;�\�V\�\�{G\0\0xp\0\0\0t\0SXt\0St\0M');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-19 15:49:14
