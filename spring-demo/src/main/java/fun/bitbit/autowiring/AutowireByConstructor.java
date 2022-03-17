package fun.bitbit.autowiring;

/**
 * Description:
 * Date: 2022/1/10 23:20
 */
public class AutowireByConstructor {
	private HelloService helloService;

	public AutowireByConstructor(HelloService helloService) {
		this.helloService = helloService;
	}

	public void sayHello(String s) {
		helloService.hello(s);
	}
}
