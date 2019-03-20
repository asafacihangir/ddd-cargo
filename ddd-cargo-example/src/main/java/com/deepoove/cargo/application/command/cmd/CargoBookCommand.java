package com.deepoove.cargo.application.command.cmd;

public class CargoBookCommand {

    private String senderPhone;
    private String description;
    private String originLocationCode;
    private String destinationLocationCode;

    public String getSenderId() {
        return senderPhone;
    }

    public void setSenderId(String senderId) {
        this.senderPhone = senderId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOriginLocationCode() {
        return originLocationCode;
    }

    public void setOriginLocationCode(String originLocationCode) {
        this.originLocationCode = originLocationCode;
    }

    public String getDestinationLocationCode() {
        return destinationLocationCode;
    }

    public void setDestinationLocationCode(String destinationLocationCode) {
        this.destinationLocationCode = destinationLocationCode;
    }

}