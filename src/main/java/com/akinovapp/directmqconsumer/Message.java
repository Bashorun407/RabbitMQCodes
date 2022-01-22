package com.akinovapp.directmqconsumer;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {

    private String messageID;
    private String sender;
    private String messageBody;
    private Date messageDate;
    


    public Message() {
    }

    public Message(String messageID, String sender, String messageBody, Date messageDate) {
        this.messageID = messageID;
        this.sender = sender;
        this.messageBody = messageBody;
        this.messageDate = messageDate;
    }

    public String getMessageID() {
        return this.messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public String getSender() {
        return this.sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessageBody() {
        return this.messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public Date getMessageDate() {
        return this.messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public Message messageID(String messageID) {
        setMessageID(messageID);
        return this;
    }

    public Message sender(String sender) {
        setSender(sender);
        return this;
    }

    public Message messageBody(String messageBody) {
        setMessageBody(messageBody);
        return this;
    }

    public Message messageDate(Date messageDate) {
        setMessageDate(messageDate);
        return this;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (o == this)
    //         return true;
    //     if (!(o instanceof Message)) {
    //         return false;
    //     }
    //     Message message = (Message) o;
    //     return Objects.equals(messageID, message.messageID) && Objects.equals(sender, message.sender) && Objects.equals(messageBody, message.messageBody) && Objects.equals(messageDate, message.messageDate);
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(messageID, sender, messageBody, messageDate);
    // }

    @Override
    public String toString() {
        return "{" +
            " messageID='" + getMessageID() + "'" +
            ", sender='" + getSender() + "'" +
            ", messageBody='" + getMessageBody() + "'" +
            ", messageDate='" + getMessageDate() + "'" +
            "}";
    }

}
