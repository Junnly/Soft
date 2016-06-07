/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : courseregis

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2016-06-06 13:29:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for choose
-- ----------------------------
DROP TABLE IF EXISTS `choose`;
CREATE TABLE `choose` (
  `ID` int(11) NOT NULL,
  `SID` int(11) NOT NULL,
  `CID` int(11) NOT NULL,
  `Grade` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of choose
-- ----------------------------

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `ID` int(11) NOT NULL,
  `CourseID` int(11) NOT NULL,
  `PID` int(11) NOT NULL,
  `TimeArray` varchar(77) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `f2` (`CourseID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------

-- ----------------------------
-- Table structure for courses
-- ----------------------------
DROP TABLE IF EXISTS `courses`;
CREATE TABLE `courses` (
  `ID` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Cost` decimal(10,0) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of courses
-- ----------------------------

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `ID` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------

-- ----------------------------
-- Table structure for professor
-- ----------------------------
DROP TABLE IF EXISTS `professor`;
CREATE TABLE `professor` (
  `ID` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Birthday` date DEFAULT NULL,
  `SSN` varchar(18) NOT NULL,
  `Status` varchar(20) DEFAULT NULL,
  `DepartmentID` int(8) DEFAULT NULL,
  `Pwd` varchar(32) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `DepartmentID` (`DepartmentID`),
  CONSTRAINT `departmentid` FOREIGN KEY (`DepartmentID`) REFERENCES `department` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of professor
-- ----------------------------

-- ----------------------------
-- Table structure for registrar
-- ----------------------------
DROP TABLE IF EXISTS `registrar`;
CREATE TABLE `registrar` (
  `ID` int(11) NOT NULL,
  `Pwd` varchar(32) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of registrar
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `ID` int(8) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Birthday` date DEFAULT NULL,
  `SSN` varchar(18) NOT NULL,
  `Status` varchar(20) DEFAULT NULL,
  `GraduationDate` date DEFAULT NULL,
  `Pwd` varchar(32) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
