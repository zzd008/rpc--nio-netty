package cn.jxust_04_springannotation.springrunorder;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

public class One implements ApplicationContextAware ,InitializingBean {
	public One(String one) {
		System.out.println(one);
	}

	@Override //ApplicationContext程序的上下文
	public void setApplicationContext(ApplicationContext arg0)//当服务端构造该类时，会调用ApplicationContextAware中的该方法，可以在这里设置一些初始参数及属性
			throws BeansException {
			System.out.println("setApplicationContext");
	}

	@Override
	public void afterPropertiesSet() throws Exception {//调完setApplicationContext后会调用该方法
		System.out.println("afterPropertiesSet");
	}
}
