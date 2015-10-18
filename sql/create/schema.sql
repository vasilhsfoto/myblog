CREATE DATABASE IF NOT EXISTS blog;

USE blog;

CREATE TABLE IF NOT EXISTS article (
	id INT NOT NULL AUTO_INCREMENT,
	article_html TEXT NOT NULL,
	article_markup TEXT,
	title VARCHAR(40) NOT NULL,
	post_date DATETIME DEFAULT current_timestamp(),
	picture VARCHAR(60) NOT NULL,
	num_of_comments INT DEFAULT 0,
	author VARCHAR(60) NOT NULL,
	CONSTRAINT article_pk PRIMARY KEY(id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS tag (
	id INT NOT NULL AUTO_INCREMENT,
	tag_name VARCHAR(20) NOT NULL UNIQUE,

	CONSTRAINT tag_pk PRIMARY KEY(id)
)ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS article_tag (
	article_id INT NOT NULL AUTO_INCREMENT,
	tag_id INT NOT NULL,

	CONSTRAINT article_tag_pk PRIMARY KEY(article_id, tag_id),
	CONSTRAINT article_tag_article_fk FOREIGN KEY (article_id) REFERENCES article(id),
	CONSTRAINT article_tag_tag_fk FOREIGN KEY (tag_id) REFERENCES tag(id)
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
	comment_date DATETIME DEFAULT current_timestamp(),
	fk_user_id INT NOT NULL,
  	fk_article_id INT NOT NULL,

	CONSTRAINT comment_blog_pk PRIMARY KEY(comment_id),
	CONSTRAINT comment_blog_fk_user FOREIGN KEY(fk_user_id) REFERENCES user_blog(user_id),
  	CONSTRAINT comment_blog_post FOREIGN KEY(fk_article_id) REFERENCES article(id)
)ENGINE = InnoDB;

/*--CREATE TABLE IF NOT EXISTS video (
--	id INT NOT NULL AUTO_INCREMENT,
--	link VARCHAR(30) NOT NULL,
--
--	CONSTRAINT video_pk PRIMARY KEY(id)
--)ENGINE = InnoDB;
--
--CREATE TABLE IF NOT EXISTS country (
--	country_name VARCHAR(30) NOT NULL UNIQUE,
--
--	CONSTRAINT country_pk PRIMARY KEY(country_name)
--)ENGINE = InnoDB;
--
--CREATE TABLE IF NOT EXISTS country_video (
--	fk_country_name VARCHAR(30) NOT NULL,
--	fk_video_id INT NOT NULL,
--	numOfViews INT,
--
--	CONSTRAINT country_video_fk_country_name FOREIGN KEY(fk_country_name) REFERENCES country(country_name),
--	CONSTRAINT country_video_fk_video_id FOREIGN KEY(fk_video_id) REFERENCES video(id),
--	CONSTRAINT country_video_pk PRIMARY KEY(fk_country_name, fk_video_id)
--)ENGINE = InnoDB;

--CREATE UNIQUE INDEX post_index_date ON post(post_date);
*/