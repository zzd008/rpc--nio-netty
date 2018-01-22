package cn.jxust_04_springannotation.springrunorder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
    	/*
    	 * Spring作用（IOC：反射构建对象，AOP：动态代理）
    	 * 其中ios就是根据配置文件，通过反射来new对象
    	 */
        new ClassPathXmlApplicationContext("spring.xml");//加载spring容器，并传入一个xml文件 在web中有tomcat来加载spring
    }
}
