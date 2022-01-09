package fun.bitbit.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PostConstructTest implements BeanFactoryPostProcessor {

	private static final Logger logger = LoggerFactory.getLogger(PostConstructTest.class);

	public PostConstructTest (){
		logger.info("PostConstructTest construct");
	}


	@PostConstruct
	public void postConstruct(){
		logger.info("PostConstructTest PostConstruct");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		logger.info("PostConstructTest postProcessBeanFactory");
	}
}
