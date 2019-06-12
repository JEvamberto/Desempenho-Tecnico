-- MySQL dump 10.17  Distrib 10.3.15-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	10.3.15-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `desempenho`
--

DROP TABLE IF EXISTS `desempenho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `desempenho` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `passesTotais` int(11) DEFAULT NULL,
  `passesCertos` int(11) DEFAULT NULL,
  `passesErrados` int(11) DEFAULT NULL,
  `finalizacoesTotais` int(11) DEFAULT NULL,
  `finalizacoesGols` int(11) DEFAULT NULL,
  `dominioTotal` int(11) DEFAULT NULL,
  `dominioCerto` int(11) DEFAULT NULL,
  `dominioErrado` int(11) DEFAULT NULL,
  `desarme` int(11) DEFAULT NULL,
  `gol` int(11) DEFAULT NULL,
  `assistencia` int(11) DEFAULT NULL,
  `drible` int(11) DEFAULT NULL,
  `partida_id` int(11) NOT NULL,
  `jogador_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_desempenho_partida1_idx` (`partida_id`),
  KEY `fk_desempenho_jogador1_idx` (`jogador_id`),
  CONSTRAINT `fk_desempenho_jogador1` FOREIGN KEY (`jogador_id`) REFERENCES `jogador` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_desempenho_partida1` FOREIGN KEY (`partida_id`) REFERENCES `partida` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `desempenho`
--

LOCK TABLES `desempenho` WRITE;
/*!40000 ALTER TABLE `desempenho` DISABLE KEYS */;
INSERT INTO `desempenho` VALUES (2,63,13,50,63,60,100,30,70,40,3,10,20,1,1),(4,100,50,50,7,4,100,30,70,40,3,10,20,1,2),(5,100,50,50,7,4,100,30,70,40,3,10,20,2,2),(6,53,13,40,6,2,100,30,70,22,4,18,12,1,3),(7,59,19,40,9,2,100,30,70,10,7,10,5,1,10),(8,80,40,40,4,2,100,30,70,15,2,8,20,1,12),(10,7,0,7,2,1,18,9,9,7,1,5,20,3,3);
/*!40000 ALTER TABLE `desempenho` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jogador`
--

DROP TABLE IF EXISTS `jogador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jogador` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `dataNascimento` varchar(45) DEFAULT NULL,
  `posicao` varchar(45) DEFAULT NULL,
  `melhorPe` varchar(45) DEFAULT NULL,
  `time_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_jogador_time1_idx` (`time_id`),
  CONSTRAINT `fk_jogador_time1` FOREIGN KEY (`time_id`) REFERENCES `time` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jogador`
--

LOCK TABLES `jogador` WRITE;
/*!40000 ALTER TABLE `jogador` DISABLE KEYS */;
INSERT INTO `jogador` VALUES (1,'Evamberto','25/03/1997','atacante','D',1),(2,'Ismael','22/04/1998','atacante','E',1),(3,'Miqueias','22/04/1995','atacante','D',1),(10,'João','12/12/1999','atacante','D',1),(12,'Rivaldo','12/11/1992','Ponta-esquerda','E',1);
/*!40000 ALTER TABLE `jogador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partida`
--

DROP TABLE IF EXISTS `partida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `partida` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `timeCasa` varchar(45) DEFAULT NULL,
  `timeFora` varchar(45) DEFAULT NULL,
  `resultado` varchar(45) DEFAULT NULL,
  `tipoDeJogo` varchar(45) DEFAULT NULL,
  `horario` varchar(45) DEFAULT NULL,
  `localPartida` varchar(45) DEFAULT NULL,
  `data` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partida`
--

LOCK TABLES `partida` WRITE;
/*!40000 ALTER TABLE `partida` DISABLE KEYS */;
INSERT INTO `partida` VALUES (1,'Corinthians','Palmeiras','4X0','Copa Libertadores','22:00','Itaquera','22/11/2018'),(2,'Corinthians','Chelsia','2X0','Amistoso','22:00','Itaquera','22/11/2019'),(3,'Russas','Jaguaruana','10X0','Amistoso','22:00','Russas','04/12/2018');
/*!40000 ALTER TABLE `partida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `time`
--

DROP TABLE IF EXISTS `time`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `time` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `time`
--

LOCK TABLES `time` WRITE;
/*!40000 ALTER TABLE `time` DISABLE KEYS */;
INSERT INTO `time` VALUES (1,'Corinthians');
/*!40000 ALTER TABLE `time` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-20 22:40:56
