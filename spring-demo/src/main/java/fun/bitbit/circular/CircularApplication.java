package fun.bitbit.circular;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 * Date: 2022/1/11 23:59
 */
@Configuration
@ComponentScan("fun.bitbit.circular")
public class CircularApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CircularApplication.class);
//		Chicken chicken = context.getBean(Chicken.class);
//		chicken.lay();
		LazyBean lazyBean = context.getBean(LazyBean.class);

		context.close();
	}
}
