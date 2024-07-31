package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] arg){
        //Vehicle vehicle=new Car();
        //Traveler traveler=new Traveler(vehicle);
        //traveler.startJourney();
        //creating spring ioc container
        //Read configuration class
        //create and manage spring beans
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        //Retrieve beans from spring IOC container
        Car car=context.getBean(Car.class);
        car.move();
        Bike bike=context.getBean(Bike.class);
        bike.move();
        Cycle cycle=context.getBean(Cycle.class);
        cycle.move();
        Traveler traveller=context.getBean(Traveler.class);
        traveller.startJourney();

    }

}
