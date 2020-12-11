import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * Created by shiyuping on 2020/12/7 10:21 下午
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {

	@Override
	public int getOrder() {
		return 0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor#postProcessBeforeInitialization");
		if (bean instanceof Demo) {
			System.out.println(beanName);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor#postProcessBeforeInitialization");
		if (bean instanceof Demo) {
			System.out.println(beanName);
		}
		return bean;
	}
}
