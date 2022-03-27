package fun.bitbit.autowiring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Description:
 * Date: 2022/3/27 13:33
 */
public class IgnoreDepTypeProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		beanFactory.ignoreDependencyType(IgnoreDepTypeService.class);
	}
}
