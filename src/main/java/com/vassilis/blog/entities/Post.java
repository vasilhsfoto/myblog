package com.vassilis.blog.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Post {
	private int post_id;
	private String article;
	private Date postDate;
	private String title;
	private String picture;
	private int numOfPosts; 
	
	private List<Tag> tagList = new ArrayList<Tag>();
	private List<Comment> commentList = new ArrayList<Comment>();
	
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("article", article)
										.append("postDate", postDate).toString();
	}
	
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getNumOfPosts() {
		return numOfPosts;
	}

	public void setNumOfPosts(int numOfPosts) {
		this.numOfPosts = numOfPosts;
	}
}
