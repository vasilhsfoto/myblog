package com.vassilis.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vassilis.blog.dao.TagDao;
import com.vassilis.blog.entities.Tag;

@Service
public class TagServiceImpl implements TagService {
	@Autowired
	private TagDao tagDao;
	
	public List<Tag> getAllTags() {
		return tagDao.getAllTags();
	}
}
