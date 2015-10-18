package com.vassilis.blog.dao.springtemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.vassilis.blog.dao.ArticleDao;
import com.vassilis.blog.entities.Article;
import com.vassilis.blog.entities.Tag;

@Repository
public class ArticleDaoSql implements ArticleDao {
	private final static String SELECT_TOP_ARTICLES = "select article_html, author, title, post_date, picture, num_of_comments from article limit ?";

	@Value(value="${blog.numOfPostPerPage}")
	private int numOfPostsPerPage;

	@Autowired
	private JdbcOperations jdbcTemplate;

	private static final class PostRowMapper implements RowMapper<Article> {

		public Article mapRow(ResultSet rs, int rowNum) throws SQLException {
			Article  post = new Article();
			post.setArticleHtml(rs.getString("article_html"));
			post.setTitle(rs.getString("title"));
			post.setPicture(rs.getString("picture"));
			post.setPostDate(rs.getDate("post_date"));
			post.setNumOfPosts(rs.getInt("num_of_comments"));
			post.setAuthor(rs.getString("author"));
			return post;
		}
	}

	public List<Article> getArticles() {
		return jdbcTemplate.query(SELECT_TOP_ARTICLES, new Integer[]{numOfPostsPerPage}, new PostRowMapper());
	}

	public List<Article> getPostsByDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public Article getPostById(int postId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertPost(String article, List<Tag> tags) {
		// TODO Auto-generated method stub

	}

	public void deletePost(int postId) {
		// TODO Auto-generated method stub

	}

	public void updatePostArticle(int postId, String article, List<Tag> tags) {
		// TODO Auto-generated method stub
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setNumOfPostsPerPage(int numOfPostsPerPage) {
		this.numOfPostsPerPage = numOfPostsPerPage;
	}
}
