/*
Navicat MySQL Data Transfer

Source Server         : 47.107.71.209_3306
Source Server Version : 50725
Source Host           : 47.107.71.209:3306
Source Database       : tensquare_recruit

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-04-24 09:51:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_enterprise
-- ----------------------------
DROP TABLE IF EXISTS `tb_enterprise`;
CREATE TABLE `tb_enterprise` (
  `id` varchar(20) NOT NULL COMMENT 'ID',
  `name` varchar(100) DEFAULT NULL COMMENT '企业名称',
  `summary` varchar(1000) DEFAULT NULL COMMENT '企业简介',
  `address` varchar(100) DEFAULT NULL COMMENT '企业地址',
  `labels` varchar(100) DEFAULT NULL COMMENT '标签列表',
  `coordinate` varchar(100) DEFAULT NULL COMMENT '坐标',
  `ishot` varchar(1) DEFAULT NULL COMMENT '是否热门',
  `logo` varchar(100) DEFAULT NULL COMMENT 'LOGO',
  `jobcount` int(11) DEFAULT NULL COMMENT '职位数',
  `url` varchar(100) DEFAULT NULL COMMENT 'URL',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业';

-- ----------------------------
-- Table structure for tb_recruit
-- ----------------------------
DROP TABLE IF EXISTS `tb_recruit`;
CREATE TABLE `tb_recruit` (
  `id` varchar(20) NOT NULL COMMENT 'ID',
  `jobname` varchar(100) DEFAULT NULL COMMENT '职位名称',
  `salary` varchar(100) DEFAULT NULL COMMENT '薪资范围',
  `condition` varchar(100) DEFAULT NULL COMMENT '经验要求',
  `education` varchar(100) DEFAULT NULL COMMENT '学历要求',
  `type` varchar(1) DEFAULT NULL COMMENT '任职方式',
  `address` varchar(100) DEFAULT NULL COMMENT '办公地址',
  `eid` varchar(20) DEFAULT NULL COMMENT '企业ID',
  `createtime` datetime DEFAULT NULL COMMENT '创建日期',
  `state` varchar(1) DEFAULT NULL COMMENT '状态',
  `url` varchar(100) DEFAULT NULL COMMENT '网址',
  `label` varchar(100) DEFAULT NULL COMMENT '标签',
  `content1` varchar(100) DEFAULT NULL COMMENT '职位描述',
  `content2` varchar(100) DEFAULT NULL COMMENT '职位要求',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='职位';
