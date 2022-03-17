package fun.bitbit.aware;

import fun.bitbit.TextEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Date: 2022/1/10 21:45
 */
@Component
public class MyApplicationContextAware implements ApplicationContextAware {

	private Logger logger = LoggerFactory.getLogger(MyApplicationContextAware.class);

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private TextEditor editor;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		this.applicationContext = applicationContext;
		logger.info("ApplicationContextAware setApplicationContext...");
	}

	public void get() {
		logger.info("get");
	}
}
