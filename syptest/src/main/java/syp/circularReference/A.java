package syp.circularReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by shiyuping on 2020/12/14 9:58 下午
 */
@Component
public class A {

	@Autowired
	private B b;

	private C c;

	@Autowired
	public A(C c){
		this.c = c;
	}
}
