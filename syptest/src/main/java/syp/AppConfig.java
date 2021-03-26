package syp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean("demo" )
	public Demo getDemo(){
		return new Demo();
	}
}
