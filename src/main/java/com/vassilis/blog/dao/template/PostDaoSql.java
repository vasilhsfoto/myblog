package com.vassilis.blog.dao.template;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.vassilis.blog.dao.PostDao;
import com.vassilis.blog.entities.Post;
import com.vassilis.blog.entities.Tag;

@Repository
public class PostDaoSql implements PostDao {
	private final static String SELECT_TOP_ARTICLES = "select article, title, post_date, picture, num_of_comments from post limit ?";	
	
	@Value(value="${blog.numOfPostPerPage}")
	private int numOfPostsPerPage;
	
	@Autowired
	private JdbcOperations jdbcTemplate;

	private static final class PostRowMapper implements RowMapper<Post> {
		@Override
		public Post mapRow(ResultSet rs, int rowNum) throws SQLException {
			Post  post = new Post();
			post.setArticle(rs.getString("article"));
			post.setTitle(rs.getString("title"));
			post.setPicture(rs.getString("picture"));
			post.setPostDate(rs.getDate("post_date"));
			post.setNumOfPosts(rs.getInt("num_of_posts"));
			
			return post;
		}
	}
	
	@Override
	public List<Post> getPosts() {
		return jdbcTemplate.query(SELECT_TOP_ARTICLES, new Integer[]{numOfPostsPerPage}, new PostRowMapper());
	}
	
	@Override
	public List<Post> getPostsByDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post getPostById(int postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertPost(String article, List<Tag> tags) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePost(int postId) {
		// TODO Auto-generated method stub

	}

	@Override
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
