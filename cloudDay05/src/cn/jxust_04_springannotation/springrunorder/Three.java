package cn.jxust_04_springannotation.springrunorder;

import org.springframework.stereotype.Component;

//注解
@Component
public class Three {
	public Three() {
		System.out.println("three");
	}
	public Three(String three) {
		System.out.println(three);
	}
}
