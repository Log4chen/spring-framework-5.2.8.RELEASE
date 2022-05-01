package fun.bitbit.service.impl;

import fun.bitbit.service.ISpellChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//import javax.annotation.Resource;
//import javax.inject.Inject;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TextEditor implements InitializingBean {

	private static final Logger log = LoggerFactory.getLogger(TextEditor.class);

	@Value("${value.myString:defaultValue}")
	private String myString;

	@Value("${value.myString:defaultValue}")
	private String yourString;

	@Autowired
//	@Resource
//	@Inject
//	@Qualifier("englishSpellChecker")
	private ISpellChecker spellChecker;

	@PostConstruct
	public void postConstruct() {
		log.info("@PostConstruct executed");
	}

	@PreDestroy
	public void preDestroy() {
		log.info("@PreDestroy executed");
	}

//	@Resource
	public void setSpellChecker(ISpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void inputText(String text) {
		spellChecker.check(text);
	}

	public void printMyString(){
		log.info("@value myString: " + myString);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
}
