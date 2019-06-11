/*
Navicat MySQL Data Transfer

Source Server         : Diamon
Source Server Version : 50621
Source Host           : 127.0.0.1:3306
Source Database       : 1611b

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2019-06-11 09:16:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for rest
-- ----------------------------
DROP TABLE IF EXISTS `rest`;
CREATE TABLE `rest` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `rname` varchar(255) DEFAULT NULL,
  `rdept` varchar(255) DEFAULT NULL,
  `rtitle` varchar(255) DEFAULT NULL,
  `rstart` datetime DEFAULT NULL,
  `rstop` datetime DEFAULT NULL,
  `rdaycount` int(11) DEFAULT NULL,
  `rtype` varchar(255) DEFAULT NULL,
  `rresson` varchar(255) DEFAULT NULL,
  `rcheck` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rest
-- ----------------------------
INSERT INTO `rest` VALUES ('1', 'xiaoming', '产品经理', '请假', '2019-06-10 09:11:21', '2019-06-12 09:11:25', '3', '请假', '病假', '0');
INSERT INTO `rest` VALUES ('2', 'xiaohong', '人力资源', '请假', '2019-06-10 09:11:21', '2019-06-12 09:11:25', '3', '请假', '病假', '0');
INSERT INTO `rest` VALUES ('3', 'xiaoqiang', '市场调研', '请假', '2019-06-10 09:11:21', '2019-06-12 09:11:25', '3', '请假', '病假', '0');
INSERT INTO `rest` VALUES ('4', 'laozhang', '运营维护', '请假', '2019-06-10 09:11:21', '2019-06-12 09:11:25', '3', '请假', '病假', '0');
