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
-- Table structure for table `ricambio_info`
--

DROP TABLE IF EXISTS `ricambio_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ricambio_info` (
  `ricambio_MODELLO` char(30) NOT NULL,
  `riparazione_CODICE` int NOT NULL,
  PRIMARY KEY (`ricambio_MODELLO`,`riparazione_CODICE`),
  KEY `riparazione_CODICE` (`riparazione_CODICE`),
  CONSTRAINT `ricambio_info_ibfk_2` FOREIGN KEY (`riparazione_CODICE`) REFERENCES `riparazione` (`Codice`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ricambio_info`
--

LOCK TABLES `ricambio_info` WRITE;
/*!40000 ALTER TABLE `ricambio_info` DISABLE KEYS */;
INSERT INTO `ricambio_info` VALUES ('candela_yamaha_r6',20),('pinza_freno_panda_2_serie',35),('gomma_bmw_x5',50),('lampadina_bmw_x5',50),('batteria_bmw_x5',75),('pastiglie_freno_panda_2_serie',80),('pastiglie_freno_bwm_1_serie',90),('pinza_freno_bmw1serie',100),('batteria_panda_2serie',150),('pastiglie_freno_panda_2_serie',150),('pinza_freno_panda_2_serie',150),('olio_m_stelvio',237),('candela_yamaha_r3',468),('lampadina_faro_yamahaxmax',646),('olio_m_multipla',2387),('candela_ducati_moonster',22140),('filtro_ducati_999',87964),('lampadina_faro_ducati',325489),('lampadina_faro_bmw1200gt',387543),('lampadina_faro_yamahaxjr',536947),('olio_m_duster',546754),('gomma_fiat_tipo',632145),('gomma_bmw_m3',697420),('filtro_ducati_diavel',876543),('pastiglie_freno_fiat_500',986244),('pinza_freno_c3_picasso',3543894),('filtro_bmw_gs',7116151);
/*!40000 ALTER TABLE `ricambio_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-08 17:59:38
