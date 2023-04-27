package com.app.Fruits;

public class Orange extends Fruit {

	public Orange(String colour, double weight, String name) {
		super(colour, weight, name);

	}

	public String taste() {
		return "sour";
	}

	public void juice() {

		System.out.println(this.getName() + this.getWeight() + "JUICE IS CREATED");
	}

}
