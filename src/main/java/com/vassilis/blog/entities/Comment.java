package com.vassilis.blog.entities;

import java.util.Date;

public class Comment {
	private String comment;
	private Date commentDate;
	private User user;
	private Article post;
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Article getPost() {
		return post;
	}
	public void setPost(Article post) {
		this.post = post;
	}
}
