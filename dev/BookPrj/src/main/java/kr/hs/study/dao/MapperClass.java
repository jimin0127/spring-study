package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.bookDTO;

@Component
public class MapperClass implements RowMapper<bookDTO> {

	public bookDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		bookDTO book = new bookDTO();
		book.setTitle(rs.getString("title"));
		book.setAuthor(rs.getString("author"));
		book.setPrice(rs.getInt("price"));
		book.setEamil(rs.getString("email"));
		
		return book;
	}

}
