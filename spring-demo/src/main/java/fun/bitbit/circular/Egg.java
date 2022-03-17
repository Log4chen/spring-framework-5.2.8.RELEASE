package fun.bitbit.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Date: 2022/1/11 23:55
 */
@Component
public class Egg {

//	@Autowired
	private Chicken chicken;

	public Egg() {
		System.out.println("Egg无参构造器");
	}

//	@Autowired
//	public Egg(Chicken chicken) {
//		this.chicken = chicken;
//	}

	@Autowired
	public void setChicken(Chicken chicken) {
		this.chicken = chicken;
	}

	public void hatch() {
		System.out.println("hatch " + chicken);
	}
}
