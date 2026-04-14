package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String modelName;
    private String cellCarrier;
    private String phoneNumber;
    private String ownerName;

    public CellPhone(){
        this.serialNumber = 0;
        this.modelName = "";
        this.cellCarrier = "";
        this.phoneNumber = "";
        this.ownerName = "";
    }

    public int getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCellCarrier() {
        return cellCarrier;
    }
    public void setCellCarrier(String cellCarrier) {
        this.cellCarrier = cellCarrier;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
