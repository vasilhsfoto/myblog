package com.vassilis.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vassilis.blog.dao.PostDao;
import com.vassilis.blog.dao.TagDao;
import com.vassilis.blog.entities.Post;

@Service("postService")
public class PostServiceImpl implements PostService {	
	
	@Autowired
	private PostDao postDao;
	
	@Autowired
	private TagDao tagDao;
	
	public List<Post> getAllPostsWithTags() {
		List<Post> posts = postDao.getPosts();
		for(Post post : posts) {
			post.setTagList(tagDao.getTagPerPost(post.getPost_id()));
		}
		return posts;
	}
}
