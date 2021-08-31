package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.DTO;
@Component
@Scope("prototype")
public class MapperClass implements RowMapper<DTO>{

	public DTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		DTO bean = new DTO();
		bean.setProduct_id(rs.getInt("product_id"));
		bean.setProduct_name(rs.getString("product_name"));
		bean.setProduct_price(rs.getInt("product_price"));
		bean.setProduct_stock(rs.getInt("product_stock"));
		
		return bean;
	}

}


