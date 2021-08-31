package kr.hs.study.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.dao.DAO;
import kr.hs.study.dto.DTO;


public class MainClass {

	public static void main(String args[]) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		DAO dao = ctx.getBean("DAO", DAO.class);
		product pro = new product();
		
		System.out.println("선택하세요");
		System.out.println("1. 삽입");
		System.out.println("2. 삭제");
		System.out.println("3. 수정");
		System.out.println("4. 보기");
		System.out.println("5. 상품 구매");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		switch(num) {
		case 1:
			pro.insert(ctx, dao);
			break;
		case 2:
			pro.delete(ctx, dao);
		case 4:
			pro.select(ctx, dao);
		case 5: 
			pro.buy(ctx, dao);
		
		}
		
	}
	


}
class product {
	void insert(ClassPathXmlApplicationContext ctx, DAO dao) {
		DTO dto = ctx.getBean("DTO", DTO.class);

		Scanner scan = new Scanner(System.in);
		System.out.print("상품명 : ");
		String name = scan.next();
		System.out.print("상품 가격 : ");
		int price = scan.nextInt();
		System.out.print("상품 재고: ");
		int stock = scan.nextInt();
		
		
		dto.setProduct_name(name);
		dto.setProduct_price(price);
		dto.setProduct_stock(stock);
		dao.insert_data(dto);
		System.out.println("삽입 완료");
		
	}
	
	void select(ClassPathXmlApplicationContext ctx, DAO dao) {
		List<DTO> list = dao.select_data();
		for(DTO d : list) {
			System.out.println("상품코드\t 상품명\t 상품 가격\t 상품 재고");
			System.out.print(d.getProduct_id());
			System.out.print("\t" + d.getProduct_name());
			System.out.print("\t" + d.getProduct_price());
			System.out.println("\t" + d.getProduct_stock());
		}
		
	}
	
	void delete(ClassPathXmlApplicationContext ctx, DAO dao) {
		System.out.println("삭제할 상품의 id를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		DTO dto = new DTO();
		dto.setProduct_id(id);
		
		dao.delete_data(dto);
	}
	void buy(ClassPathXmlApplicationContext ctx, DAO dao) {
		System.out.print("구매할 상품의 id를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		dao.buy_product(id);
		System.out.println("사기 완료");
		
	}
}
