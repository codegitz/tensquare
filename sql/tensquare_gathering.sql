/*
Navicat MySQL Data Transfer

Source Server         : 47.107.71.209_3306
Source Server Version : 50725
Source Host           : 47.107.71.209:3306
Source Database       : tensquare_gathering

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-04-24 09:51:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_gathering
-- ----------------------------
DROP TABLE IF EXISTS `tb_gathering`;
CREATE TABLE `tb_gathering` (
  `id` varchar(20) NOT NULL COMMENT '编号',
  `name` varchar(100) DEFAULT NULL COMMENT '活动名称',
  `summary` text COMMENT '大会简介',
  `detail` text COMMENT '详细说明',
  `sponsor` varchar(100) DEFAULT NULL COMMENT '主办方',
  `image` varchar(100) DEFAULT NULL COMMENT '活动图片',
  `starttime` datetime DEFAULT NULL COMMENT '开始时间',
  `endtime` datetime DEFAULT NULL COMMENT '截止时间',
  `address` varchar(100) DEFAULT NULL COMMENT '举办地点',
  `enrolltime` datetime DEFAULT NULL COMMENT '报名截止',
  `state` varchar(1) DEFAULT NULL COMMENT '是否可见',
  `city` varchar(20) DEFAULT NULL COMMENT '城市',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动';

-- ----------------------------
-- Table structure for tb_usergath
-- ----------------------------
DROP TABLE IF EXISTS `tb_usergath`;
CREATE TABLE `tb_usergath` (
  `userid` varchar(20) NOT NULL COMMENT '用户ID',
  `gathid` varchar(20) NOT NULL COMMENT '活动ID',
  `exetime` datetime DEFAULT NULL COMMENT '点击时间',
  PRIMARY KEY (`userid`,`gathid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户关注活动';
