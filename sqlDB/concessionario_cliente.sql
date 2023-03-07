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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `CF` char(20) NOT NULL,
  `sesso` char(20) NOT NULL,
  `nome` char(20) NOT NULL,
  `cognome` char(20) NOT NULL,
  `indirizzo` char(40) NOT NULL,
  `città` char(20) NOT NULL,
  `data_di_nascita` date NOT NULL,
  PRIMARY KEY (`CF`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('GGDR1865GFEEFE','M','Giuseppe','Romano','Via Torre 8','Pisa','1970-12-21'),('GHIER45687YRIG','M','Gianmarco','Rossi','Viale Kennedy 54876','Napoli','1999-05-11'),('GNMCPT911210SA','M','Gianmarco','Capitani','Via Roma 10','Salerno','1998-12-10'),('MJOPP12345PQWE','M','Michele','Bianchi','Via colosseo 112','Roma','1975-10-10'),('MNLTZN74P18A944M','M','Tiziano','Monaldo','Strada provinciale 146','Bologna','1974-09-18'),('MRCRSS7510FFSA','M','Marco','Rossi','Via Alessandro Manzoni 9','Agropoli','1975-10-05'),('NPLRSN63B51F141J','F','Rossana','Napolitani','Via nazionale 110','Mercogliano','1963-11-02'),('QWERT14785MLPO','M','Armando','Verdi','Via roma 4697','Pisa','1971-05-09'),('QWJKGR1818IRNM','M','Franco','D angiolillo','Via del mare 7','Napoli','1966-07-01'),('SASPO19283PQMZ','F','Daniela','Verdi','Via 24 Maggio 15478','Roma','1989-08-07'),('TNMCET91231OSA','F','Angela','Rizzo','Via roma 7','Avellno','1999-10-05'),('TRVMRZ71D61B354J','F','Marzia','Trevisan','Vicolo Calcirelli 108','Cagliari','1971-04-21'),('YJYTJ12345FEFR','F','Francesca','Bianchi','Via duomo 78945','Milano','1989-11-11');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
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
