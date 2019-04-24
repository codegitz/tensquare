/*
Navicat MySQL Data Transfer

Source Server         : 47.107.71.209_3306
Source Server Version : 50725
Source Host           : 47.107.71.209:3306
Source Database       : tensquare_qa

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-04-24 09:51:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_pl
-- ----------------------------
DROP TABLE IF EXISTS `tb_pl`;
CREATE TABLE `tb_pl` (
  `problemid` varchar(20) NOT NULL COMMENT '问题ID',
  `labelid` varchar(20) NOT NULL COMMENT '标签ID',
  PRIMARY KEY (`problemid`,`labelid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_problem
-- ----------------------------
DROP TABLE IF EXISTS `tb_problem`;
CREATE TABLE `tb_problem` (
  `id` varchar(20) NOT NULL COMMENT 'ID',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `content` text COMMENT '内容',
  `createtime` datetime DEFAULT NULL COMMENT '创建日期',
  `updatetime` datetime DEFAULT NULL COMMENT '修改日期',
  `userid` varchar(20) DEFAULT NULL COMMENT '用户ID',
  `nickname` varchar(100) DEFAULT NULL COMMENT '昵称',
  `visits` bigint(20) DEFAULT NULL COMMENT '浏览量',
  `thumbup` bigint(20) DEFAULT NULL COMMENT '点赞数',
  `reply` bigint(20) DEFAULT NULL COMMENT '回复数',
  `solve` varchar(1) DEFAULT NULL COMMENT '是否解决',
  `replyname` varchar(100) DEFAULT NULL COMMENT '回复人昵称',
  `replytime` datetime DEFAULT NULL COMMENT '回复日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='问题';

-- ----------------------------
-- Table structure for tb_reply
-- ----------------------------
DROP TABLE IF EXISTS `tb_reply`;
CREATE TABLE `tb_reply` (
  `id` varchar(20) NOT NULL COMMENT '编号',
  `problemid` varchar(20) DEFAULT NULL COMMENT '问题ID',
  `content` text COMMENT '回答内容',
  `createtime` datetime DEFAULT NULL COMMENT '创建日期',
  `updatetime` datetime DEFAULT NULL COMMENT '更新日期',
  `userid` varchar(20) DEFAULT NULL COMMENT '回答人ID',
  `nickname` varchar(100) DEFAULT NULL COMMENT '回答人昵称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='回答';

-- ----------------------------
-- Table structure for tb_ul
-- ----------------------------
DROP TABLE IF EXISTS `tb_ul`;
CREATE TABLE `tb_ul` (
  `uid` varchar(20) NOT NULL COMMENT '用户ID',
  `lid` varchar(20) NOT NULL COMMENT '标签ID',
  PRIMARY KEY (`uid`,`lid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
