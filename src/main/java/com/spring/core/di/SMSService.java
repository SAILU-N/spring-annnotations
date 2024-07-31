package com.spring.core.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SMSService implements MessageService {
   @Override
    public void sendMessage(String message){
        System.out.println(message);
    }
}
