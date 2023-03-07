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
-- Table structure for table `veicolo`
--

DROP TABLE IF EXISTS `veicolo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `veicolo` (
  `Targa` char(10) NOT NULL,
  `prezzo` float NOT NULL,
  `modello` char(20) NOT NULL,
  `codice_telaio` char(20) NOT NULL,
  `kw` int NOT NULL,
  `colore` char(10) NOT NULL,
  `marchio` char(20) NOT NULL,
  `admin_CF` char(20) NOT NULL,
  PRIMARY KEY (`Targa`),
  KEY `admin_CF` (`admin_CF`),
  CONSTRAINT `veicolo_ibfk_1` FOREIGN KEY (`admin_CF`) REFERENCES `admin` (`CF`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `veicolo`
--

LOCK TABLES `veicolo` WRITE;
/*!40000 ALTER TABLE `veicolo` DISABLE KEYS */;
INSERT INTO `veicolo` VALUES ('as351dn',12500,'monster','5676989j890jk',58,'nero','ducati','DVGVLP37C71A067D'),('bh765ui',14500,'yzf-r3','6505989j789ft',69,'verde','yamaha','DVGVLP37C71A067D'),('bv125af',15500,'duster','7888988h780nm',69,'blu','dacia','BXTTQV56D24A896H'),('d345fh',13500,'tipo','789088h780fg',59,'giallo','fiat','BXTTQV56D24A896H'),('dg767jk',22500,'serie1','1678078g780hj',79,'rosso','bmw','BXTTQV56D24A896H'),('ds123fs',38500,'x5','7898078h780jj',78,'giallo','bmw','BXTTQV56D24A896H'),('ff321hj',49500,'stelvio','7987878h780vb',89,'rosso','alfa_romeo','BXTTQV56D24A896H'),('fg380dh',29990,'Panigale','om3x87rt6jhm5014',157,'Rosso','Ducati','DVGVLP37C71A067D'),('fg789gh',12433,'panda','1250078g780et',69,'bianco','fiat','BXTTQV56D24A896H'),('gh678cx',11500,'multipla','7456788h780yu',59,'rosso','fiat','BXTTQV56D24A896H'),('gs781hj',15500,'999','5688989j780hg',63,'rosso','ducati','DVGVLP37C71A067D'),('gu234vb',17500,'k1200gt','8905989j789hj',69,'blue','bmw','DVGVLP37C71A067D'),('hg4587hg',47000,'Giulia','BKBNwaaj3r2s288',150,'Blu','Alfa_romeo','DVGVLP37C71A067D'),('hu868hk',18500,'multistrada','7895989j456ui',79,'rosso','ducati','DVGVLP37C71A067D'),('jd791ds',25500,'m3','4560788h780df',70,'verde','bmw','BXTTQV56D24A896H'),('rr713sa',13500,'gs','7887789j780ft',79,'nero','bmw','DVGVLP37C71A067D'),('rw321ha',13500,'diavel','5676989j780hg',69,'rosso','ducati','DVGVLP37C71A067D'),('sa802hk',22500,'c3_picasso','7887888h780ft',59,'nero','citroen','BXTTQV56D24A896H'),('sd982nd',11500,'xjr','7455989j789ud',69,'bianco','yamaha','DVGVLP37C71A067D'),('tr234sd',14500,'cinquecento','8987788h780gh',49,'bianco','fiat','BXTTQV56D24A896H'),('vg790cv',14500,'yzf-r6','7805989j789gd',79,'nero','yamaha','DVGVLP37C71A067D'),('yi780bh',5000,'xmax','7489089j789gy',69,'nera','yamaha','DVGVLP37C71A067D');
/*!40000 ALTER TABLE `veicolo` ENABLE KEYS */;
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
