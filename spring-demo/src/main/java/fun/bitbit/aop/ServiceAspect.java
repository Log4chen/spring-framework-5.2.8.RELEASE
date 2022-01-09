package fun.bitbit.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ServiceAspect {

	private static final Logger log = LoggerFactory.getLogger(ServiceAspect.class);

	@Pointcut("execution(public String fun.bitbit.service.order.*.*(java.lang.Integer...))")
	public void pointAboutOrder() {
	}

	@Pointcut("execution(* fun.bitbit.service.*.*(..))")
	public void pointGet() {
	}

	@Before("pointGet()")
	public void test(){
		log.info("ServiceAspect before");
	}
}
