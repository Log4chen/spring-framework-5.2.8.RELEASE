package fun.bitbit.service;

/**
 * Description:
 * Date: 2022/4/17 18:47
 */
public class Car {
	private String color;

	public void print() {
		System.out.println("car color:" + color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
