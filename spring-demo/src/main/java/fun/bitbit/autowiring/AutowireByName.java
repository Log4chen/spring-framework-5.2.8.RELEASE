package fun.bitbit.autowiring;

/**
 * Description:
 * Date: 2022/1/10 23:10
 */
public class AutowireByName {

	private HelloService helloService;

	public void setAbc(HelloService helloService) {
		this.helloService = helloService;
	}

	public void sayHello(String s) {
		helloService.hello(s);
	}
}
