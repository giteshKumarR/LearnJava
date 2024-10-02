package com.lcwd.core.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    @Qualifier("dog")
    Animal animal;

//    public Person(Animal animal) {
//        this.animal = animal;
//    }

    public void playWithAnimal() {
        // Using Animal
        animal.play();
    }
}
