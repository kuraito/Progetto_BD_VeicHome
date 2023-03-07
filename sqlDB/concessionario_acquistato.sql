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
-- Table structure for table `acquistato`
--

DROP TABLE IF EXISTS `acquistato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `acquistato` (
  `acquistato_cliente_CF` char(20) NOT NULL,
  `acquistato_veicolo_TARGA` char(20) NOT NULL,
  PRIMARY KEY (`acquistato_cliente_CF`,`acquistato_veicolo_TARGA`),
  KEY `acquistato_veicolo_TARGA` (`acquistato_veicolo_TARGA`),
  CONSTRAINT `acquistato_ibfk_1` FOREIGN KEY (`acquistato_cliente_CF`) REFERENCES `cliente` (`CF`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `acquistato_ibfk_2` FOREIGN KEY (`acquistato_veicolo_TARGA`) REFERENCES `veicolo` (`Targa`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `acquistato`
--

LOCK TABLES `acquistato` WRITE;
/*!40000 ALTER TABLE `acquistato` DISABLE KEYS */;
INSERT INTO `acquistato` VALUES ('MJOPP12345PQWE','bv125af'),('GGDR1865GFEEFE','d345fh'),('MRCRSS7510FFSA','dg767jk'),('QWJKGR1818IRNM','ds123fs'),('NPLRSN63B51F141J','ff321hj'),('GNMCPT911210SA','fg789gh'),('TNMCET91231OSA','gh678cx'),('TRVMRZ71D61B354J','gs781hj'),('MJOPP12345PQWE','gu234vb'),('YJYTJ12345FEFR','jd791ds'),('QWERT14785MLPO','rr713sa'),('MNLTZN74P18A944M','rw321ha'),('SASPO19283PQMZ','sa802hk'),('TRVMRZ71D61B354J','sd982nd'),('GHIER45687YRIG','tr234sd'),('MNLTZN74P18A944M','yi780bh');
/*!40000 ALTER TABLE `acquistato` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-08 17:59:37
