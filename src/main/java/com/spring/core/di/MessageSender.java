package com.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    //private SMSService smsService;
    //private EmailService emailService;
    private MessageService messageService;
    private MessageService smsService;
    @Autowired
    public void setMessageService(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
        System.out.println("setter based Dependency Injection  1");
    }
    @Autowired
    public void setSmsService(@Qualifier("emailService") MessageService smsService) {
        this.smsService = smsService;
        System.out.println("setter based Dependency Injection  2");
    }

    //public MessageSender(SMSService smsService){
   // @Autowired
   /* public MessageSender(@Qualifier("emailService")MessageService messageService){
        this.messageService=messageService;
        System.out.println("single argument based constructor based Dependency Injection");
    }
    @Autowired
    public MessageSender(@Qualifier("emailService")MessageService messageService,SMSService smsService){
        this.messageService=messageService;
        this.smsService=smsService;
        System.out.println("double argument based constructor Dependency Injection");
    }
*/
    public void sendMessage(String message){
        this.messageService.sendMessage(message);
        this.smsService.sendMessage(message);
    }
}
