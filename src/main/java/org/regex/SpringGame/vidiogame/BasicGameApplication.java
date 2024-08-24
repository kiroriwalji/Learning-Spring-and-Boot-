package org.regex.SpringGame.vidiogame;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasicGameApplication {

	public static void main(String[] args) {
		
		//that is help to call beans 
		var context = new AnnotationConfigApplicationContext(BasicGameApplication.class);
		var game = new MarioGame();
//		var game = new Taken();
//		var game = new SupraContra();
//		var game = new PacMan();
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();
		
		//that tell us total beans in our code
		String[] allBeanNames = context.getBeanDefinitionNames();
        for (String beanName : allBeanNames) {
            System.out.println("Bean name: " + beanName);
        }
		System.out.println(context.getBean(BasicGameApplication.class));
		
	}
}