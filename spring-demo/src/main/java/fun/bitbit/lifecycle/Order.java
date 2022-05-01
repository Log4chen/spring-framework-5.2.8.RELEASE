package fun.bitbit.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Order implements InitializingBean, BeanNameAware, ApplicationContextAware {

	private static final Logger logger = LoggerFactory.getLogger(Order.class);

	static {
		logger.info("order--static{}");
	}

	{
		logger.info("order--{}");
	}

	int order = 0;

	public Order() {
		logger.info("order--A(), order:" + order++);
	}

	@PostConstruct
	public void postConstruct() {
		logger.info("order--PostConstruct:" + order++);
	}

	@PreDestroy
	public void preDestory() {
		logger.info("order--preDestory:" + order++);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("order--afterPropertiesSet:" + order++);
	}

	@Override
	public void setBeanName(String name) {
		logger.info("order--setBeanName:" + order++);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		logger.info("order--setApplicationContext:" + order++);
	}
}
