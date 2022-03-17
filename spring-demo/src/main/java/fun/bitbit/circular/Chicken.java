package fun.bitbit.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Date: 2022/1/11 23:55
 */
@Component
public class Chicken {

	private Egg egg;

	public Chicken() {
		System.out.println("Chicken无参构造器");
	}

	//	@Autowired
//	public Chicken(Egg egg) {
//		this.egg = egg;
//	}

	@Autowired
	public void setEgg(Egg egg) {
		this.egg = egg;
	}

	public void lay() {
		System.out.println("lay egg:" + egg);
	}
}
