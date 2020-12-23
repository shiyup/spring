package syp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class InitializationOrder implements InitializingBean, DisposableBean {

    // 基于 @PostConstruct 注解
    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct  初始化中...");
    }

    public void doInit() {
        System.out.println("自定义初始化方法 initUser() 初始化中...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean#afterPropertiesSet() 初始化中...");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy 销毁中...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean#destroy() 销毁中...");
    }

    public void doDestroy() {
        System.out.println("自定义销毁方法 doDestroy() 销毁中...");
    }
}
