package com.akinovapp.directmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @RabbitListener(queues  = MessageConfig.QUEUE)
    public void listenner(Message message){

        System.out.println("Message sent by: " + message.getSender() + " is : " + message.getMessageBody());
        
    }
    
}
