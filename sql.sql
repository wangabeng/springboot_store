# 用户buyer_user
CREATE TABLE `buyer_user`(
	`user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT "用户id",
	`user_password` VARCHAR(128) NOT NULL DEFAULT '' COMMENT "用户密码",
	`user_name` VARCHAR(128) NOT NULL DEFAULT '' COMMENT "用户昵称",
	`user_gender` TINYINT(4) NOT NULL DEFAULT '0' COMMENT "用户性别",
	`user_age` INT(11) NOT NULL DEFAULT '0' COMMENT "用户年龄",
	`user_portrait` VARCHAR(128) NOT NULL DEFAULT '' COMMENT "用户头像",
	PRIMARY KEY(`user_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT "用户表";