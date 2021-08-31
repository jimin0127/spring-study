package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.LoginDAO;
import kr.hs.study.dto.LoginDTO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		LoginDTO dto = ctx.getBean("dto", LoginDTO.class);
		LoginDAO dao = ctx.getBean("dao", LoginDAO.class);

		dto.setUserid("lee");
		dto.setUserpass(1111);
		
		LoginDTO bean3 = ctx.getBean("dto", LoginDTO.class);
		bean3.setUserid("park");
		bean3.setUserpass(1111);
		dao.insert_data(bean3);
		System.out.println("삽입완료");
		
		LoginDTO bean2 = ctx.getBean(LoginDTO.class);
		bean2.setUserid("냐");
		bean2.setUserpass(2222);
		dao.update_data(bean2);
		System.out.println("수정완료");
		
		LoginDTO bean4 = ctx.getBean(LoginDTO.class);
		bean4.setUserid("kim");
		dao.delete_data(bean4);
		System.out.println("삭제완료");
		
		List<LoginDTO> list = dao.select_data();
		for(LoginDTO d : list) {
			System.out.println(d.getUserid());
			System.out.println(d.getUserpass());
		}
		
	}

}
