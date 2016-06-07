/*
Navicat MySQL Data Transfer

Source Server         : courseregis
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : courseregis

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2016-06-06 11:52:25
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
  `Grade` decimal(10,0) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `ID` int(11) NOT NULL,
  `CourseID` int(11) NOT NULL,
  `PID` int(11) NOT NULL,
  `TimeArray` varchar(77) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for courses
-- ----------------------------
DROP TABLE IF EXISTS `courses`;
CREATE TABLE `courses` (
  `ID` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Cost` decimal(10,0) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `ID` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for em
-- ----------------------------
DROP TABLE IF EXISTS `em`;
CREATE TABLE `em` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `job` varchar(255) default NULL,
  `salary` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for emp599
-- ----------------------------
DROP TABLE IF EXISTS `emp599`;
CREATE TABLE `emp599` (
  `id` int(11) NOT NULL,
  `name` varchar(10) default NULL,
  `salary` double default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for professor
-- ----------------------------
DROP TABLE IF EXISTS `professor`;
CREATE TABLE `professor` (
  `ID` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Birthday` date default NULL,
  `SSN` varchar(18) NOT NULL,
  `Status` varchar(20) default NULL,
  `DepartmentID` int(8) default NULL,
  `Pwd` varchar(32) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for registrar
-- ----------------------------
DROP TABLE IF EXISTS `registrar`;
CREATE TABLE `registrar` (
  `ID` int(11) NOT NULL,
  `Pwd` varchar(32) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `ID` int(8) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Birthday` date default NULL,
  `SSN` varchar(18) NOT NULL,
  `Status` varchar(20) default NULL,
  `GraduationDate` date default NULL,
  `Pwd` varchar(32) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for testem
-- ----------------------------
DROP TABLE IF EXISTS `testem`;
CREATE TABLE `testem` (
  `ID` int(11) NOT NULL,
  `name` varchar(20) default NULL,
  `job` varchar(20) default NULL,
  `salary` decimal(8,0) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
