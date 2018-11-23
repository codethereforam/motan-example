package priv.thinkam.motan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import priv.thinkam.motan.service.FooService;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:motan_client.xml");
		FooService service = (FooService) ctx.getBean("remoteService");
		System.out.println(service.hello("motan"));
	}
}
