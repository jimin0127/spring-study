package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.model.dao.MemberDAOImpl;
import kr.hs.study.model.dto.memberDTO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDAOImpl dao;
	

	public List<memberDTO> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}

	public void insert(memberDTO dto) {
		// TODO Auto-generated method stub

	}

	public memberDTO read(String userid) {
		// TODO Auto-generated method stub
		return dao.read(userid);
	}
	
	public void join(memberDTO dto) {
		dao.join(dto);
	}

	public boolean check(String userid, String password) {
		// TODO Auto-generated method stub
		return dao.check(userid, password);

	}

	public void update(memberDTO dto, String userid) {
		// TODO Auto-generated method stub
		dao.update(dto, userid);
	}

}
