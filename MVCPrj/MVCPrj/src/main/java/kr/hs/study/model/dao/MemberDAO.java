package kr.hs.study.model.dao;

import java.util.List;

import kr.hs.study.model.dto.memberDTO;

public interface MemberDAO {
	public List<memberDTO> list(); //select
	public void insert(memberDTO dto); //insert
	public memberDTO read(String userid); // select where userid= 
	public void join(memberDTO dto);
	public boolean check(String userid, String password);
	public void update(memberDTO dto, String userid);
}
