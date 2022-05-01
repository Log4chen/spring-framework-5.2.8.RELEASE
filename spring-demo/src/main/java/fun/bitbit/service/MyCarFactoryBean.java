package fun.bitbit.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Description:
 * Date: 2022/4/17 18:43
 */
@Component
public class MyCarFactoryBean implements FactoryBean<Car> {
	private String[] colors = {"red", "black", "white", "blue", "green"};

	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		car.setColor(colors[new Random().nextInt(colors.length)]);
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
