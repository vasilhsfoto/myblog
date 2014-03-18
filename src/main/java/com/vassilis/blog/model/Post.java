package com.vassilis.blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private int post_id;
	private String article;
	private Date postDate;
	
	List<Tag> tagList = new ArrayList<Tag>();
	List<Comment> commentList = new ArrayList<Comment>(); 
	
	public List<Tag> getTagList() {
		return tagList;
	}
	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public List<Comment> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
}
