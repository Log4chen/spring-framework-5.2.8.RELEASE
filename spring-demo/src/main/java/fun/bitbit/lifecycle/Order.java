package fun.bitbit.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Order implements InitializingBean, BeanNameAware{

	private static final Logger logger = LoggerFactory.getLogger(Order.class);
	
	static {
		logger.info("order--static{}");
	}

	{
		logger.info("order--{}");
	}

	public Order() {
		logger.info("order--A()");
	}

	@PostConstruct
	public void postConstruct() {
		logger.info("order--PostConstruct");
	}

	@PreDestroy
	public void preDestory() {
		logger.info("order--preDestory");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("order--afterPropertiesSet");
	}

	@Override
	public void setBeanName(String name) {
		logger.info("order--setBeanName:" + name);
	}
}
