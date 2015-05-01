package com.vassilis.blog.entities;

import java.util.ArrayList;
import java.util.List;

public class Tag {
	private int tag_id;
	private String tag;
	
	private List<Post> postList = new ArrayList<Post>();
	
	public int getTag_id() {
		return tag_id;
	}
	public void setTag_id(int tag_id) {
		this.tag_id = tag_id;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
}
