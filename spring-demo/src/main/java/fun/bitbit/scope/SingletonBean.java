package fun.bitbit.scope;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Date: 2022/3/26 16:16
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonBean implements ApplicationContextAware {

	@Autowired
	ApplicationContext applicationContext;

	public void doSomething() {
		System.out.println(applicationContext.getBean(this.getClass()) == this);
		System.out.println(getPrototypeBean().hashCode());
	}

	@Lookup
	public PrototypeBean getPrototypeBean() {
		return null;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

	}
}
