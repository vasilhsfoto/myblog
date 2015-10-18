package com.vassilis.blog.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Article {
	private int id;
	private String author;
	private String articleHtml;
	private String articleMarkup;
	private Date postDate;
	private String title;
	private String picture;
	private int numOfPosts;

	private List<Tag> tagList = new ArrayList<Tag>();
	private List<Comment> commentList = new ArrayList<Comment>();

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("article", articleHtml)
										.append("postDate", postDate).toString();
	}

	public List<Tag> getTagList() {
		return tagList;
	}
	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArticleHtml() {
		return articleHtml;
	}
	public void setArticleHtml(String article) {
		this.articleHtml = article;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getArticleMarkup() {
		return articleMarkup;
	}

	public void setArticleMarkup(String articleMarkup) {
		this.articleMarkup = articleMarkup;
	}
}
