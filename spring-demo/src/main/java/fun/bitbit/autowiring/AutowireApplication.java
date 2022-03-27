package fun.bitbit.autowiring;

import fun.bitbit.component.XxxAwareImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * autowiring 自动装配
 * The Spring container can autowire relationships between collaborating beans.
 * 在xml配置文件中指定 autowire方式：byName、byType、constructor
 */
public class AutowireApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-autowire.xml");
		AutowireByType autowireByType = context.getBean(AutowireByType.class);
		autowireByType.sayHello("autowireByType");

		AutowireByName autowireByName = context.getBean(AutowireByName.class);
		autowireByName.sayHello("autowireByName");

		AutowireByConstructor autowireByConstructor = context.getBean(AutowireByConstructor.class);
		autowireByConstructor.sayHello("autowireByConstructor");

		AutowireXxxAware autowireXxxAware = context.getBean(AutowireXxxAware.class);
		autowireXxxAware.printContext();
		autowireXxxAware.printIgnoreType();

		context.close();
	}
}
