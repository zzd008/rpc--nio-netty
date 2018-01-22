package cn.jxust_04_springannotation.userdefinedannotation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.stereotype.Component;

/*
 * 通过自定义注解，让spring加载时根据注解来获取要变成服务的一些接口实现类，提供给客户端远程访问
 */
@Target({ ElementType.TYPE })//注解用在接口上
@Retention(RetentionPolicy.RUNTIME)//VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息
@Component //spring加载 这里加了这个@Component注解，那么加了RpcService注解的类也会有@Target、@Retention、@Component这三个属性
public @interface RpcService {

	String value();//获取注解中的参数
}
