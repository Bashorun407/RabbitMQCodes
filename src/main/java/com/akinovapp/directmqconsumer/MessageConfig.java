package com.akinovapp.directmqconsumer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

    public static final String QUEUE = "new_direct_queue";
    public static final String EXCHANGE = "new_direct_exchange";
    public static final String ROUTING_KEY = "new_direct_routing_key";

public Queue queue(){

    return new Queue(QUEUE);
}
    
public DirectExchange exchange(){

    return new DirectExchange(EXCHANGE);
}

public Binding binding(Queue queue, DirectExchange exchange){

   return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
}

public MessageConverter messageConverter(){

    return new Jackson2JsonMessageConverter();
}

public AmqpTemplate template(ConnectionFactory connectionFactory){

    RabbitTemplate template = new RabbitTemplate(connectionFactory);
    template.setMessageConverter(messageConverter());

    return template;  
}

}
