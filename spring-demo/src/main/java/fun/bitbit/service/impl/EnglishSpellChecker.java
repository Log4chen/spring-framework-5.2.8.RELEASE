package fun.bitbit.service.impl;

import fun.bitbit.service.ISpellChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class EnglishSpellChecker implements ISpellChecker{

	Logger logger = LoggerFactory.getLogger(EnglishSpellChecker.class);

	public EnglishSpellChecker() {
		logger.info("EnglishSpellChecker无参构造器");
	}

	@Override
	public void check(String word) {
		logger.info("check " + word);
		logger.info("check " + word);
	}
}
