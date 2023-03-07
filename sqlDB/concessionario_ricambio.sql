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
-- Table structure for table `ricambio`
--

DROP TABLE IF EXISTS `ricambio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ricambio` (
  `Modello` char(30) NOT NULL,
  `costo` float NOT NULL,
  `nome` char(20) NOT NULL,
  PRIMARY KEY (`Modello`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ricambio`
--

LOCK TABLES `ricambio` WRITE;
/*!40000 ALTER TABLE `ricambio` DISABLE KEYS */;
INSERT INTO `ricambio` VALUES ('batteria_bmw_x5',250,'ridex'),('batteria_panda_2serie',230,'bosch'),('candela_ducati_moonster',50,'ducati'),('candela_yamaha_r3',60,'yamaha'),('candela_yamaha_r6',70,'yamaha'),('filtro_bmw_gs',20,'mannfilter'),('filtro_ducati_999',30,'ken'),('filtro_ducati_diavel',30,'mannfilter'),('gomma_bmw_m3',290,'bridgeston'),('gomma_bmw_x5',270,'riken'),('gomma_fiat_tipo',230,'nexel'),('lampadina_bmw_x5',50,'osram'),('lampadina_faro_bmw1200gt',30,'osram'),('lampadina_faro_ducati',30,'osram'),('lampadina_faro_yamahaxjr',30,'osram'),('lampadina_faro_yamahaxmax',30,'osram'),('olio_m_duster',50,'shell'),('olio_m_multipla',50,'total'),('olio_m_stelvio',50,'mobyng'),('pastiglie_freno_bwm_1_serie',120,'bosch'),('pastiglie_freno_fiat_500',100,'ridex'),('pastiglie_freno_panda_2_serie',80,'brembo'),('pinza_freno_bmw1serie',150,'abs'),('pinza_freno_c3_picasso',130,'abs'),('pinza_freno_panda_2_serie',180,'ridex');
/*!40000 ALTER TABLE `ricambio` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-08 17:59:35
