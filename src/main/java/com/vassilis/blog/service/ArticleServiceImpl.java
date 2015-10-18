package com.vassilis.blog.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.text.StrSubstitutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vassilis.blog.dao.ArticleDao;
import com.vassilis.blog.dao.TagDao;
import com.vassilis.blog.entities.Article;

@Service("postService")
public class ArticleServiceImpl implements ArticleService {
	private final static String NUM_OF_COMMENTS = "NUM_OF_COMMENTS";

	@Autowired
	private ArticleDao postDao;

	@Autowired
	private TagDao tagDao;

	public List<Article> getAllArticles() {
		List<Article> posts = postDao.getArticles();

		for(Article post : posts) {
			post.setArticleHtml(replaceArticlePlaceholders(post));
			post.setTagList(tagDao.getTagPerPost(post.getId()));
		}
		return posts;
	}

	protected String replaceArticlePlaceholders(final Article article) {
		Map<String, Integer> articleToNumOfComments = new HashMap<String, Integer>();
		articleToNumOfComments.put(NUM_OF_COMMENTS, article.getNumOfPosts());

		StrSubstitutor substitutor = new StrSubstitutor(articleToNumOfComments);

		return substitutor.replace(article.getArticleHtml());
	}
}
