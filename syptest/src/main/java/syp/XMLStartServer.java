package syp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import syp.Demo;

public class XMLStartServer {
	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Demo demo = (Demo)context.getBean("demo");
		System.out.println(demo.getName());


		//System.out.println(context.getBean("a"));
		//触发容器销毁
		context.close();

	}
}
