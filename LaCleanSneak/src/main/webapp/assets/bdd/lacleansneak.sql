-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : ven. 21 avr. 2023 à 10:50
-- Version du serveur : 10.4.27-MariaDB
-- Version de PHP : 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `lacleansneak`
--

-- --------------------------------------------------------

--
-- Structure de la table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `title` varchar(30) NOT NULL,
  `description` text NOT NULL,
  `price` float NOT NULL,
  `productPicPath` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `product`
--

INSERT INTO `product` (`id`, `title`, `description`, `price`, `productPicPath`) VALUES
(22, 'Air Force 1', 'Lorem ipsum', 140, '1.jpg'),
(23, 'Nike Dunk Low', 'Lorem ipsum', 140, '2.jpg'),
(24, 'Nike Dunk Low', 'Lorem ipsum', 140, '3.jpg'),
(25, 'Nike Dunk Low', 'Lorem ipsum', 140, '4.jpg'),
(26, 'Nike Dunk Low', 'Lorem ipsum', 140, '5.jpg'),
(27, 'Nike Dunk Low', 'Lorem ipsum', 140, '6.jpg'),
(28, 'Nike Dunk Low', 'Lorem ipsum', 140, '7.jpg'),
(29, 'Nike Dunk Low', 'Lorem ipsum', 140, '8.jpg'),
(34, 'azerty', 'azerty', 1, 'logoHome.png'),
(35, 'azerty', 'azerty', 5, 'logo1.png');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `userPicPath` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `firstName`, `lastName`, `address`, `phone`, `mail`, `password`, `userPicPath`) VALUES
(27, 'bourgin', 'fabien', '19 AllÃ©e de la charmille', '0615265015', 'bourgin.fabien@gmail.com', '$2a$10$Yq1l7uhcYVvuxyP7npXEqeY8tdVBtLbOZbXUQiZiREhY.It9NO1BG', ''),
(28, 'test', 'test', 'test', 'test', 'test@test.fr', '$2a$10$NsSkn2Zcwe3Y6HpoDVTF9OHaHKR/CqRQ0SZL7Vu39LChXE0PXljui', 'test'),
(29, 'test', 'test', 'test', 'test', 'test@test.fr', '$2a$10$WdQrCZLUH7l6NkuVHJ6fFu7d8WXSe0sXmTvZYws2zI0E/hrvEYb3a', 'azerty');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
