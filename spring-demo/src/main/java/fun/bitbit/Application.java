package fun.bitbit;

import fun.bitbit.aware.MyApplicationContextAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("fun.bitbit")
//@ImportResource("classpath:application.xml")
@EnableAspectJAutoProxy(proxyTargetClass = true) // 开启aop,会添加一个BeanPostProcessor-AnnotationAwareAspectJAutoProxyCreator创建代理
public class Application {
	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "cglib");
		System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		// 该构造方法，相当先后于执行了
		// 1、无参构造方法
		// 2、register(Class<?>... annotatedClasses)
		// 3、refresh
//		AnnotationConfigApplicationContext context0 = new AnnotationConfigApplicationContext(Application.class);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Application.class); // 注册Application.class，只是将class维护到DefaultListableBeanFactory.beanDefinitionMap和beanDefinitionNames
		context.addBeanFactoryPostProcessor(configurableListableBeanFactory -> logger.info("手动add的BeanFactoryPostProcessor"));
		context.refresh();

		TextEditor editor = context.getBean(TextEditor.class);
		editor.inputText("hello");

		MyApplicationContextAware myApplicationContextAware = context.getBean(MyApplicationContextAware.class);
		myApplicationContextAware.get();

		context.close();
		logger.info("close application");
	}
}
