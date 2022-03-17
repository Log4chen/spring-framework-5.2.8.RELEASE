package fun.bitbit;

import fun.bitbit.service.ISpellChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//import javax.annotation.Resource;
//import javax.inject.Inject;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TextEditor {

	private static final Logger log = LoggerFactory.getLogger(TextEditor.class);

//	@Autowired
//	@Resource
//	@Inject
//	@Qualifier("englishSpellChecker")
	private ISpellChecker spellChecker;

	@Resource
	public void setSpellChecker(ISpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void inputText(String text) {
		spellChecker.check(text);
	}
}
