package com.vassilis.blog.dao;

import java.util.List;

import com.vassilis.blog.entities.Post;
import com.vassilis.blog.entities.Tag;

public interface PostDao {
	
	List<Post> getPostsByDate();
	Post getPostById(int postId);
	void insertPost(String article, List<Tag> tags);
	void deletePost(int postId);
	void updatePostArticle(int postId, String article, List<Tag> tags);
	
	List<Post> getPosts();
}