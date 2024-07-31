package com.spring.core.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class EmailService implements MessageService{
    public void sendMessage(String message){
        System.out.println(message);
    }
}
