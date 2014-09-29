-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.35-0ubuntu0.12.04.1


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema Financas == Cadastro
--

CREATE DATABASE IF NOT EXISTS Cadastro;
USE Cadastro;
--
-- Definition of table `Cadastro`.`Cidade`
--

-- Definition of table `Cadastro`.`Empresa`
--

--
-- Dumping data for table `Cadastro`.`Pessoa`
--
DROP TABLE IF EXISTS `Cadastro`.`Pessoa`;
CREATE TABLE  `Cadastro`.`Pessoa` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ativo` varchar(255) DEFAULT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  `celular` varchar(255) DEFAULT NULL,
  `cep` varchar(255) DEFAULT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `cpfCnpj` varchar(255) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `nomeCompleto` varchar(255) DEFAULT NULL,
  `nomeFantasia` varchar(255) DEFAULT NULL,
  `rg` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `tipoPessoa` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;


/*!40000 ALTER TABLE `Pessoa` DISABLE KEYS */;
LOCK TABLES `Pessoa` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `Pessoa` ENABLE KEYS */;

--
-- Definition of table `Cadastro`.`perfil` == cliente
--
--

--
-- Definition of table `Cadastro`.`Usuario`
--

DROP TABLE IF EXISTS `Cadastro`.`Usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE  `Cadastro`.`Usuario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ativo` bit(1) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `nomeCompleto` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cadastro`.`Usuario`
--
