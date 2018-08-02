-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: community
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user_account`
--

DROP TABLE IF EXISTS `user_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user_account` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` varchar(32) NOT NULL COMMENT 'SSO的USER表id',
  `name` varchar(20) NOT NULL DEFAULT '',
  `mobile_phone` varchar(20) NOT NULL DEFAULT '',
  `password` varchar(32) DEFAULT NULL,
  `photo_url` varchar(100) DEFAULT '',
  `nick_name` varchar(20) DEFAULT '',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `user_type` tinyint(3) unsigned NOT NULL DEFAULT '1' COMMENT '用户类型：1：普通用户 2：媒体用户 3：官方用户',
  `email` varchar(30) DEFAULT NULL,
  `qq` varchar(11) DEFAULT NULL,
  `register_date` datetime DEFAULT NULL COMMENT '注册时间',
  `last_login_date` datetime DEFAULT NULL COMMENT '最后登录时间',
  `fans` bigint(20) unsigned DEFAULT '0' COMMENT '用户粉丝数',
  `medal_count` int(20) DEFAULT NULL COMMENT '勋章数',
  `nick_change_times` int(11) DEFAULT NULL COMMENT '昵称修改次数',
  `last_nickchange_time` datetime DEFAULT NULL COMMENT '上次昵称修改时间',
  `bansend_timelength` bigint(20) DEFAULT NULL COMMENT '禁言时长（单位：小时，-1：永久禁言）',
  `bansend_starttime` datetime DEFAULT NULL COMMENT '禁言开始时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_user_id` (`user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=123470 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_account`
--

LOCK TABLES `user_account` WRITE;
/*!40000 ALTER TABLE `user_account` DISABLE KEYS */;
INSERT INTO `user_account` VALUES (123466,'7d90fec8f29d4dadae888be8f51f3830','admin','15201875715','202cb962ac59075b964b07152d234b70','','霸王刘','2018-07-30 15:55:21',NULL,1,'2030503816@qq.com','2030503816','2018-07-31 14:29:12','2018-08-01 16:16:20',0,NULL,NULL,NULL,NULL,NULL),(123467,'656a03548f704c3893685be5eaa68c00','admin1','1222','202cb962ac59075b964b07152d234b70','','123','2018-07-31 13:01:34',NULL,1,'123','123','2018-07-31 13:01:34',NULL,0,NULL,NULL,NULL,NULL,NULL),(123468,'84eb0e5e9b464996803a3bb4ae5936aa','上善若水','18866866818','202cb962ac59075b964b07152d234b70','','无敌','2018-07-31 14:59:59',NULL,1,'2030503816@QQ.COM','2030503816','2018-07-31 14:59:59',NULL,0,NULL,NULL,NULL,NULL,NULL),(123469,'dfe792030df64b0da8035c13206573ae','上善若水1','18866866818','202cb962ac59075b964b07152d234b70','','无敌1','2018-07-31 15:25:57',NULL,1,'02030503816@qq.com','2030503816','2018-07-31 15:25:57',NULL,0,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `user_account` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-02 16:58:53
