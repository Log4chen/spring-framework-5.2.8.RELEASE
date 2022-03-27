package fun.bitbit.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 * Date: 2022/3/26 16:19
 */
@Configuration
@ComponentScan(basePackages = "fun.bitbit.scope")
public class ScopeApplication {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new AnnotationConfigApplicationContext(ScopeApplication.class);
			// singleton 多次get返回同一个实例 true
			System.out.println(context.getBean(SingletonBean.class) == context.getBean(SingletonBean.class));
			// prototype 多个get返回不同的实例 false
			System.out.println(context.getBean(PrototypeBean.class) == context.getBean(PrototypeBean.class));

			SingletonBean singletonBean = context.getBean(SingletonBean.class);
			singletonBean.doSomething();
			singletonBean.doSomething();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
