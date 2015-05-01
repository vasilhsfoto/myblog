package com.vassilis.blog.dao;

import java.util.List;

import com.vassilis.blog.entities.Tag;

public interface TagDao {
	List<Tag> getAllTags();
	List<Tag> getTagPerPost(int postId);
}
