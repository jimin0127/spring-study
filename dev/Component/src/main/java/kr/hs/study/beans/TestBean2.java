package kr.hs.study.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component ////type으로 등록한다. xml 파일로 할때
@ComponentScan(basePackages="kr.hs.study.beans") //JavaConfig로 할떄
public class TestBean2 {
	
}
