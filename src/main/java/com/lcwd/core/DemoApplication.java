package com.lcwd.core;

import com.lcwd.core.couple.Animal;
import com.lcwd.core.couple.Cat;
import com.lcwd.core.couple.Dog;
import com.lcwd.core.couple.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"",""})
public class DemoApplication {

	public static void main(String[] args) {
//		Animal animal = new Dog();
//		Animal animal = new Cat();
//		Person p = new Person(animal);
//		p.playWithAnimal();

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Person personBean = context.getBean(Person.class);

		personBean.playWithAnimal();

	}

}
