package syp.circularReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by shiyuping on 2020/12/14 9:59 下午
 */
@Component
public class B {
	@Autowired
	private A a;
}