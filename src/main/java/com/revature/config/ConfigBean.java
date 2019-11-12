package com.revature.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.revature.models.Dish;
import com.revature.models.Food;

@Configuration
public class ConfigBean {

	@Bean(name = "plate", autowire = Autowire.BY_TYPE)
	public Dish getPlate() {
		Dish dish = new Dish();
		dish.setName("plate");
		return dish;
	}
	
	@Bean(name = "bowl")
	public Dish getBowl() {
		Dish bowl = new Dish();
		bowl.setName("bowl");
		// Explicit wiring
		bowl.setFood(soup());
		return bowl;
	}
	
	public Food soup() {
		Food soup = new Food();
		soup.setName("soup");
		return soup;
	}
	
	@Scope(value="prototype") // <bean scope="" ... />
	@Primary // <bean primary="true" ... />
	@Lazy // <bean lazy-init="true" ... />
	@Bean // <bean ... />
	public Food getSpaghetti() {
		Food food = new Food();
		food.setName("spaghetti");
		return food;
	}
	
	
}
