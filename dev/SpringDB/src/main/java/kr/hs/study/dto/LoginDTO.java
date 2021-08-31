package kr.hs.study.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LoginDTO {
	private String userid;
	private int userpass;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getUserpass() {
		return userpass;
	}
	public void setUserpass(int userpass) {
		this.userpass = userpass;
	}


}
