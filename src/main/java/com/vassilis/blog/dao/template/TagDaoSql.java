package com.vassilis.blog.dao.template;

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
	private static final String TAGS_PER_POST = "SELECT tag.tag_name FROM tag INNER JOIN post_tag ON tag.id=post_tag.fk_tag_id" +
											    " INNER JOIN post ON post.id = post_tag.fk_post_id" +
											    " WHERE post.id = ?";
	private static final String ALL_TAGS = "SELECT tag_name FROM tag";
	
	@Autowired
	private JdbcOperations jdbcTemplate;
	
	private static final class TagRowMapper implements RowMapper<Tag> {
		@Override
		public Tag mapRow(ResultSet rs, int rowNum) throws SQLException {
			Tag tag = new Tag();
			tag.setTag(rs.getString("tag_name"));
			return tag;
		}
	}
	
	@Override
	public List<Tag> getTagPerPost(int postId) {
		return jdbcTemplate.query(TAGS_PER_POST, new Integer[]{postId},new TagRowMapper());
	}
	
	@Override
	public List<Tag> getAllTags() {
		return jdbcTemplate.query(ALL_TAGS, new TagRowMapper());
	}
}
