package cn.jxust_04_springannotation.userdefinedannotation.service.impl;

import org.springframework.stereotype.Component;

import cn.jxust_04_springannotation.userdefinedannotation.annotation.RpcService;
import cn.jxust_04_springannotation.userdefinedannotation.service.HelloService;

//@RpcService(value = "1")
@RpcService("HelloServicebb")
public class HelloServiceImpl implements HelloService {
    public String hello(String name) {
        return "Hello! " + name;
    }
    
    public void test(){
    	System.out.println("test");
    }
    /*public HelloServiceImpl(){ spring启动时会被实例化 因为@RpcService注解定义中包含@Component
    	System.out.println(1111111111);
    }*/
}
