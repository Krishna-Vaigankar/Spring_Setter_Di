package com.krishna;

public class Car {

	private String name;
	private int release_year;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRelease_year() {
		return release_year;
	}

	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}

	public void carshow() {

		System.out.println("Car Name = " + name);
		System.out.println("Car Release Year = " + release_year);
	}
}
