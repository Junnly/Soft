/*
Navicat MySQL Data Transfer

Source Server         : courseregis
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : courseregis

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2016-06-05 12:33:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `ID` varchar(6) NOT NULL,
  `SSN` varchar(18) default NULL,
  `Name` varchar(20) NOT NULL,
  `DateTime` datetime default NULL,
  PRIMARY KEY  (`ID`)
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
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `Grade` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for passwd
-- ----------------------------
DROP TABLE IF EXISTS `passwd`;
CREATE TABLE `passwd` (
  `UserName` char(20) NOT NULL,
  `Pwd` varchar(32) default NULL,
  `Level` int(11) NOT NULL,
  PRIMARY KEY  (`UserName`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for professor
-- ----------------------------
DROP TABLE IF EXISTS `professor`;
CREATE TABLE `professor` (
  `SSN` varchar(18) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Birthday` date default NULL,
  `Status` varchar(20) default NULL,
  `Department` varchar(20) default NULL,
  PRIMARY KEY  (`SSN`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `Name` varchar(20) NOT NULL,
  `Birthday` date default NULL,
  `SSN` varchar(18) NOT NULL,
  `GraduationDate` date default NULL,
  PRIMARY KEY  (`SSN`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
