package com.akinovapp.directrabbitmq.publish;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDto {
    
    public int messageID;
    public String sender;
    public String messageBody;
    public Date messageDate;
}
