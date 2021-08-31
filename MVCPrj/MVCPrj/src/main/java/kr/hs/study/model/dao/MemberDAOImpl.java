package kr.hs.study.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.model.dto.memberDTO;
import kr.hs.study.service.MemberService;

@Repository
public class MemberDAOImpl implements MemberService {
	
	@Autowired
	SqlSessionTemplate sqlsessiontemplate;

	public List<memberDTO> list() {
		// TODO Auto-generated method stub
		return sqlsessiontemplate.selectList("member.list");
	}

	public void insert(memberDTO dto) {
		// TODO Auto-generated method stub

	}

	public memberDTO read(String userid) {
		// TODO Auto-generated method stub
		return sqlsessiontemplate.selectOne("member.read", userid);
	}
	
	public void join(memberDTO dto) {
		sqlsessiontemplate.insert("member.insert", dto);
	}

	public boolean check(String userid, String password) {
		// TODO Auto-generated method stub
		boolean result = false;
		Map<String, String> map = new HashMap<String, String>();
		map.put("userid", userid);
		map.put("password", password);
		
		int ch = sqlsessiontemplate.selectOne("member.check", map);
		System.out.println("ch " + ch);
		if(ch == 1) {
			result = true;
		}
		
		return result;
	}

	public void update(memberDTO dto, String userid) {
		// TODO Auto-generated method stub
		sqlsessiontemplate.update("member.update", dto);
	}

}
