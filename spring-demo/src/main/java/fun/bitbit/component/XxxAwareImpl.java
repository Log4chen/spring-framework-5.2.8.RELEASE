package fun.bitbit.component;

import fun.bitbit.autowiring.HelloService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Date: 2022/3/26 17:45
 */
//@Component
public class XxxAwareImpl implements ApplicationContextAware {


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

	}
}
