import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class TestAwareBean implements InstantiationAwareBeanPostProcessor {
	/**
	 * 顺序1，在bean实例化前被调用
	 * @param beanClass 对应bean的类型
	 * @param beanName 对应bean的名称
	 * @return 如果返回null则继续进行实例化bean；如果返回对应bean，则不继续实例化bean，而直接将返回的bean放入到容器中
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		return null;
	}

	/**
	 * 顺序2，在bean实例化后被调用，判断bean是否需要被自动注入属性
	 * @param bean 对应的bean
	 * @param beanName 对应的bean的名称
	 * @return 如果返回true则允许自动注入属性到该bean中；如果返回false，则跳过该bean的属性注入
	 * @throws BeansException
	 */
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		return false;
	}

	/**
	 * 顺序3，给对应的bean初始化（设置属性），将PropertyValues中的值设置到bean中
	 * @param pvs 需要设置的参数
	 * @param bean 要初始化的bean
	 * @param beanName bean的名称
	 * @return 返回给bean初始化用的参数配置；如果返回null，则使用已经存在的参数
	 * @throws BeansException
	 */
	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		return null;
	}

	/**
	 * populateBean->initializeBean->invokeAwareMethods->applyBeanPostProcessorsBeforeInitialization
	 * 顺序4，在bean初始化（设置属性）完成后(populateBean之后invokeInitMethods之前)的before回调
	 * @param bean 设置完属性后的bean
	 * @param beanName bean的名称
	 * @return 返回对应bean实例；如果返回null，则不会执行后续的BeanPostProcessors
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

	/**
	 * 顺序5，在bean初始化（设置属性）完成后(invokeInitMethods之后)的after回调
	 * @param bean 设置完属性后的bean
	 * @param beanName bean的名称
	 * @return 返回对应的bean实例；如果返回null，则不会执行后续的BeanPostProcessors
	 * @throws BeansException
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}
