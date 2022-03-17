package fun.bitbit.circular;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Date: 2022/1/20 22:58
 */
@Component
@Scope("prototype")
public class PrototypeBean {
	public PrototypeBean() {
		System.out.println("PrototypeBean无参构造器");
	}
}
