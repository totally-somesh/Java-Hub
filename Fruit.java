package com.app.Fruits;

public abstract class Fruit {
	private String colour;
	private double weight;
	private String name;
	private boolean fresh;

	private static int counterID = 0;

	private int ID = 0;

	public Fruit(String colour, double weight, String name) {

		counterID++;
		this.ID = counterID;
		this.colour = colour;
		this.weight = weight;
		this.name = name;
		this.fresh = fresh;
	}
	
	public int getID(){
		return ID;
	}

	public boolean isFresh() {
		return fresh;
	}

	public String getColour() {
		return colour;
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public abstract String taste();

	public String toString() {
		return "colour= " + colour + "weight =" + weight + " | name =" + name+ " | Fresh = " +fresh;
	}
}
