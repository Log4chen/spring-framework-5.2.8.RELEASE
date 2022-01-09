package fun.bitbit.postProcessor;

import fun.bitbit.aop.ServiceAspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * ClassName: MyBeanPostProcessor <br/>
 *
 * @Author: chenyuesheng  <br/>
 * Date: 2020/3/23 12:08 <br/>
 * Version: 1.0 <br/>
 * Description:  <br/>
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	private static final Logger logger = LoggerFactory.getLogger(ServiceAspect.class);

	static {
		logger.info("MyBeanPostProcessor--static{}");
	}

	{
		logger.info("MyBeanPostProcessor--{}");
	}

//	@Autowired
//	public void setXXX(EnglishSpellChecker checker) {
//		log.info("setter方法注入checker:" + checker);
//
//	}

	@PostConstruct
	public void postConstruct() {
		logger.info("MyBeanPostProcessor--PostConstruct");
	}

	@PreDestroy
	public void preDestroy() {
		logger.info("MyBeanPostProcessor--preDestory");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("order"))
			logger.info("MyBeanPostProcessor--postProcessBeforeInitialization, beanName:" + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("order"))
			logger.info("MyBeanPostProcessor--postProcessAfterInitialization,beanName:" + beanName);
		return bean;
	}
}
