-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : jeu. 10 sep. 2020 à 11:12
-- Version du serveur :  8.0.21
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `tasks_management`
--

-- --------------------------------------------------------

--
-- Structure de la table `commentaire`
--

DROP TABLE IF EXISTS `commentaire`;
CREATE TABLE IF NOT EXISTS `commentaire` (
  `id_C` int NOT NULL AUTO_INCREMENT,
  `libelle` varchar(255) NOT NULL,
  `id_tache` int NOT NULL,
  `id_ressource` int NOT NULL,
  PRIMARY KEY (`id_C`),
  KEY `id_ressource` (`id_ressource`),
  KEY `id_tache` (`id_tache`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `module`
--

DROP TABLE IF EXISTS `module`;
CREATE TABLE IF NOT EXISTS `module` (
  `id_M` int NOT NULL AUTO_INCREMENT,
  `libelle` varchar(250) NOT NULL,
  `id_statut` int NOT NULL,
  PRIMARY KEY (`id_M`),
  KEY `id_statut` (`id_statut`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `ressource`
--

DROP TABLE IF EXISTS `ressource`;
CREATE TABLE IF NOT EXISTS `ressource` (
  `id_Res` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(250) NOT NULL,
  `prenom` varchar(250) NOT NULL,
  `username` varchar(250) NOT NULL,
  `password` varchar(250) NOT NULL,
  `role_id` int NOT NULL,
  PRIMARY KEY (`id_Res`),
  KEY `ressource_ibfk_1` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `ressource`
--

INSERT INTO `ressource` (`id_Res`, `nom`, `prenom`, `username`, `password`, `role_id`) VALUES
(1, 'skiti', 'salma', 'salmaskiti', 'salma', 2);

-- --------------------------------------------------------

--
-- Structure de la table `ressource_module`
--

DROP TABLE IF EXISTS `ressource_module`;
CREATE TABLE IF NOT EXISTS `ressource_module` (
  `id_ressource` int NOT NULL,
  `id_module` int NOT NULL,
  `date_affectation` date NOT NULL,
  KEY `id_module` (`id_module`),
  KEY `id_ressource` (`id_ressource`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE IF NOT EXISTS `role` (
  `id_R` int NOT NULL AUTO_INCREMENT,
  `libelle` varchar(250) NOT NULL,
  PRIMARY KEY (`id_R`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `role`
--

INSERT INTO `role` (`id_R`, `libelle`) VALUES
(1, 'Devloppeur'),
(2, 'testeur'),
(3, 'Devloppeur'),
(4, 'testeur');

-- --------------------------------------------------------

--
-- Structure de la table `statut`
--

DROP TABLE IF EXISTS `statut`;
CREATE TABLE IF NOT EXISTS `statut` (
  `id_S` int NOT NULL AUTO_INCREMENT,
  `libelle` varchar(255) NOT NULL,
  PRIMARY KEY (`id_S`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `tache`
--

DROP TABLE IF EXISTS `tache`;
CREATE TABLE IF NOT EXISTS `tache` (
  `id_T` int NOT NULL AUTO_INCREMENT,
  `resume` varchar(255) NOT NULL,
  `statut_id` int NOT NULL,
  `id_module` int NOT NULL,
  `id_ressource` int NOT NULL,
  PRIMARY KEY (`id_T`),
  KEY `id_ressource` (`id_ressource`),
  KEY `id_module` (`id_module`),
  KEY `statut_id` (`statut_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `commentaire`
--
ALTER TABLE `commentaire`
  ADD CONSTRAINT `commentaire_ibfk_1` FOREIGN KEY (`id_ressource`) REFERENCES `ressource` (`id_Res`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `commentaire_ibfk_2` FOREIGN KEY (`id_tache`) REFERENCES `tache` (`id_T`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `module`
--
ALTER TABLE `module`
  ADD CONSTRAINT `id_statut` FOREIGN KEY (`id_statut`) REFERENCES `statut` (`id_S`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `ressource`
--
ALTER TABLE `ressource`
  ADD CONSTRAINT `ressource_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id_R`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `ressource_module`
--
ALTER TABLE `ressource_module`
  ADD CONSTRAINT `ressource_module_ibfk_1` FOREIGN KEY (`id_module`) REFERENCES `module` (`id_M`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `ressource_module_ibfk_2` FOREIGN KEY (`id_ressource`) REFERENCES `ressource` (`id_Res`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `tache`
--
ALTER TABLE `tache`
  ADD CONSTRAINT `tache_ibfk_1` FOREIGN KEY (`id_ressource`) REFERENCES `ressource` (`id_Res`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `tache_ibfk_2` FOREIGN KEY (`id_module`) REFERENCES `module` (`id_M`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `tache_ibfk_3` FOREIGN KEY (`statut_id`) REFERENCES `statut` (`id_S`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
