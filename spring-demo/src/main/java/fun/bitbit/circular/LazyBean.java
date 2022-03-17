package fun.bitbit.circular;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Date: 2022/1/20 22:50
 */
@Lazy
@Component
public class LazyBean {
	public LazyBean() {
		System.out.println("lazy无参构造器");
	}
}
