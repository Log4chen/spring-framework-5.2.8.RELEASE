package fun.bitbit.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Description:
 * Date: 2022/3/26 18:25
 */
public class AutowireXxxAware implements ApplicationContextAware {
	public ApplicationContext applicationContext;
	public IgnoreDepTypeService ignoreDepTypeService;

	public AutowireXxxAware() {
		System.out.println("AutowireXxxAware 无参构造器");
	}

	public void setIgnoreDepTypeService(IgnoreDepTypeService ignoreDepTypeService) {
		this.ignoreDepTypeService = ignoreDepTypeService;
	}

	public AutowireXxxAware(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}
	@Override
	public void setApplicationContext(ApplicationContext context) {
		this.applicationContext = context;
	}

	public void printIgnoreType() {
		System.out.println(ignoreDepTypeService);
	}

	public void printContext() {
		System.out.println(applicationContext);
	}
//
//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//
//	}
}
