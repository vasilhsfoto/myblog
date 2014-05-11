CREATE DATABASE IF NOT EXISTS blog;

USE blog;

CREATE TABLE IF NOT EXISTS post (
	post_id INT NOT NULL AUTO_INCREMENT,
	article BLOB NOT NULL,
	post_date DATE NOT NULL,

	CONSTRAINT post_pk PRIMARY KEY(post_id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS tag (
	tag_id INT NOT NULL AUTO_INCREMENT,
	tag VARCHAR(20) NOT NULL UNIQUE,

	CONSTRAINT tag_pk PRIMARY KEY(tag_id)
)ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS post_tag (
	fk_post_id INT NOT NULL AUTO_INCREMENT,
	fk_tag_id INT NOT NULL,

	CONSTRAINT post_tag_pk PRIMARY KEY(fk_post_id, fk_tag_id),
	CONSTRAINT post_tag_fk_post FOREIGN KEY (fk_post_id) REFERENCES post(post_id),
	CONSTRAINT post_tag_fk_tag FOREIGN KEY (fk_tag_id) REFERENCES tag(tag_id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS user_blog (
	user_id INT NOT NULL AUTO_INCREMENT,
	email VARCHAR(20) NOT NULL,
	username VARCHAR (20) NOT NULL,
	avatar VARCHAR(100),
	website VARCHAR(30),

	CONSTRAINT user_blog_pk PRIMARY KEY(user_id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS comment_blog (
	comment_id INT NOT NULL AUTO_INCREMENT,
	comment_blog VARCHAR(400) NOT NULL,
	comment_date DATETIME NOT NULL,
	fk_user_id INT NOT NULL,
  fk_post_id INT NOT NULL,

	CONSTRAINT comment_blog_pk PRIMARY KEY(comment_id),
	CONSTRAINT comment_blog_fk_user FOREIGN KEY(fk_user_id) REFERENCES user_blog(user_id),
  	CONSTRAINT comment_blog_post FOREIGN KEY(fk_post_id) REFERENCES post(post_id)
)ENGINE = InnoDB;

CREATE UNIQUE INDEX post_index_date ON post(post_date);