package com.vassilis.blog.service;

import java.util.List;

import com.vassilis.blog.entities.Post;

public interface PostService {
	List<Post> getAllPostsWithTags();
}
