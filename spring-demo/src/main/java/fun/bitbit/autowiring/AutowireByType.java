package fun.bitbit.autowiring;

/**
 * Description:
 * Date: 2022/1/10 23:10
 */
public class AutowireByType {

	private HelloService helloService;

	public void setXxx(HelloService helloService) {
		this.helloService = helloService;
	}

	public void sayHello(String s) {
		helloService.hello(s);
	}
}
