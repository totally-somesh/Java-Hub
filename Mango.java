package com.app.Fruits;

public class Mango extends Fruit {

	public Mango(String colour, double weight, String name) {
		super(colour, weight, name);

	}

	
	public String taste() {
		return "sweet";
	}

	public void pulp() {
		
		System.out.println(this.getName()+this.getColour()+"mango pulp is created");
	}

}
