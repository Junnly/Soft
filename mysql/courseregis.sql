/*
SQLyog Ultimate v8.32 
MySQL - 5.0.16 : Database - project
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`courseregis` /*!40100 DEFAULT CHARACTER SET gb2312 */;

USE `courseregis`;

/*Table structure for table `choose` */

DROP TABLE IF EXISTS `choose`;

CREATE TABLE `choose` (
  `SID` int(8) unsigned NOT NULL,
  `CID` int(8) unsigned NOT NULL,
  `Grade` decimal(3,0) default NULL,
  PRIMARY KEY  (`SID`,`CID`),
  KEY `CID` (`CID`),
  CONSTRAINT `choose_ibfk_1` FOREIGN KEY (`SID`) REFERENCES `student` (`SID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `choose_ibfk_2` FOREIGN KEY (`CID`) REFERENCES `course` (`CID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `choose` */

insert  into `choose`(`SID`,`CID`,`Grade`) values (10,13,'0'),(10,14,'1'),(11,13,'4'),(11,14,'45');

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `CID` int(8) unsigned NOT NULL,
  `CourseID` int(8) unsigned NOT NULL,
  `PID` int(8) unsigned default NULL,
  `TimeArray` varchar(77) character set utf8 collate utf8_bin NOT NULL default '00000000000000000000000000000000000000000000000000000000000000000000000000000',
  PRIMARY KEY  (`CID`),
  KEY `CourseID` (`CourseID`),
  KEY `PID` (`PID`),
  CONSTRAINT `course_ibfk_1` FOREIGN KEY (`CourseID`) REFERENCES `courses` (`CourseID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `course_ibfk_2` FOREIGN KEY (`PID`) REFERENCES `professor` (`PID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `course` */

insert  into `course`(`CID`,`CourseID`,`PID`,`TimeArray`) values (13,1,NULL,'00000000000000000000000000000000000000000000000000000000000000000000000000000'),(14,1,21,'00000000000000000000000000000000000000000000000000000000000000000000000000000');

/*Table structure for table `courses` */

DROP TABLE IF EXISTS `courses`;

CREATE TABLE `courses` (
  `CourseID` int(8) unsigned NOT NULL,
  `CourseName` varchar(20) NOT NULL,
  `Cost` decimal(10,2) unsigned NOT NULL,
  PRIMARY KEY  (`CourseID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `courses` */

insert  into `courses`(`CourseID`,`CourseName`,`Cost`) values (1,'编译原理','200.00'),(2,'数据库','150.00'),(3,'大学物理','100.00'),(4,'c++','300.00'),(5,'java程序设计','200.00'),(6,'数字电路','300.00'),(7,'微型计算机与汇编程序设计','200.00'),(8,'生物考古论','300.00'),(9,'世界经济发展史','200.00');

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `DepartmentID` int(8) unsigned NOT NULL,
  `DepartmentName` varchar(20) NOT NULL,
  PRIMARY KEY  (`DepartmentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `department` */

insert  into `department`(`DepartmentID`,`DepartmentName`) values (0,'地探学院'),(1,'计算机学院'),(2,'物理学院'),(3,'数学学院'),(4,'文学院'),(5,'软件学院');

/*Table structure for table `professor` */

DROP TABLE IF EXISTS `professor`;

CREATE TABLE `professor` (
  `PID` int(8) unsigned NOT NULL,
  `PName` varchar(20) NOT NULL,
  `PBirthday` date default NULL,
  `PSSN` bigint(18) unsigned NOT NULL,
  `PStatus` varchar(20) default NULL,
  `DepartmentID` int(8) unsigned default NULL,
  `PPwd` varchar(32) NOT NULL,
  PRIMARY KEY  (`PID`),
  KEY `DepartmentID` (`DepartmentID`),
  CONSTRAINT `professor_ibfk_1` FOREIGN KEY (`DepartmentID`) REFERENCES `department` (`DepartmentID`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `professor` */

insert  into `professor`(`PID`,`PName`,`PBirthday`,`PSSN`,`PStatus`,`DepartmentID`,`PPwd`) values (13,'Jiaxin','1994-12-08',7890890,'teacher',2,'123'),(14,'Zeyu','1993-02-03',2564,'teacher',3,'123'),(15,'Xiaomage','1995-06-02',234,'teacher',4,'123'),(16,'Huige','1993-09-05',456,'teacher',5,'123'),(17,'Zhangchanghai','1960-09-03',4564454,'teacher',1,'123'),(21,'xioahui','1994-12-04',45645,'teacher',1,'123'),(22,'Penhui','1994-12-04',45645,'teacher',1,'123'),(232,'Xioawei','1994-12-08',123523,'teacher',1,'123');

/*Table structure for table `registrar` */

DROP TABLE IF EXISTS `registrar`;

CREATE TABLE `registrar` (
  `RID` int(8) unsigned NOT NULL,
  `RPwd` varchar(32) NOT NULL,
  `IsRegistering` tinyint(1) unsigned NOT NULL default '0',
  PRIMARY KEY  (`RID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `registrar` */

insert  into `registrar`(`RID`,`RPwd`,`IsRegistering`) values (0,'111',1);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `SID` int(8) unsigned NOT NULL,
  `SName` varchar(20) NOT NULL,
  `SBirthday` date default NULL,
  `SSSN` bigint(18) unsigned NOT NULL,
  `SStatus` varchar(20) default NULL,
  `SGraduationDate` date default NULL,
  `SPwd` varchar(32) NOT NULL,
  PRIMARY KEY  (`SID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`SID`,`SName`,`SBirthday`,`SSSN`,`SStatus`,`SGraduationDate`,`SPwd`) values (10,'Tomm','1994-12-13',15566,'in school','2017-12-03','123'),(11,'Xuewei','1999-06-09',12345678,'in school','2016-06-15','123'),(13,'Zhaopenghui','1993-03-09',12344,'in school','2017-06-09','123'),(14,'Niujiaxin','1994-06-07',12355,'in school','2017-06-08','123'),(16,'Liuyuanzheng','1994-05-06',12345,'in school','2017-06-09','123'),(17,'Maxuewei','1995-10-09',7895,'in school','2017-06-09','123'),(20,'Lizeyu','1994-08-25',1234,'in school','2017-06-08','123'),(56,'Toky','1997-12-12',12314,'in school','2017-01-02','123');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
