package cn.jxust_04_springannotation.userdefinedannotation.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.jxust_04_springannotation.userdefinedannotation.service.HelloService;

//spring要用main去启动，但是spring提供了支持junit启动的方式
@RunWith(SpringJUnit4ClassRunner.class)//指定启动器
@ContextConfiguration(locations = "classpath:spring2.xml")//加载配置文件
@Component
public class MyServer3 {
	@Autowired
	HelloService helloService;//spring启动时会实例化一个HelloServiceImpl对象，这时会根据接口来匹配，会把HelloServiceImpl注入给HelloService

	@Test
	public void helloTest1() {
		System.out.println("开始junit测试……");
		String hello = helloService.hello("ooooooo");
		System.out.println(hello);
	}

}
