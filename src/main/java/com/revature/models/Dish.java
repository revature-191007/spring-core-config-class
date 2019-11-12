package com.revature.models;

public class Dish {
	private String name;
	private Food food;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dish other = (Dish) obj;
		if (food == null) {
			if (other.food != null)
				return false;
		} else if (!food.equals(other.food))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Dish [name=" + name + ", food=" + food + "]";
	}
	public Dish(String name, Food food) {
		super();
		this.name = name;
		this.food = food;
	}
	public Dish() {
		super();
	}
}
