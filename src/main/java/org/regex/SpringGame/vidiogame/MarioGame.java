package org.regex.SpringGame.vidiogame;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration   // that is Annotation that use to configure to class that spring automatic manage that and creat instance of that class ...  
public class MarioGame {
	
	
	
	@Bean // this is Annotation that refer to obj that is managed by spring ioc...
	@Qualifier  // that annotation that use to when we have multiple bean its use for specific bean Selection...
	public void up(){
		System.out.println(" Upper ");
	}
	@Bean
	@Primary  // that annotation use when we have multiple bean then spring select a default bean...
	public void down(){
		System.out.println(" niche ");
	}
	@Bean
	public void left(){
		System.out.println(" Left ");
	}
	@Bean
	public void right(){
		System.out.println(" Right ");
	}
	

}
