package com.kushnirmark.spring.rest;

import com.kushnirmark.spring.rest.configuration.MyConfig;
import com.kushnirmark.spring.rest.entity.ClientOrder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);


        ClientOrder order = new ClientOrder("Egor","89992223377","Created");
        if(order.getStatus() == "Created" )
        order.setId(17);
        if (order.getStatus()=="Created"){
            order.setStatus("in_preparation");
        }
        communication.createOrder(order);

    }



}
