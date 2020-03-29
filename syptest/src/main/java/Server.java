import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * created by shiyuping on 2020/3/1
 */
public class Server {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Demo demo = (Demo)context.getBean("demo");
		System.out.println(demo.getName());

	}
}
