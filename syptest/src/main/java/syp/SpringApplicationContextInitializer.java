package syp;

import syp.myBeanPostProcessor.MyBeanDefinitionRegistryPostProcessor;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
/**如果要测试
 * 需要将这个测试类作为初始化参数 contextInitializerClasses配置到 web.xml 中
 */
public class SpringApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		MyBeanDefinitionRegistryPostProcessor myBeanDefinitionRegistryPostProcessor = new MyBeanDefinitionRegistryPostProcessor();
		// 将自定义的firstBeanDefinitionRegistryPostProcessor添加到应用上下文中
		applicationContext.addBeanFactoryPostProcessor(myBeanDefinitionRegistryPostProcessor);
		// ...自定义操作
		System.out.println("SpringApplicationContextInitializer#initialize");
	}
}
