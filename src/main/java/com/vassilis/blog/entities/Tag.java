package com.vassilis.blog.entities;

import java.util.ArrayList;
import java.util.List;

public class Tag {
	private int id;
	private String tagName;
	
	private List<Article> postList = new ArrayList<Article>();
	
	public int getId() {
		return id;
	}
	public void setId(int tag_id) {
		this.id = tag_id;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tag) {
		this.tagName = tag;
	}
}
