DROP database IF EXISTS `test1`;
create database `test1` default character set utf8 collate utf8_general_ci;
use test1;
# Dump of table sys_permission
# ------------------------------------------------------------

DROP TABLE IF EXISTS `sys_permission`;

CREATE TABLE `sys_permission` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `resource_type` varchar(20) DEFAULT NULL,
  `url` varchar(64) DEFAULT NULL,
  `permission` varchar(20) DEFAULT NULL,
  `parent_id` bigint(30) DEFAULT NULL,
  `available` tinyint(1) DEFAULT NULL,
  `parent_ids` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `sys_permission` WRITE;
/*!40000 ALTER TABLE `sys_permission` DISABLE KEYS */;

INSERT INTO `sys_permission` (`id`, `name`, `resource_type`, `url`, `permission`, `parent_id`, `available`, `parent_ids`)
VALUES
	(1,'用户管理','menu','userInfo/userList','userInfo:view',0,0,'0/'),
	(2,'用户添加','button','userInfo/userAdd','userInfo:add',1,0,'0/1'),
	(3,'用户删除','button','userInfo/userDel','userInfo:del',1,0,'0/1');

/*!40000 ALTER TABLE `sys_permission` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table sys_role
# ------------------------------------------------------------

DROP TABLE IF EXISTS `sys_role`;

CREATE TABLE `sys_role` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `role` varchar(20) DEFAULT NULL,
  `description` varchar(64) DEFAULT NULL,
  `available` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `sys_role` WRITE;
/*!40000 ALTER TABLE `sys_role` DISABLE KEYS */;

INSERT INTO `sys_role` (`id`, `role`, `description`, `available`)
VALUES
	(1,'admin','管理员',0),
	(2,'vip','VIP会员',0),
	(3,'test','test',1);

/*!40000 ALTER TABLE `sys_role` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table sys_role_permission
# ------------------------------------------------------------

DROP TABLE IF EXISTS `sys_role_permission`;

CREATE TABLE `sys_role_permission` (
  `permission_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `sys_role_permission` WRITE;
/*!40000 ALTER TABLE `sys_role_permission` DISABLE KEYS */;

INSERT INTO `sys_role_permission` (`permission_id`, `role_id`)
VALUES
	(1,1),
	(2,1),
	(3,2);

/*!40000 ALTER TABLE `sys_role_permission` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table sys_user_role
# ------------------------------------------------------------

DROP TABLE IF EXISTS `sys_user_role`;

CREATE TABLE `sys_user_role` (
  `role_id` int(11) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `sys_user_role` WRITE;
/*!40000 ALTER TABLE `sys_user_role` DISABLE KEYS */;

INSERT INTO `sys_user_role` (`role_id`, `uid`)
VALUES
	(1,1),
	(2,1),
	(3,1),
	(2,3);

/*!40000 ALTER TABLE `sys_user_role` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `pass_word` varchar(255) NOT NULL,
  `user_sex` varchar(20) DEFAULT NULL,
  `email` varchar(255) NOT NULL DEFAULT '',
  `nick_name` varchar(255) DEFAULT '',
  `reg_time` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;

INSERT INTO `user` (`id`, `user_name`, `pass_word`, `user_sex`, `email`, `nick_name`, `reg_time`)
VALUES
	(5,'aa1','aa123456777','WOMEN','aa@126.com','neo','2018?1?29? ??05?25?45?'),
	(6,'bb2','bb123456777','MEN','bb@126.com','bb123456','2018?1?29? ??05?25?45?'),
	(7,'cc3','cc123456','WOMEN','cc@126.com','cc123456','2018?1?29? ??05?25?45?'),
	(10,'aa','','MEN','heehe','hhevuyvivuou',''),
	(22,'hehehehe','ndsjakndksand','MEN','vdsvdvds','dddddd','dsds'),
	(27,'hehehehe0','ndsjakndksand0','MEN','vdsvdvds0','dddddd0','dsadsfjhds0'),
	(28,'hehehehe1','ndsjakndksand1','MEN','vdsvdvds1','dddddd1','dsadsfjhds1'),
	(29,'hehehehe2','ndsjakndksand2','MEN','vdsvdvds2','dddddd2','dsadsfjhds2'),
	(30,'hehehehe3','ndsjakndksand3','MEN','vdsvdvds3','dddddd3','dsadsfjhds3'),
	(31,'hehehehe4','ndsjakndksand4','MEN','vdsvdvds4','dddddd4','dsadsfjhds4'),
	(32,'hehehehe5','ndsjakndksand5','MEN','vdsvdvds5','dddddd5','dsadsfjhds5'),
	(33,'hehehehe6','ndsjakndksand6','MEN','vdsvdvds6','dddddd6','dsadsfjhds6'),
	(34,'hehehehe7','ndsjakndksand7','MEN','vdsvdvds7','dddddd7','dsadsfjhds7'),
	(35,'hehehehe8','ndsjakndksand8','MEN','vdsvdvds8','dddddd8','dsadsfjhds8'),
	(36,'hehehehe9','ndsjakndksand9','MEN','vdsvdvds9','dddddd9','dsadsfjhds9'),
	(38,'aadsadsa','a123456','MEN','','',''),
	(41,'aadsaddsdsa','a123456','MEN','','',''),
	(42,'bbdsadasddddsa','b123456','WOMEN','','',''),
	(43,'ccdsaddsasdsadsa','b123456','WOMEN','','',''),
	(44,'xxxindy','416356629','WOMEN','','','');

/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table user_info
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `uid` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `password` varchar(64) DEFAULT NULL,
  `salt` varchar(64) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `user_info` WRITE;
/*!40000 ALTER TABLE `user_info` DISABLE KEYS */;

INSERT INTO `user_info` (`uid`, `username`, `name`, `password`, `salt`, `state`)
VALUES
	(1,'admin','管理员','d3c59d25033dbf980d29554025c23a75','8d78869f470951332959580424d4bf4f',0),
	(3,'testUser',NULL,'5aff3cbfb8b3411359cda71d504fc446','87fbcadb0e334b9886536b887d170c23',NULL),
	(4,'testUser2',NULL,'88af23e64a8a39ec0d591a73f8c0e6ce','cb3acc1cb1d4476b894af72bc14d96a9',NULL);

/*!40000 ALTER TABLE `user_info` ENABLE KEYS */;
UNLOCK TABLES;

DROP database IF EXISTS `test2`;
create database `test2` default character set utf8 collate utf8_general_ci;
use test2;
# Dump of table message
# ------------------------------------------------------------

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `message` WRITE;
/*!40000 ALTER TABLE `message` DISABLE KEYS */;

INSERT INTO `message` (`id`, `content`, `name`)
VALUES
	(1,'aaaaaaaaaa','o1'),
	(2,'bbbbbbbbbb','o2'),
	(3,'cccccccccc','o3');

/*!40000 ALTER TABLE `message` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `pass_word` varchar(255) NOT NULL,
  `user_sex` varchar(20) DEFAULT NULL,
  `email` varchar(255) NOT NULL DEFAULT '',
  `nick_name` varchar(255) DEFAULT '',
  `reg_time` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;

INSERT INTO `user` (`id`, `user_name`, `pass_word`, `user_sex`, `email`, `nick_name`, `reg_time`)
VALUES
	(5,'aa1','aa123456777','WOMEN','aa@126.com','neo','2018?1?29? ??05?25?45?'),
	(6,'bb2','bb123456777','MEN','bb@126.com','bb123456','2018?1?29? ??05?25?45?'),
	(7,'cc3','cc123456','WOMEN','cc@126.com','cc123456','2018?1?29? ??05?25?45?'),
	(10,'aa','','MEN','heehe','hhevuyvivuou',''),
	(22,'hehehehe','ndsjakndksand','MEN','vdsvdvds','dddddd','dsds'),
	(27,'hehehehe0','ndsjakndksand0','MEN','vdsvdvds0','dddddd0','dsadsfjhds0'),
	(28,'hehehehe1','ndsjakndksand1','MEN','vdsvdvds1','dddddd1','dsadsfjhds1'),
	(29,'hehehehe2','ndsjakndksand2','MEN','vdsvdvds2','dddddd2','dsadsfjhds2'),
	(30,'hehehehe3','ndsjakndksand3','MEN','vdsvdvds3','dddddd3','dsadsfjhds3'),
	(31,'hehehehe4','ndsjakndksand4','MEN','vdsvdvds4','dddddd4','dsadsfjhds4'),
	(32,'hehehehe5','ndsjakndksand5','MEN','vdsvdvds5','dddddd5','dsadsfjhds5'),
	(33,'hehehehe6','ndsjakndksand6','MEN','vdsvdvds6','dddddd6','dsadsfjhds6'),
	(34,'hehehehe7','ndsjakndksand7','MEN','vdsvdvds7','dddddd7','dsadsfjhds7'),
	(35,'hehehehe8','ndsjakndksand8','MEN','vdsvdvds8','dddddd8','dsadsfjhds8'),
	(36,'hehehehe9','ndsjakndksand9','MEN','vdsvdvds9','dddddd9','dsadsfjhds9'),
	(38,'aadsadsa','a123456','MEN','','',''),
	(41,'aadsaddsdsa','a123456','MEN','','',''),
	(42,'bbdsadasddddsa','b123456','WOMEN','','',''),
	(43,'ccdsaddsasdsadsa','b123456','WOMEN','','','');

/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
