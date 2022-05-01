package fun.bitbit.service;

import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Date: 2022/4/17 19:40
 */
@Component
public class MyBoatSmartFactoryBean implements SmartFactoryBean<Boat> {

	public MyBoatSmartFactoryBean() {
		System.out.println("MyBoatSmartFactoryBean Constructor");
	}

	@Override
	public Boat getObject() throws Exception {
		return new Boat();
	}

	@Override
	public Class<?> getObjectType() {
		return Boat.class;
	}

	@Override
	public boolean isSingleton() {
		return SmartFactoryBean.super.isSingleton();
	}

	@Override
	public boolean isPrototype() {
		return SmartFactoryBean.super.isPrototype();
	}

	@Override
	public boolean isEagerInit() {
		return true;
	}
}
