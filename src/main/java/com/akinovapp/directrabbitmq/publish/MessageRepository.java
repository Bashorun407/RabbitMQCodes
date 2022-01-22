package com.akinovapp.directrabbitmq.publish;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, String>{
    
}
