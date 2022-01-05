/*
 Navicat Premium Data Transfer

 Source Server         : self
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : serliunx

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 05/01/2022 20:10:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for login_log
-- ----------------------------
DROP TABLE IF EXISTS `login_log`;
CREATE TABLE `login_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '日志id',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `login_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '登陆时间',
  `ip` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '登陆IP',
  `device` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '设备',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 353 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of login_log
-- ----------------------------
INSERT INTO `login_log` VALUES (348, 37, '2022-01-05 18:12:26', '0:0:0:0:0:0:0:1', 'CHROME9');
INSERT INTO `login_log` VALUES (349, 40, '2022-01-05 18:20:25', '0:0:0:0:0:0:0:1', 'CHROME9');
INSERT INTO `login_log` VALUES (350, 40, '2022-01-05 18:55:32', '0:0:0:0:0:0:0:1', 'CHROME9');
INSERT INTO `login_log` VALUES (351, 40, '2022-01-05 19:12:46', '0:0:0:0:0:0:0:1', 'CHROME9');
INSERT INTO `login_log` VALUES (352, 40, '2022-01-05 19:16:56', '0:0:0:0:0:0:0:1', 'CHROME9');

-- ----------------------------
-- Table structure for reply
-- ----------------------------
DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '回复id',
  `topic_id` int(11) NOT NULL COMMENT '主题id',
  `reply_user_id` int(11) NOT NULL COMMENT '用户id',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '回复内容',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `device` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '设备',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 110 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of reply
-- ----------------------------

-- ----------------------------
-- Table structure for tab
-- ----------------------------
DROP TABLE IF EXISTS `tab`;
CREATE TABLE `tab`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '板块id',
  `tab_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '板块名',
  `tab_name_en` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tab
-- ----------------------------
INSERT INTO `tab` VALUES (3, '话题交流', 'communicate');
INSERT INTO `tab` VALUES (2, '软硬件开发', 'develop');
INSERT INTO `tab` VALUES (1, '技术分享', 'tech');
INSERT INTO `tab` VALUES (4, '问题求助', 'help');
INSERT INTO `tab` VALUES (5, '物品交易', 'deal');
INSERT INTO `tab` VALUES (6, '寻物启事', 'item_lost');
INSERT INTO `tab` VALUES (7, '失物招领', 'itemuser_find');

-- ----------------------------
-- Table structure for topic
-- ----------------------------
DROP TABLE IF EXISTS `topic`;
CREATE TABLE `topic`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '帖子ID',
  `user_id` int(11) NOT NULL COMMENT '发帖人id',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  `title` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '标题',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '内容',
  `click` int(11) NOT NULL DEFAULT 0 COMMENT '点击量',
  `tab_id` tinyint(4) NOT NULL COMMENT '发布板块',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 68 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of topic
-- ----------------------------
INSERT INTO `topic` VALUES (67, 40, '2022-01-05 18:25:01', '2022-01-05 19:20:03', '233333', '<p>测试</p>', 4, 3);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户唯一ID',
  `username` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `phone_num` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `credit` int(11) NOT NULL COMMENT '积分',
  `avatar` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '头像url',
  `type` tinyint(4) NOT NULL DEFAULT 0 COMMENT '用户类型,0为普通用户,1为管理员',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 41 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (40, 'serliunx', 'e10adc3949ba59abbe56e057f20f883e', 'serliunx@yeah.net', '17689674149', '2022-01-05 18:20:17', '2022-01-05 19:16:55', 4, 'resources/images/avatar-default-5.png', 0);

SET FOREIGN_KEY_CHECKS = 1;
