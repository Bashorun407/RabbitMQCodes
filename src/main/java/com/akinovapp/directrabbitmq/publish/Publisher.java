package com.akinovapp.directrabbitmq.publish;

import java.util.Date;
import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/directMessage")
public class Publisher {
    
    @Autowired
    private MessageRepository messageReppo;

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/sendMessage")
    public String publisher(@RequestBody MessageDto messageDto){

        Message message = new Message();
        message.setMessageID(messageDto.messageID);
        message.setSender(messageDto.sender);
        message.setMessageBody(messageDto.messageBody);
        message.setMessageDate(new Date());

        messageReppo.save(message);

        template.convertAndSend(MessageConfig.EXCHANGE, MessageConfig.ROUTING_KEY, message);
        return " Message sent successfully";
    }
}
