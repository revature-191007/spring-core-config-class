package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.config.ConfigBean;
import com.revature.models.Dish;
import com.revature.models.Food;

public class Launcher {
	public static void main(String[] args) {
		ApplicationContext appContext =
				new AnnotationConfigApplicationContext(ConfigBean.class);
		
		System.out.println(appContext.getBean("plate", Dish.class));
		System.out.println(appContext.getBean("bowl", Dish.class));
		
		
		
//		Food food = appContext.getBean(Food.class);
//		Food food2 = appContext.getBean(Food.class);
//		System.out.println(food == food2);
		
	}
}
