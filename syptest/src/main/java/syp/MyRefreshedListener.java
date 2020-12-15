package syp;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by shiyuping on 2020/12/15 9:51 下午
 */
@Component
public class MyRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("MyRefreshedListener#onApplicationEvent 上下文刷新完毕事件");
	}
}
