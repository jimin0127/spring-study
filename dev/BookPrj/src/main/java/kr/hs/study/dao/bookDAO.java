package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.bookDTO;

@Component
public class bookDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private MapperClass mapper;
	
	// 추가 
		public void insert_data(bookDTO dto) {
			String sql = "insert into book values(?, ?, ?, ?)";
			
			jdbcTemplate.update(sql, dto.getTitle(), dto.getAuthor(), dto.getPrice(), dto.getEamil());
		}
		// 수정
		public void update_data(bookDTO dto) {
			String sql = "UPDATE book SET author=? where title = ?";
			jdbcTemplate.update(sql, dto.getAuthor(), dto.getTitle());
		}
		
		//삭제
		public void delete_data(bookDTO dto) {
			String sql = "DELETE FROM book WHERE title= ?";
			jdbcTemplate.update(sql, dto.getTitle());
		}
		
		// 가져오기
		public List<bookDTO> select_data() {
			String sql = "select * from book";
			List<bookDTO> list = jdbcTemplate.query(sql, mapper);
			
			return list;
		}

}
