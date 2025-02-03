-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 03, 2025 at 08:55 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tecmis`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `adm_id` char(6) NOT NULL,
  `adm_name` varchar(100) DEFAULT NULL,
  `adm_mail` varchar(100) NOT NULL,
  `adm_pass` varchar(100) NOT NULL,
  `adm_contact` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`adm_id`, `adm_name`, `adm_mail`, `adm_pass`, `adm_contact`) VALUES
('AD001', 'samiya', 'samiya@gmail.com', 'samiya123', 778079455),
('AD002', 'samindika', 'samindika@gmail.com', 'samindika123', 778045789),
('AD003', 'asdasdfads', 'qwewerwer', 'asdfsd', 1234123412);

-- --------------------------------------------------------

--
-- Table structure for table `assignment`
--

CREATE TABLE `assignment` (
  `Asm_id` char(5) NOT NULL,
  `Asm_no` int(11) NOT NULL,
  `Asm_mark` int(11) DEFAULT NULL,
  `Std_id` varchar(6) NOT NULL,
  `Crs_id` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `assignment`
--

INSERT INTO `assignment` (`Asm_id`, `Asm_no`, `Asm_mark`, `Std_id`, `Crs_id`) VALUES
('AS007', 1, 3, 'TG0002', 'ICT02'),
('AS008', 2, 3, 'TG0002', 'ICT02'),
('AS009', 1, 8, 'TG0002', 'ICT03'),
('AS010', 2, 9, 'TG0002', 'ICT03'),
('AS011', 1, 3, 'TG0002', 'ICT04'),
('AS012', 2, 4, 'TG0002', 'ICT04'),
('AS013', 1, 3, 'TG0003', 'ICT02'),
('AS014', 2, 2, 'TG0003', 'ICT02'),
('AS015', 1, 6, 'TG0003', 'ICT03'),
('AS016', 2, 7, 'TG0003', 'ICT03'),
('AS017', 1, 9, 'TG0003', 'ICT04'),
('AS018', 2, 7, 'TG0003', 'ICT04'),
('AS019', 1, 5, 'TG0004', 'ICT02'),
('AS020', 2, 4, 'TG0004', 'ICT02'),
('AS021', 1, 8, 'TG0004', 'ICT03'),
('AS022', 2, 5, 'TG0004', 'ICT03'),
('AS023', 1, 7, 'TG0004', 'ICT04'),
('AS024', 2, 3, 'TG0004', 'ICT04'),
('AS025', 1, 4, 'TG0005', 'ICT02'),
('AS026', 2, 5, 'TG0005', 'ICT02'),
('AS027', 1, 10, 'TG0005', 'ICT03'),
('AS028', 2, 8, 'TG0005', 'ICT03'),
('AS029', 1, 3, 'TG0005', 'ICT04'),
('AS030', 2, 7, 'TG0005', 'ICT04'),
('AS031', 1, 5, 'TG0006', 'ICT02'),
('AS032', 2, 4, 'TG0006', 'ICT02'),
('AS033', 1, 7, 'TG0006', 'ICT03'),
('AS034', 2, 6, 'TG0006', 'ICT03'),
('AS035', 1, 8, 'TG0006', 'ICT04'),
('AS036', 2, 5, 'TG0006', 'ICT04'),
('AS037', 1, 4, 'TG0007', 'ICT02'),
('AS038', 2, 3, 'TG0007', 'ICT02'),
('AS039', 1, 9, 'TG0007', 'ICT03'),
('AS040', 2, 8, 'TG0007', 'ICT03'),
('AS041', 1, 7, 'TG0007', 'ICT04'),
('AS042', 2, 6, 'TG0007', 'ICT04'),
('AS043', 1, 2, 'TG0008', 'ICT02'),
('AS044', 2, 1, 'TG0008', 'ICT02'),
('AS045', 1, 5, 'TG0008', 'ICT03'),
('AS046', 2, 3, 'TG0008', 'ICT03'),
('AS047', 1, 8, 'TG0008', 'ICT04'),
('AS048', 2, 9, 'TG0008', 'ICT04'),
('AS049', 1, 3, 'TG0009', 'ICT02'),
('AS050', 2, 5, 'TG0009', 'ICT02'),
('AS051', 1, 10, 'TG0009', 'ICT03'),
('AS052', 2, 8, 'TG0009', 'ICT03'),
('AS053', 1, 4, 'TG0009', 'ICT04'),
('AS054', 2, 7, 'TG0009', 'ICT04'),
('AS055', 1, 5, 'TG0010', 'ICT02'),
('AS056', 2, 4, 'TG0010', 'ICT02'),
('AS057', 1, 9, 'TG0010', 'ICT03'),
('AS058', 2, 10, 'TG0010', 'ICT03'),
('AS059', 1, 8, 'TG0010', 'ICT04'),
('AS060', 2, 6, 'TG0010', 'ICT04');

-- --------------------------------------------------------

--
-- Stand-in structure for view `assignment_marks_subject`
-- (See below for the actual view)
--
CREATE TABLE `assignment_marks_subject` (
`Std_id` varchar(6)
,`Crs_id` varchar(7)
,`total_assignment_marks` decimal(32,0)
);

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `A_id` char(4) NOT NULL,
  `Count` char(2) NOT NULL,
  `Std_id` char(6) NOT NULL,
  `Crs_id` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`A_id`, `Count`, `Std_id`, `Crs_id`) VALUES
('A001', '09', 'TG0001', 'ICT01'),
('A002', '08', 'TG0001', 'ICT02'),
('A003', '08', 'TG0001', 'ICT03'),
('A004', '08', 'TG0001', 'ICT04'),
('A005', '09', 'TG0002', 'ICT01'),
('A006', '08', 'TG0002', 'ICT02'),
('A007', '08', 'TG0002', 'ICT03'),
('A008', '08', 'TG0002', 'ICT04'),
('A009', '09', 'TG0003', 'ICT01'),
('A010', '08', 'TG0003', 'ICT02'),
('A011', '08', 'TG0003', 'ICT03'),
('A012', '08', 'TG0003', 'ICT04'),
('A013', '09', 'TG0004', 'ICT01'),
('A014', '08', 'TG0004', 'ICT02'),
('A015', '08', 'TG0004', 'ICT03'),
('A016', '08', 'TG0004', 'ICT04'),
('A017', '09', 'TG0005', 'ICT01'),
('A018', '08', 'TG0005', 'ICT02'),
('A019', '08', 'TG0005', 'ICT03'),
('A020', '08', 'TG0005', 'ICT04'),
('A021', '09', 'TG0006', 'ICT01'),
('A022', '08', 'TG0006', 'ICT02'),
('A023', '08', 'TG0006', 'ICT03'),
('A024', '08', 'TG0006', 'ICT04'),
('A025', '09', 'TG0007', 'ICT01'),
('A026', '08', 'TG0007', 'ICT02'),
('A027', '08', 'TG0007', 'ICT03'),
('A028', '08', 'TG0007', 'ICT04'),
('A029', '09', 'TG0008', 'ICT01'),
('A030', '08', 'TG0008', 'ICT02'),
('A031', '08', 'TG0008', 'ICT03'),
('A032', '08', 'TG0008', 'ICT04'),
('A033', '09', 'TG0009', 'ICT01'),
('A034', '08', 'TG0009', 'ICT02'),
('A035', '08', 'TG0009', 'ICT03'),
('A036', '08', 'TG0009', 'ICT04'),
('A037', '09', 'TG0010', 'ICT01'),
('A038', '08', 'TG0010', 'ICT02'),
('A039', '08', 'TG0010', 'ICT03'),
('A040', '08', 'TG0010', 'ICT04');

-- --------------------------------------------------------

--
-- Stand-in structure for view `ca_marks`
-- (See below for the actual view)
--
CREATE TABLE `ca_marks` (
`Std_id` varchar(6)
,`Crs_id` varchar(7)
,`CA_marks` decimal(60,4)
);

-- --------------------------------------------------------

--
-- Table structure for table `course_unit`
--

CREATE TABLE `course_unit` (
  `course_code` varchar(7) NOT NULL,
  `course_name` varchar(60) DEFAULT NULL,
  `credits` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `course_unit`
--

INSERT INTO `course_unit` (`course_code`, `course_name`, `credits`) VALUES
('ICT01', 'English III', 2),
('ICT02', 'Data Structures and Algorithms', 2),
('ICT03', 'Object Oriented Programming', 2),
('ICT04', 'Object Oriented Programming Practicum', 3);

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `Dep_id` char(3) NOT NULL,
  `Name` varchar(150) NOT NULL,
  `Lec_id` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`Dep_id`, `Name`, `Lec_id`) VALUES
('D01', 'Information Ccommunication Technology', 'LE001'),
('D02', 'Bio System Technology', 'LE005'),
('D03', 'Engeneering Technology', 'LE003'),
('D04', 'Multy Dicyplinary', 'LE004');

-- --------------------------------------------------------

--
-- Table structure for table `end_practical`
--

CREATE TABLE `end_practical` (
  `End_id` char(5) NOT NULL,
  `Crs_id` varchar(7) NOT NULL,
  `End_marks` int(11) DEFAULT NULL,
  `Std_id` char(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `end_practical`
--

INSERT INTO `end_practical` (`End_id`, `Crs_id`, `End_marks`, `Std_id`) VALUES
('EP001', 'ICT01', 24, 'TG0001'),
('EP003', 'ICT03', 25, 'TG0001'),
('EP004', 'ICT04', 31, 'TG0001'),
('EP005', 'ICT01', 30, 'TG0002'),
('EP006', 'ICT03', 30, 'TG0002'),
('EP007', 'ICT04', 40, 'TG0002'),
('EP008', 'ICT01', 28, 'TG0003'),
('EP009', 'ICT03', 29, 'TG0003'),
('EP010', 'ICT04', 35, 'TG0003'),
('EP011', 'ICT01', 29, 'TG0004'),
('EP012', 'ICT03', 28, 'TG0004'),
('EP013', 'ICT04', 36, 'TG0004'),
('EP014', 'ICT01', 27, 'TG0005'),
('EP015', 'ICT03', 30, 'TG0005'),
('EP016', 'ICT04', 37, 'TG0005'),
('EP017', 'ICT01', 26, 'TG0006'),
('EP018', 'ICT03', 27, 'TG0006'),
('EP019', 'ICT04', 38, 'TG0006'),
('EP020', 'ICT01', 30, 'TG0007'),
('EP021', 'ICT03', 26, 'TG0007'),
('EP022', 'ICT04', 39, 'TG0007'),
('EP023', 'ICT01', 29, 'TG0008'),
('EP024', 'ICT03', 25, 'TG0008'),
('EP025', 'ICT04', 40, 'TG0008'),
('EP026', 'ICT01', 27, 'TG0009'),
('EP027', 'ICT03', 28, 'TG0009'),
('EP028', 'ICT04', 34, 'TG0009'),
('EP029', 'ICT01', 30, 'TG0010'),
('EP030', 'ICT03', 30, 'TG0010'),
('EP031', 'ICT04', 38, 'TG0010');

-- --------------------------------------------------------

--
-- Table structure for table `end_theory`
--

CREATE TABLE `end_theory` (
  `End_id` char(5) NOT NULL,
  `Crs_id` varchar(7) NOT NULL,
  `End_marks` int(11) DEFAULT NULL,
  `Std_id` char(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `end_theory`
--

INSERT INTO `end_theory` (`End_id`, `Crs_id`, `End_marks`, `Std_id`) VALUES
('ET001', 'ICT01', 35, 'TG0001'),
('ET002', 'ICT02', 50, 'TG0001'),
('ET003', 'ICT03', 33, 'TG0001'),
('ET004', 'ICT04', 25, 'TG0001'),
('ET005', 'ICT01', 40, 'TG0002'),
('ET006', 'ICT02', 60, 'TG0002'),
('ET007', 'ICT03', 39, 'TG0002'),
('ET008', 'ICT04', 30, 'TG0002'),
('ET009', 'ICT01', 37, 'TG0003'),
('ET010', 'ICT02', 55, 'TG0003'),
('ET011', 'ICT03', 38, 'TG0003'),
('ET012', 'ICT04', 28, 'TG0003'),
('ET013', 'ICT01', 38, 'TG0004'),
('ET014', 'ICT02', 58, 'TG0004'),
('ET015', 'ICT03', 35, 'TG0004'),
('ET016', 'ICT04', 29, 'TG0004'),
('ET017', 'ICT01', 39, 'TG0005'),
('ET018', 'ICT02', 59, 'TG0005'),
('ET019', 'ICT03', 40, 'TG0005'),
('ET020', 'ICT04', 31, 'TG0005'),
('ET021', 'ICT01', 40, 'TG0006'),
('ET022', 'ICT02', 60, 'TG0006'),
('ET023', 'ICT03', 37, 'TG0006'),
('ET024', 'ICT04', 26, 'TG0006'),
('ET025', 'ICT01', 36, 'TG0007'),
('ET026', 'ICT02', 52, 'TG0007'),
('ET027', 'ICT03', 34, 'TG0007'),
('ET028', 'ICT04', 27, 'TG0007'),
('ET029', 'ICT01', 39, 'TG0008'),
('ET030', 'ICT02', 57, 'TG0008'),
('ET031', 'ICT03', 36, 'TG0008'),
('ET032', 'ICT04', 30, 'TG0008'),
('ET033', 'ICT01', 37, 'TG0009'),
('ET034', 'ICT02', 56, 'TG0009'),
('ET035', 'ICT03', 39, 'TG0009'),
('ET036', 'ICT04', 28, 'TG0009'),
('ET037', 'ICT01', 40, 'TG0010'),
('ET038', 'ICT02', 60, 'TG0010'),
('ET039', 'ICT03', 40, 'TG0010'),
('ET040', 'ICT04', 30, 'TG0010');

-- --------------------------------------------------------

--
-- Stand-in structure for view `final_marks`
-- (See below for the actual view)
--
CREATE TABLE `final_marks` (
`Std_id` varchar(6)
,`Crs_id` varchar(7)
,`total_marks` decimal(61,4)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `grads`
-- (See below for the actual view)
--
CREATE TABLE `grads` (
`Std_id` varchar(6)
,`Crs_id` varchar(7)
,`total_marks` decimal(61,4)
,`grade` varchar(2)
,`points` decimal(2,1)
);

-- --------------------------------------------------------

--
-- Table structure for table `lecture`
--

CREATE TABLE `lecture` (
  `Lec_id` char(6) NOT NULL,
  `Name` varchar(250) DEFAULT NULL,
  `Email` varchar(150) DEFAULT NULL,
  `password` varchar(100) NOT NULL,
  `Contact` int(11) DEFAULT NULL,
  `address` varchar(70) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `lecture`
--

INSERT INTO `lecture` (`Lec_id`, `Name`, `Email`, `password`, `Contact`, `address`) VALUES
('LE001', 'Ms.Hiranya', 'hiranya@gmail.com', 'hiranya', 123456789, 'Karandeniya, Ambalangoda.'),
('LE002', 'Mr.Nuwan', 'nuwan@gmail.com', 'nuwan', 2147483647, 'Kamburupitiya,Matara.'),
('LE003', 'Ms.Rumeshika', 'rumeshika@gmail.com', 'rumeshika', 2147483647, 'Colombo 03, Colombo.'),
('LE004', 'Ms.Nimesha', 'nimesha@gmail.com', 'nimesha', 2147483647, 'Dambulla, Sri Lanka');

-- --------------------------------------------------------

--
-- Table structure for table `medical`
--

CREATE TABLE `medical` (
  `M_id` char(4) NOT NULL,
  `Count` char(2) NOT NULL,
  `Std_id` char(6) NOT NULL,
  `Crs_id` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `medical`
--

INSERT INTO `medical` (`M_id`, `Count`, `Std_id`, `Crs_id`) VALUES
('M001', '1', 'TG0001', 'ICT01'),
('M002', '0', 'TG0001', 'ICT02'),
('M003', '0', 'TG0001', 'ICT03'),
('M004', '2', 'TG0001', 'ICT04'),
('M005', '3', 'TG0002', 'ICT01'),
('M006', '1', 'TG0002', 'ICT02'),
('M007', '2', 'TG0002', 'ICT03'),
('M008', '3', 'TG0002', 'ICT04'),
('M009', '2', 'TG0003', 'ICT01'),
('M010', '3', 'TG0003', 'ICT02'),
('M011', '0', 'TG0003', 'ICT03'),
('M012', '1', 'TG0003', 'ICT04'),
('M013', '1', 'TG0004', 'ICT01'),
('M014', '2', 'TG0004', 'ICT02'),
('M015', '3', 'TG0004', 'ICT03'),
('M016', '2', 'TG0004', 'ICT04'),
('M017', '0', 'TG0005', 'ICT01'),
('M018', '1', 'TG0005', 'ICT02'),
('M019', '2', 'TG0005', 'ICT03'),
('M020', '3', 'TG0005', 'ICT04'),
('M021', '3', 'TG0006', 'ICT01'),
('M022', '2', 'TG0006', 'ICT02'),
('M023', '1', 'TG0006', 'ICT03'),
('M024', '0', 'TG0006', 'ICT04'),
('M025', '2', 'TG0007', 'ICT01'),
('M026', '3', 'TG0007', 'ICT02'),
('M027', '0', 'TG0007', 'ICT03'),
('M028', '1', 'TG0007', 'ICT04'),
('M029', '1', 'TG0008', 'ICT01'),
('M030', '2', 'TG0008', 'ICT02'),
('M031', '3', 'TG0008', 'ICT03'),
('M032', '0', 'TG0008', 'ICT04'),
('M033', '0', 'TG0009', 'ICT01'),
('M034', '1', 'TG0009', 'ICT02'),
('M035', '2', 'TG0009', 'ICT03'),
('M036', '3', 'TG0009', 'ICT04'),
('M037', '3', 'TG0010', 'ICT01'),
('M038', '2', 'TG0010', 'ICT02'),
('M039', '1', 'TG0010', 'ICT03'),
('M040', '0', 'TG0010', 'ICT04');

-- --------------------------------------------------------

--
-- Table structure for table `mid`
--

CREATE TABLE `mid` (
  `Mid_id` char(5) NOT NULL,
  `Crs_id` varchar(7) NOT NULL,
  `Mid_mark` int(11) DEFAULT NULL,
  `Std_id` char(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mid`
--

INSERT INTO `mid` (`Mid_id`, `Crs_id`, `Mid_mark`, `Std_id`) VALUES
('MD001', 'ICT01', 15, 'TG0001'),
('MD002', 'ICT02', 16, 'TG0001'),
('MD003', 'ICT01', 12, 'TG0002'),
('MD004', 'ICT02', 18, 'TG0002'),
('MD005', 'ICT01', 14, 'TG0003'),
('MD006', 'ICT02', 10, 'TG0003'),
('MD007', 'ICT01', 17, 'TG0004'),
('MD008', 'ICT02', 11, 'TG0004'),
('MD009', 'ICT01', 13, 'TG0005'),
('MD010', 'ICT02', 19, 'TG0005'),
('MD011', 'ICT01', 20, 'TG0006'),
('MD012', 'ICT02', 8, 'TG0006'),
('MD013', 'ICT01', 9, 'TG0007'),
('MD014', 'ICT02', 14, 'TG0007'),
('MD015', 'ICT01', 16, 'TG0008'),
('MD016', 'ICT02', 7, 'TG0008'),
('MD017', 'ICT01', 11, 'TG0009'),
('MD018', 'ICT02', 18, 'TG0009'),
('MD019', 'ICT01', 20, 'TG0010'),
('MD020', 'ICT02', 15, 'TG0010');

-- --------------------------------------------------------

--
-- Table structure for table `notice`
--

CREATE TABLE `notice` (
  `nId` int(11) NOT NULL,
  `topic` varchar(1000) DEFAULT NULL,
  `notice` varchar(5000) DEFAULT NULL,
  `date` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `notice`
--

INSERT INTO `notice` (`nId`, `topic`, `notice`, `date`) VALUES
(5, 'Hi', 'im samiya', '2024/05/01\n17:45:48'),
(7, 'hello', 'im in the lab 2', '2024/05/02\n08:14:14');

-- --------------------------------------------------------

--
-- Table structure for table `quiz`
--

CREATE TABLE `quiz` (
  `Quiz_id` char(4) NOT NULL,
  `Qiz_no` int(11) NOT NULL,
  `Qiz_mark` int(11) DEFAULT NULL,
  `Std_id` varchar(6) NOT NULL,
  `Crs_id` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `quiz`
--

INSERT INTO `quiz` (`Quiz_id`, `Qiz_no`, `Qiz_mark`, `Std_id`, `Crs_id`) VALUES
('Q001', 1, 10, 'TG0001', 'ICT01'),
('Q002', 2, 7, 'TG0001', 'ICT01'),
('Q003', 3, 8, 'TG0001', 'ICT01'),
('Q004', 1, 9, 'TG0001', 'ICT02'),
('Q005', 2, 7, 'TG0001', 'ICT02'),
('Q006', 3, 10, 'TG0001', 'ICT02'),
('Q007', 4, 9, 'TG0001', 'ICT02'),
('Q008', 1, 5, 'TG0001', 'ICT03'),
('Q009', 2, 8, 'TG0001', 'ICT03'),
('Q010', 3, 6, 'TG0001', 'ICT03'),
('Q011', 1, 7, 'TG0001', 'ICT04'),
('Q012', 2, 7, 'TG0001', 'ICT04'),
('Q013', 3, 7, 'TG0001', 'ICT04'),
('Q014', 1, 8, 'TG0002', 'ICT01'),
('Q015', 2, 9, 'TG0002', 'ICT01'),
('Q016', 3, 10, 'TG0002', 'ICT01'),
('Q017', 4, 6, 'TG0002', 'ICT01'),
('Q018', 1, 7, 'TG0002', 'ICT02'),
('Q019', 2, 8, 'TG0002', 'ICT02'),
('Q020', 3, 10, 'TG0002', 'ICT02'),
('Q021', 4, 9, 'TG0002', 'ICT02'),
('Q022', 1, 10, 'TG0002', 'ICT03'),
('Q023', 2, 7, 'TG0002', 'ICT03'),
('Q024', 3, 9, 'TG0002', 'ICT03'),
('Q025', 1, 6, 'TG0002', 'ICT04'),
('Q026', 2, 8, 'TG0002', 'ICT04'),
('Q027', 3, 7, 'TG0002', 'ICT04'),
('Q028', 1, 9, 'TG0003', 'ICT01'),
('Q029', 2, 7, 'TG0003', 'ICT01'),
('Q030', 3, 8, 'TG0003', 'ICT01'),
('Q031', 4, 10, 'TG0003', 'ICT01'),
('Q032', 1, 10, 'TG0003', 'ICT02'),
('Q033', 2, 8, 'TG0003', 'ICT02'),
('Q034', 3, 6, 'TG0003', 'ICT02'),
('Q035', 4, 9, 'TG0003', 'ICT02'),
('Q036', 1, 5, 'TG0003', 'ICT03'),
('Q037', 2, 7, 'TG0003', 'ICT03'),
('Q038', 3, 8, 'TG0003', 'ICT03'),
('Q039', 1, 7, 'TG0003', 'ICT04'),
('Q040', 2, 8, 'TG0003', 'ICT04'),
('Q041', 3, 9, 'TG0003', 'ICT04'),
('Q042', 1, 6, 'TG0004', 'ICT01'),
('Q043', 2, 7, 'TG0004', 'ICT01'),
('Q044', 3, 8, 'TG0004', 'ICT01'),
('Q045', 4, 9, 'TG0004', 'ICT01'),
('Q046', 1, 10, 'TG0004', 'ICT02'),
('Q047', 2, 7, 'TG0004', 'ICT02'),
('Q048', 3, 8, 'TG0004', 'ICT02'),
('Q049', 4, 9, 'TG0004', 'ICT02'),
('Q050', 1, 7, 'TG0004', 'ICT03'),
('Q051', 2, 8, 'TG0004', 'ICT03'),
('Q052', 3, 9, 'TG0004', 'ICT03'),
('Q053', 1, 8, 'TG0004', 'ICT04'),
('Q054', 2, 7, 'TG0004', 'ICT04'),
('Q055', 3, 9, 'TG0004', 'ICT04'),
('Q056', 1, 8, 'TG0005', 'ICT01'),
('Q057', 2, 7, 'TG0005', 'ICT01'),
('Q058', 3, 9, 'TG0005', 'ICT01'),
('Q059', 4, 10, 'TG0005', 'ICT01'),
('Q060', 1, 9, 'TG0005', 'ICT02'),
('Q061', 2, 8, 'TG0005', 'ICT02'),
('Q062', 3, 6, 'TG0005', 'ICT02'),
('Q063', 4, 7, 'TG0005', 'ICT02'),
('Q064', 1, 8, 'TG0005', 'ICT03'),
('Q065', 2, 7, 'TG0005', 'ICT03'),
('Q066', 3, 9, 'TG0005', 'ICT03'),
('Q067', 1, 6, 'TG0005', 'ICT04'),
('Q068', 2, 8, 'TG0005', 'ICT04'),
('Q069', 3, 9, 'TG0005', 'ICT04'),
('Q070', 1, 10, 'TG0006', 'ICT01'),
('Q071', 2, 7, 'TG0006', 'ICT01'),
('Q072', 3, 8, 'TG0006', 'ICT01'),
('Q073', 4, 9, 'TG0006', 'ICT01'),
('Q074', 1, 10, 'TG0006', 'ICT02'),
('Q075', 2, 7, 'TG0006', 'ICT02'),
('Q076', 3, 8, 'TG0006', 'ICT02'),
('Q077', 4, 9, 'TG0006', 'ICT02'),
('Q078', 1, 7, 'TG0006', 'ICT03'),
('Q079', 2, 8, 'TG0006', 'ICT03'),
('Q080', 3, 9, 'TG0006', 'ICT03'),
('Q081', 1, 8, 'TG0006', 'ICT04'),
('Q082', 2, 7, 'TG0006', 'ICT04'),
('Q083', 3, 8, 'TG0006', 'ICT04'),
('Q084', 1, 9, 'TG0007', 'ICT01'),
('Q085', 2, 7, 'TG0007', 'ICT01'),
('Q086', 3, 8, 'TG0007', 'ICT01'),
('Q087', 4, 9, 'TG0007', 'ICT01'),
('Q088', 1, 10, 'TG0007', 'ICT02'),
('Q089', 2, 7, 'TG0007', 'ICT02'),
('Q090', 3, 8, 'TG0007', 'ICT02'),
('Q091', 4, 9, 'TG0007', 'ICT02'),
('Q092', 1, 7, 'TG0007', 'ICT03'),
('Q093', 2, 8, 'TG0007', 'ICT03'),
('Q094', 3, 9, 'TG0007', 'ICT03'),
('Q095', 1, 8, 'TG0007', 'ICT04'),
('Q096', 2, 7, 'TG0007', 'ICT04'),
('Q097', 3, 8, 'TG0007', 'ICT04'),
('Q098', 1, 9, 'TG0008', 'ICT01'),
('Q099', 2, 7, 'TG0008', 'ICT01'),
('Q100', 3, 8, 'TG0008', 'ICT01'),
('Q101', 4, 9, 'TG0008', 'ICT01'),
('Q102', 1, 10, 'TG0008', 'ICT02'),
('Q103', 2, 7, 'TG0008', 'ICT02'),
('Q104', 3, 8, 'TG0008', 'ICT02'),
('Q105', 4, 9, 'TG0008', 'ICT02'),
('Q106', 1, 7, 'TG0008', 'ICT03'),
('Q107', 2, 8, 'TG0008', 'ICT03'),
('Q108', 3, 9, 'TG0008', 'ICT03'),
('Q109', 1, 8, 'TG0008', 'ICT04'),
('Q110', 2, 7, 'TG0008', 'ICT04'),
('Q111', 3, 8, 'TG0008', 'ICT04'),
('Q112', 1, 9, 'TG0009', 'ICT01'),
('Q113', 2, 7, 'TG0009', 'ICT01'),
('Q114', 3, 8, 'TG0009', 'ICT01'),
('Q115', 4, 9, 'TG0009', 'ICT01'),
('Q116', 1, 10, 'TG0009', 'ICT02'),
('Q117', 2, 7, 'TG0009', 'ICT02'),
('Q118', 3, 8, 'TG0009', 'ICT02'),
('Q119', 4, 9, 'TG0009', 'ICT02'),
('Q120', 1, 7, 'TG0009', 'ICT03'),
('Q121', 2, 8, 'TG0009', 'ICT03'),
('Q122', 3, 9, 'TG0009', 'ICT03'),
('Q123', 1, 8, 'TG0009', 'ICT04'),
('Q124', 2, 7, 'TG0009', 'ICT04'),
('Q125', 3, 8, 'TG0009', 'ICT04'),
('Q126', 1, 9, 'TG0010', 'ICT01'),
('Q127', 2, 7, 'TG0010', 'ICT01'),
('Q128', 3, 8, 'TG0010', 'ICT01'),
('Q129', 4, 9, 'TG0010', 'ICT01'),
('Q130', 1, 10, 'TG0010', 'ICT02'),
('Q131', 2, 7, 'TG0010', 'ICT02'),
('Q132', 3, 8, 'TG0010', 'ICT02'),
('Q133', 4, 9, 'TG0010', 'ICT02'),
('Q134', 1, 7, 'TG0010', 'ICT03'),
('Q135', 2, 8, 'TG0010', 'ICT03'),
('Q136', 3, 9, 'TG0010', 'ICT03'),
('Q137', 1, 8, 'TG0010', 'ICT04'),
('Q138', 2, 7, 'TG0010', 'ICT04'),
('Q139', 3, 8, 'TG0010', 'ICT04');

-- --------------------------------------------------------

--
-- Stand-in structure for view `quiz_mark_percentage`
-- (See below for the actual view)
--
CREATE TABLE `quiz_mark_percentage` (
`Std_id` varchar(6)
,`Crs_id` varchar(7)
,`quiz_percentage` decimal(38,4)
);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `Std_id` char(6) NOT NULL,
  `Name` varchar(250) DEFAULT NULL,
  `Email` varchar(150) DEFAULT NULL,
  `Contact` int(15) DEFAULT NULL,
  `NIC` varchar(12) DEFAULT NULL,
  `Password` varchar(50) NOT NULL,
  `Status` varchar(50) DEFAULT NULL,
  `Image` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`Std_id`, `Name`, `Email`, `Contact`, `NIC`, `Password`, `Status`, `Image`) VALUES
('TG0001', 'Dinesh kumara', 'pathum@gmail.com', 123456789, '199615203041', '12345', 'Repeat', '/img/profile/TG0001.jpg'),
('TG0002', 'Saman gunasena', 'saman98@gmail.com', 792030768, '199856784551', 'cedd1e06', 'Repeat', NULL),
('TG0003', 'Gayani silva', 'gayani01@gmail.com', 895678123, '199926458901', 'gayan123', 'Repeat', NULL),
('TG0004', 'Kalana pathirana', 'kalana34@gmail.com', 789000234, '200022300567', 'f262041d', 'Proper', NULL),
('TG0005', 'Bagya prasadi', 'bagya45@gmail.com', 993456812, '199789013455', 'c8b2c1cf', 'Proper', NULL),
('TG0006', 'Avishka iduwara', 'avishka65@gmail.com', 773456781, '199034567812', 'da52b5cb', 'Proper', NULL),
('TG0007', 'Anjana rangajeewa', 'anjana10@gmail.com', 91234675, '188956872354', '4af10197', 'Proper', NULL),
('TG0008', 'Pathum priyadarshana', 'pathum@gmail.com', 715271000, '199826737891', '7ecbe35a', 'Proper', '/img/profile/TG0008.png'),
('TG0009', 'Ishan kumuditha', 'ishan2@gmail.com', 93784561, '200134568932', 'daead1e1', 'Proper', NULL),
('TG0010', 'Sithila ravihara', 'sithila1@gmail.com', 73485627, '200138472901', 'b40e2baa', 'Proper', NULL),
('TG0012', 'samiya', 'samiya@gmail.com', 778079455, '200112600387', 'samiya', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tech_officer`
--

CREATE TABLE `tech_officer` (
  `to_id` char(6) NOT NULL,
  `to_name` varchar(100) DEFAULT NULL,
  `to_mail` varchar(100) NOT NULL,
  `to_password` varchar(100) NOT NULL,
  `to_contact` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tech_officer`
--

INSERT INTO `tech_officer` (`to_id`, `to_name`, `to_mail`, `to_password`, `to_contact`) VALUES
('TO001', 'asdsadfsd', 'sdfsdfsddf', '1234', 1234123423),
('TO002', 'samiya', 'qwerqwer', '4567', 1232323123);

-- --------------------------------------------------------

--
-- Table structure for table `timetable`
--

CREATE TABLE `timetable` (
  `Crs_id` char(6) NOT NULL,
  `L_name` varchar(100) NOT NULL,
  `Mon` varchar(200) DEFAULT NULL,
  `Tue` varchar(200) DEFAULT NULL,
  `Wed` varchar(200) DEFAULT NULL,
  `Thu` varchar(200) DEFAULT NULL,
  `Fri` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `timetable`
--

INSERT INTO `timetable` (`Crs_id`, `L_name`, `Mon`, `Tue`, `Wed`, `Thu`, `Fri`) VALUES
('ICT001', 'Dilhan', 'aswdsasdf', 'sdfasdfsdd', 'Free Time', 'sdfasddfsdf', 'Free Time'),
('ICT002', 'awefdd', 'awsdfasdfsdf', 'asdfsdd', 'Free Time', 'Free Time', 'asdfasddf');

-- --------------------------------------------------------

--
-- Structure for view `assignment_marks_subject`
--
DROP TABLE IF EXISTS `assignment_marks_subject`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `assignment_marks_subject`  AS SELECT `assignment`.`Std_id` AS `Std_id`, `assignment`.`Crs_id` AS `Crs_id`, sum(case when `assignment`.`Crs_id` in ('ICT02','ICT04') then `assignment`.`Asm_mark` else 0 end) AS `total_assignment_marks` FROM `assignment` GROUP BY `assignment`.`Std_id`, `assignment`.`Crs_id``Crs_id`  ;

-- --------------------------------------------------------

--
-- Structure for view `ca_marks`
--
DROP TABLE IF EXISTS `ca_marks`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `ca_marks`  AS SELECT `q`.`Std_id` AS `Std_id`, `q`.`Crs_id` AS `Crs_id`, ifnull(`q`.`quiz_percentage`,0) + ifnull(`a`.`total_assignment_marks`,0) + ifnull(`m`.`Mid_mark`,0) AS `CA_marks` FROM (((select `quiz`.`Std_id` AS `Std_id`,`quiz`.`Crs_id` AS `Crs_id`,case when `quiz`.`Crs_id` in ('ICT01','ICT03','ICT04') then sum(`quiz`.`Qiz_mark`) / 30 * 10 when `quiz`.`Crs_id` = 'ICT02' then sum(`quiz`.`Qiz_mark`) / 40 * 10 else 0 end AS `quiz_percentage` from `quiz` group by `quiz`.`Std_id`,`quiz`.`Crs_id` having `quiz`.`Crs_id` in ('ICT01','ICT03','ICT04') and max(`quiz`.`Qiz_mark`) <= 60 or `quiz`.`Crs_id` = 'ICT02' and max(`quiz`.`Qiz_mark`) <= 80) `q` left join (select `assignment_marks_subject`.`Std_id` AS `Std_id`,`assignment_marks_subject`.`Crs_id` AS `Crs_id`,sum(`assignment_marks_subject`.`total_assignment_marks`) AS `total_assignment_marks` from `assignment_marks_subject` group by `assignment_marks_subject`.`Std_id`,`assignment_marks_subject`.`Crs_id`) `a` on(`q`.`Std_id` = `a`.`Std_id` and `q`.`Crs_id` = `a`.`Crs_id`)) left join (select `mid`.`Std_id` AS `Std_id`,`mid`.`Crs_id` AS `Crs_id`,sum(`mid`.`Mid_mark`) AS `Mid_mark` from `mid` group by `mid`.`Std_id`,`mid`.`Crs_id`) `m` on(`q`.`Std_id` = `m`.`Std_id` and `q`.`Crs_id` = `m`.`Crs_id`))  ;

-- --------------------------------------------------------

--
-- Structure for view `final_marks`
--
DROP TABLE IF EXISTS `final_marks`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `final_marks`  AS SELECT ifnull(`et`.`Std_id`,ifnull(`ep`.`Std_id`,`ca`.`Std_id`)) AS `Std_id`, ifnull(`et`.`Crs_id`,ifnull(`ep`.`Crs_id`,`ca`.`Crs_id`)) AS `Crs_id`, coalesce(`et`.`End_marks`,0) + coalesce(`ep`.`End_marks`,0) + coalesce(`ca`.`CA_marks`,0) AS `total_marks` FROM ((`end_theory` `et` left join `end_practical` `ep` on(`et`.`Std_id` = `ep`.`Std_id` and `et`.`Crs_id` = `ep`.`Crs_id`)) left join `ca_marks` `ca` on(`et`.`Std_id` = `ca`.`Std_id` and `et`.`Crs_id` = `ca`.`Crs_id`)) union select ifnull(`et`.`Std_id`,ifnull(`ep`.`Std_id`,`ca`.`Std_id`)) AS `Std_id`,ifnull(`et`.`Crs_id`,ifnull(`ep`.`Crs_id`,`ca`.`Crs_id`)) AS `Crs_id`,coalesce(`et`.`End_marks`,0) + coalesce(`ep`.`End_marks`,0) + coalesce(`ca`.`CA_marks`,0) AS `total_marks` from ((`end_practical` `ep` left join `end_theory` `et` on(`et`.`Std_id` = `ep`.`Std_id` and `et`.`Crs_id` = `ep`.`Crs_id`)) left join `ca_marks` `ca` on(`et`.`Std_id` = `ca`.`Std_id` and `et`.`Crs_id` = `ca`.`Crs_id`)) union select ifnull(`et`.`Std_id`,ifnull(`ep`.`Std_id`,`ca`.`Std_id`)) AS `Std_id`,ifnull(`et`.`Crs_id`,ifnull(`ep`.`Crs_id`,`ca`.`Crs_id`)) AS `Crs_id`,coalesce(`et`.`End_marks`,0) + coalesce(`ep`.`End_marks`,0) + coalesce(`ca`.`CA_marks`,0) AS `total_marks` from ((`ca_marks` `ca` left join `end_theory` `et` on(`et`.`Std_id` = `ca`.`Std_id` and `et`.`Crs_id` = `ca`.`Crs_id`)) left join `end_practical` `ep` on(`et`.`Std_id` = `ep`.`Std_id` and `et`.`Crs_id` = `ep`.`Crs_id`))  ;

-- --------------------------------------------------------

--
-- Structure for view `grads`
--
DROP TABLE IF EXISTS `grads`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `grads`  AS SELECT `final_marks`.`Std_id` AS `Std_id`, `final_marks`.`Crs_id` AS `Crs_id`, `final_marks`.`total_marks` AS `total_marks`, CASE WHEN `final_marks`.`total_marks` >= 85 AND `final_marks`.`total_marks` <= 100 THEN 'A+' WHEN `final_marks`.`total_marks` >= 75 AND `final_marks`.`total_marks` < 85 THEN 'A' WHEN `final_marks`.`total_marks` >= 70 AND `final_marks`.`total_marks` < 75 THEN 'A-' WHEN `final_marks`.`total_marks` >= 65 AND `final_marks`.`total_marks` < 70 THEN 'B+' WHEN `final_marks`.`total_marks` >= 60 AND `final_marks`.`total_marks` < 65 THEN 'B' WHEN `final_marks`.`total_marks` >= 55 AND `final_marks`.`total_marks` < 60 THEN 'B-' WHEN `final_marks`.`total_marks` >= 50 AND `final_marks`.`total_marks` < 55 THEN 'C+' WHEN `final_marks`.`total_marks` >= 45 AND `final_marks`.`total_marks` < 50 THEN 'C' WHEN `final_marks`.`total_marks` >= 40 AND `final_marks`.`total_marks` < 45 THEN 'C-' WHEN `final_marks`.`total_marks` >= 35 AND `final_marks`.`total_marks` < 40 THEN 'D+' WHEN `final_marks`.`total_marks` >= 30 AND `final_marks`.`total_marks` < 35 THEN 'D' ELSE 'E' END AS `grade`, CASE WHEN `final_marks`.`total_marks` >= 85 THEN 4.0 WHEN `final_marks`.`total_marks` >= 75 THEN 4.0 WHEN `final_marks`.`total_marks` >= 70 THEN 3.7 WHEN `final_marks`.`total_marks` >= 65 THEN 3.3 WHEN `final_marks`.`total_marks` >= 60 THEN 3.0 WHEN `final_marks`.`total_marks` >= 55 THEN 2.7 WHEN `final_marks`.`total_marks` >= 50 THEN 2.3 WHEN `final_marks`.`total_marks` >= 45 THEN 2.0 WHEN `final_marks`.`total_marks` >= 40 THEN 1.7 WHEN `final_marks`.`total_marks` >= 35 THEN 1.3 WHEN `final_marks`.`total_marks` >= 30 THEN 1.0 ELSE 0.0 END AS `points` FROM `final_marks``final_marks`  ;

-- --------------------------------------------------------

--
-- Structure for view `quiz_mark_percentage`
--
DROP TABLE IF EXISTS `quiz_mark_percentage`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `quiz_mark_percentage`  AS SELECT `q`.`Std_id` AS `Std_id`, `q`.`Crs_id` AS `Crs_id`, CASE WHEN `q`.`Crs_id` in ('ICT01','ICT03','ICT04') THEN `q`.`Best_quiz_marks`/ 30 * 10 WHEN `q`.`Crs_id` = 'ICT02' THEN `q`.`Best_quiz_marks`/ 40 * 10 ELSE 0 END AS `quiz_percentage` FROM (select `ranked_quiz`.`Std_id` AS `Std_id`,`ranked_quiz`.`Crs_id` AS `Crs_id`,sum(`ranked_quiz`.`Qiz_mark`) AS `Best_quiz_marks` from (select `quiz`.`Std_id` AS `Std_id`,`quiz`.`Crs_id` AS `Crs_id`,`quiz`.`Qiz_mark` AS `Qiz_mark`,row_number() over ( partition by `quiz`.`Std_id`,`quiz`.`Crs_id` order by `quiz`.`Qiz_mark` desc) AS `quiz_rank` from `quiz`) `ranked_quiz` where `ranked_quiz`.`Crs_id` in ('ICT01','ICT03','ICT04') and `ranked_quiz`.`quiz_rank` <= 2 or `ranked_quiz`.`Crs_id` = 'ICT02' and `ranked_quiz`.`quiz_rank` <= 3 group by `ranked_quiz`.`Std_id`,`ranked_quiz`.`Crs_id`) AS `q``q`  ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`adm_id`);

--
-- Indexes for table `assignment`
--
ALTER TABLE `assignment`
  ADD PRIMARY KEY (`Asm_id`);

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`A_id`);

--
-- Indexes for table `course_unit`
--
ALTER TABLE `course_unit`
  ADD PRIMARY KEY (`course_code`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`Dep_id`);

--
-- Indexes for table `end_practical`
--
ALTER TABLE `end_practical`
  ADD PRIMARY KEY (`End_id`);

--
-- Indexes for table `end_theory`
--
ALTER TABLE `end_theory`
  ADD PRIMARY KEY (`End_id`);

--
-- Indexes for table `lecture`
--
ALTER TABLE `lecture`
  ADD PRIMARY KEY (`Lec_id`);

--
-- Indexes for table `medical`
--
ALTER TABLE `medical`
  ADD PRIMARY KEY (`M_id`);

--
-- Indexes for table `mid`
--
ALTER TABLE `mid`
  ADD PRIMARY KEY (`Mid_id`);

--
-- Indexes for table `notice`
--
ALTER TABLE `notice`
  ADD PRIMARY KEY (`nId`);

--
-- Indexes for table `quiz`
--
ALTER TABLE `quiz`
  ADD PRIMARY KEY (`Quiz_id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`Std_id`);

--
-- Indexes for table `tech_officer`
--
ALTER TABLE `tech_officer`
  ADD PRIMARY KEY (`to_id`);

--
-- Indexes for table `timetable`
--
ALTER TABLE `timetable`
  ADD PRIMARY KEY (`Crs_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `notice`
--
ALTER TABLE `notice`
  MODIFY `nId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
