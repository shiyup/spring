package syp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * created by shiyuping on 2020/3/1
 */
@ComponentScan("syp") //标记需要扫描的包
public class AnnotationStartServer {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationStartServer.class);
		Demo demo = (Demo)context.getBean("demo");
		System.out.println(demo.getName());

	}
}
