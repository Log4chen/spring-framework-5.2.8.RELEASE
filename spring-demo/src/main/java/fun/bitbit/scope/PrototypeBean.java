package fun.bitbit.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Date: 2022/3/26 16:18
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {

	@Autowired
	SingletonBean singletonBean;

	public PrototypeBean() {
		System.out.println("PrototypeBean 无参构造器");
	}
}
