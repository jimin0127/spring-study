package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.bookDAO;
import kr.hs.study.dto.bookDTO;

public class MainClass {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		bookDAO dao = ctx.getBean("dao", bookDAO.class);
		bookDTO dto1 = ctx.getBean("dto", bookDTO.class);
		dto1.setTitle("안녕");
		dto1.setAuthor("이지민");
		dto1.setPrice(50000);
		dto1.setEamil("ckdghae341@fa");
		dao.insert_data(dto1);
	}

}
