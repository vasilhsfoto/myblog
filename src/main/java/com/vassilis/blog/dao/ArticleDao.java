package com.vassilis.blog.dao;

import java.util.List;

import com.vassilis.blog.entities.Article;
import com.vassilis.blog.entities.Tag;

public interface ArticleDao {
	
	List<Article> getPostsByDate();
	Article getPostById(int postId);
	void insertPost(String article, List<Tag> tags);
	void deletePost(int postId);
	void updatePostArticle(int postId, String article, List<Tag> tags);
	
	List<Article> getArticles();
}