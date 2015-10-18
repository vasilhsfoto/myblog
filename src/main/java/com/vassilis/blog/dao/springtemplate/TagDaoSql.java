package com.vassilis.blog.dao.springtemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.vassilis.blog.dao.TagDao;
import com.vassilis.blog.entities.Tag;

@Repository
public class TagDaoSql implements TagDao {
	private static final String TAGS_PER_POST = "SELECT tag.tag_name "
			+ "FROM tag INNER JOIN article_tag ON tag.id=article_tag.tag_id"
			+ " INNER JOIN article ON article.id = article_tag.article_id"
			+ " WHERE article.id = ?";

	private static final String ALL_TAGS = "SELECT tag_name FROM tag";
	
	@Autowired
	private JdbcOperations jdbcTemplate;
	
	private static final class TagRowMapper implements RowMapper<Tag> {
		
		public Tag mapRow(ResultSet rs, int rowNum) throws SQLException {
			Tag tag = new Tag();
			tag.setTagName(rs.getString("tag_name"));
			return tag;
		}
	}
	
	public List<Tag> getTagPerPost(int postId) {
		return jdbcTemplate.query(TAGS_PER_POST, new Integer[]{postId},new TagRowMapper());
	}
	
	public List<Tag> getAllTags() {
		return jdbcTemplate.query(ALL_TAGS, new TagRowMapper());
	}
}
