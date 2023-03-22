-- phpMyAdmin SQL Dump
-- version 5.1.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Mar 22, 2023 at 09:07 AM
-- Server version: 5.7.24
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `spring_web_cleaning`
--

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(35);

-- --------------------------------------------------------

--
-- Table structure for table `post`
--

CREATE TABLE `post` (
  `id` bigint(20) NOT NULL,
  `anons` varchar(255) DEFAULT NULL,
  `full_text` varchar(1500) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `post`
--

INSERT INTO `post` (`id`, `anons`, `full_text`, `price`, `title`) VALUES
(21, 'Включает в себя очистку полов, пылесос, уборку пыли, мытье окон, очистку туалетов и кухни, а также уборку мебели и предметов интерьера.', 'Услуга \"Общая уборка помещений\" является одной из наиболее востребованных услуг, предоставляемых Клининговыми компаниями. Она включает в себя комплекс мероприятий по очистке помещений от пыли, грязи, мусора и других загрязнений.\r\n\r\nОбщая уборка помещений проводится как в квартирах, так и в коммерческих объектах, таких как офисы, магазины, рестораны и др. В процессе работы специалисты используют профессиональное оборудование и средства, специально предназначенные для очистки различных поверхностей и предметов, включая ковры, мебель, технику, окна и двери.\r\n\r\nКомпания обычно предлагает несколько вариантов общей уборки, в зависимости от пожеланий и потребностей клиента. Это может быть ежедневная, еженедельная или разовая уборка. Длительность работы также может варьироваться в зависимости от размеров помещения и уровня загрязнения.\r\n\r\nЦелью общей уборки является создание чистого и уютного пространства, что не только положительно влияет на самочувствие людей, но и является залогом долговременной сохранности имущества. Стоимость услуги \"Общая уборка помещений\" может варьироваться в зависимости от региона, объема работ и других факторов.', '800', 'Общая уборка помещений'),
(24, 'Включает в себя очистку после строительных работ, удаление строительного мусора, очистку поверхностей от краски и гипса, а также уборку пыли.', 'Уборка после ремонта – это услуга, которая позволяет удалить строительную пыль, остатки клея, краски, грубые загрязнения и другие остатки от ремонта в помещении. Эта услуга обычно требуется после окончания ремонтных работ, как в жилых помещениях, так и в коммерческих объектах, таких как офисы, магазины, рестораны и др.\r\n\r\nПроцесс уборки после ремонта включает в себя комплекс мероприятий, направленных на удаление всех видов загрязнений. Это может быть влажная и сухая уборка, уборка на высоте, удаление остатков краски и клея с окон и дверей, мойка и полировка полов и стен, а также другие работы по удалению более трудных загрязнений.\r\n\r\nУборка после ремонта может проводиться как в крупных помещениях, так и в небольших. Важно понимать, что данная услуга требует использования специализированных инструментов и средств, поэтому ее лучше доверить профессионалам, которые имеют необходимый опыт и оборудование для проведения такого рода работ.', '1500', 'Уборка после ремонта'),
(25, 'Услуга, которая позволяет провести комплексную чистку внутреннего и внешнего пространства автомобиля, убрать все виды загрязнений и сделать его внешний вид и обстановку внутри чистыми и уютными.', 'Уборка автомобиля - это услуга, которая позволяет провести комплексную чистку внутреннего и внешнего пространства автомобиля, убрать все виды загрязнений и сделать его внешний вид и обстановку внутри чистыми и уютными.\r\n\r\nПроцесс уборки автомобиля может включать в себя удаление пыли, грязи и остатков пищи из салона, протирку всех поверхностей и стекол, мойку и полировку кузова, а также дополнительные услуги, такие как чистка салона с помощью пара, уборка ковриков и т.д.\r\n\r\nСуществует несколько способов проведения уборки автомобиля: самостоятельная уборка с использованием специальных инструментов и средств, услуги мобильных автомобильных бригад, которые приезжают на место, а также услуги стационарных автомойек. Каждый из способов имеет свои преимущества и недостатки, поэтому выбор зависит от предпочтений и возможностей клиента.', '3500', 'Уборка автомобиля'),
(26, 'Включает в себя очистку рабочих мест, кабинетов, конференц-залов, приемных и других офисных помещений.', 'Уборка офисных помещений - это услуга, которая позволяет поддерживать чистоту и порядок в офисе, создавая благоприятную рабочую атмосферу для сотрудников. Уборка офисных помещений включает в себя комплексную уборку всего офиса, начиная от приемной и залов ожидания, до кабинетов руководителей и рабочих помещений.\r\n\r\nПроцесс уборки офисных помещений может включать в себя удаление пыли, протирку поверхностей, влажную уборку полов, мытье окон и дверей, уборку санузлов и кухонных помещений, а также другие виды работ, направленных на поддержание чистоты и порядка.\r\n\r\nУборка офисных помещений может быть выполнена как регулярно, по графику, так и по запросу заказчика. Частота уборки зависит от размера и количества помещений, а также от количества сотрудников и посетителей офиса.', '1200', 'Уборка офисных помещений'),
(27, 'Включает в себя очистку от снега и льда, уборку мусора, уборку листьев и веток, а также обслуживание зеленых насаждений.', 'Уборка наружных территорий - это услуга, которая направлена на очистку различных наружных территорий от мусора, листьев и других видов загрязнений. Такие территории могут быть как маленькими, например, перед входом в здание, так и большими, например, парки, скверы и другие общественные места.\r\n\r\nПроцесс уборки наружных территорий может включать в себя вывоз мусора, очистку от листьев и других растительных отходов, очистку от снега и льда зимой, а также другие работы, связанные с поддержанием чистоты и порядка на территории.\r\n\r\nУборка наружных территорий проводится как регулярно, по графику, так и по запросу заказчика. Частота уборки может зависеть от размера территории, количество посетителей и времени года.', '1500', 'Уборка наружных территорий');

-- --------------------------------------------------------

--
-- Table structure for table `responses`
--

CREATE TABLE `responses` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `get_price` varchar(255) DEFAULT NULL,
  `get_title` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `surname` varchar(255) DEFAULT NULL,
  `zaptel` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `responses`
--

INSERT INTO `responses` (`id`, `address`, `get_price`, `get_title`, `name`, `surname`, `zaptel`) VALUES
(22, 'Кулакова 2/1', '800', 'Общая уборка помещений', 'Руслан', 'Каракотов', '+7 (999) 999-9999'),
(28, 'Кулакова 3/5', '800', 'Общая уборка помещений', 'Осман', 'Мисходжев', '+7 (888) 888-8888'),
(32, 'Пятигорск', '3500', 'Уборка автомобиля', 'Женя', 'Пилипенко', '+7 (111) 111-1111'),
(33, 'Буденовск', '400', 'Химчистка ковров', 'Олеся', 'Пупкина', '+7 (777) 777-7777'),
(34, 'Буденовск', '1500', 'Уборка после ремонта', 'Руслан', 'Каракотов', '+7 (999) 999-9999');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `post`
--
ALTER TABLE `post`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `responses`
--
ALTER TABLE `responses`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
