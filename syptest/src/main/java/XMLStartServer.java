import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLStartServer {
	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Demo demo = (Demo)context.getBean("demo");
		System.out.println(demo.getName());

	}
}
