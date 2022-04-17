package fun.bitbit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Description:
 * Date: 2022/4/4 18:07
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	Logger logger = LoggerFactory.getLogger(MyBeanFactoryPostProcessor.class);

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		logger.info("手动add的BeanFactoryPostProcessor");
	}
}
