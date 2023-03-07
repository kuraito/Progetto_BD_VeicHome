-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: concessionario
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `dispone`
--

DROP TABLE IF EXISTS `dispone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dispone` (
  `dispone_moto_veicolo_TARGA` char(10) NOT NULL,
  `dispone_accessori_CODICE` int NOT NULL,
  PRIMARY KEY (`dispone_moto_veicolo_TARGA`,`dispone_accessori_CODICE`),
  KEY `dispone_accessori_CODICE` (`dispone_accessori_CODICE`),
  CONSTRAINT `dispone_ibfk_1` FOREIGN KEY (`dispone_moto_veicolo_TARGA`) REFERENCES `moto` (`moto_veicolo_TARGA`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `dispone_ibfk_2` FOREIGN KEY (`dispone_accessori_CODICE`) REFERENCES `accessori` (`Codice`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dispone`
--

LOCK TABLES `dispone` WRITE;
/*!40000 ALTER TABLE `dispone` DISABLE KEYS */;
INSERT INTO `dispone` VALUES ('bh765ui',12356),('hu868hk',12557),('rr713sa',12557),('gs781hj',23435),('sd982nd',23435),('vg790cv',27351),('gu234vb',27633),('rr713sa',27633),('as351dn',28163),('bh765ui',28273),('as351dn',29476),('gu234vb',33423),('rr713sa',33423),('gs781hj',34256),('gu234vb',34256),('gs781hj',34353),('sd982nd',34353),('hu868hk',44864),('rw321ha',45665),('yi780bh',45665),('as351dn',58576),('yi780bh',58576),('rw321ha',67687),('sd982nd',67687),('hu868hk',74624),('vg790cv',93735),('vg790cv',95735),('bh765ui',98538),('rw321ha',98989),('yi780bh',98989);
/*!40000 ALTER TABLE `dispone` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-08 17:59:36
