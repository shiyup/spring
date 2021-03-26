package syp.circularReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by shiyuping on 2020/12/14 10:00 下午
 */
//@Component
public class C {

	private A a;

	/*public C(){}

	@Autowired
	public C( A a){
		this.a = a;
	}*/
}
