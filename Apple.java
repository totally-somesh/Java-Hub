package com.app.Fruits;

public class Apple extends Fruit {

	public Apple(String colour, double weight, String name) {
		super(colour, weight, name);

	}

	public String taste() {
		return "sweet";
	}

	public void jam() {
		System.out.println(this.getName()+"MAKING JAM!!!");
	}

}
