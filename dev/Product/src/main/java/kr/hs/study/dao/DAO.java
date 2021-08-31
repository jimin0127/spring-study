package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.DTO;

@Component
public class DAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private MapperClass MapperClass;
	
	// 추가 
	public void insert_data(DTO dto) {
		String sql = "insert into product values(?, ?, ?, ?)";
		int product_id = (int)(Math.random()*100000);
		
		jdbcTemplate.update(sql, product_id, dto.getProduct_name(), dto.getProduct_price(), dto.getProduct_stock());
	}
	// 수정
	public void update_data(DTO dto) {
		String sql = "UPDATE product SET product_price = ?, product_stock=? where product_name = ?";
		jdbcTemplate.update(sql, dto.getProduct_price(), dto.getProduct_stock(), dto.getProduct_name());
	}
	
	//삭제
	public void delete_data(DTO dto) {
		String sql = "DELETE FROM product WHERE product_id = ?";
		jdbcTemplate.update(sql, dto.getProduct_id());
	}
	
	// 가져오기
	public List<DTO> select_data() {
		String sql = "select * from product";
		List<DTO> list = jdbcTemplate.query(sql, MapperClass);
		
		return list;
	}
	
	public void buy_product(int id) {
		String sql = "SELECT * from product where product_id = ?";
		List<DTO> list= jdbcTemplate.query(sql, MapperClass);
		for(DTO d : list) {
			System.out.println("상품코드\t 상품명\t 상품 가격\t 상품 재고");
			System.out.print(d.getProduct_id());
			System.out.print("\t" + d.getProduct_name());
			System.out.print("\t" + d.getProduct_price());
			System.out.println("\t" + d.getProduct_stock());
		}
		String sql2 = "UPDATE product SET "+ (list.get(0).getProduct_stock()-1) + " WHERE product_id = ?";
		jdbcTemplate.update(sql, id);
	}

}
