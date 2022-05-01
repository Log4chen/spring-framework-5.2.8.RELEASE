package fun.bitbit;

import fun.bitbit.aware.MyApplicationContextAware;
import fun.bitbit.service.Car;
import fun.bitbit.service.impl.TextEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("fun.bitbit")
//@ImportResource("classpath:application.xml")
//@EnableAspectJAutoProxy(proxyTargetClass = true)
// 开启aop,会添加一个BeanPostProcessor-AnnotationAwareAspectJAutoProxyCreator创建代理
	@PropertySource("classpath:values.properties")
public class MyApplication {
	private static final Logger logger = LoggerFactory.getLogger(MyApplication.class);

	public static void main(String[] args) {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "cglib");
		System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		// 该构造方法，相当先后于执行了
		// 1、无参构造方法
		// 2、register(Class<?>... annotatedClasses)
		// 3、refresh
//		AnnotationConfigApplicationContext context0 = new AnnotationConfigApplicationContext(Application.class);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MyApplication.class); // 注册MyApplication.class，只是将class维护到DefaultListableBeanFactory.beanDefinitionMap和beanDefinitionNames
		context.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		// refresh后才active，否则调用getBean会抛异常
		context.refresh();

		TextEditor editor = context.getBean(TextEditor.class);
		editor.inputText("hello");
		editor.printMyString();

		MyApplicationContextAware myApplicationContextAware = context.getBean(MyApplicationContextAware.class);
		myApplicationContextAware.get();

//		XxxAwareImpl xxxAwareImpl = context.getBean(XxxAwareImpl.class);
//		logger.info("xxxAwareImpl:" + xxxAwareImpl);

		Car car = context.getBean(Car.class);
		context.close();
		logger.info("close application");
	}
}
