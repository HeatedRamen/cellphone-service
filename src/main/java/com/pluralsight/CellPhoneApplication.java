package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone kevCellphone = new CellPhone();
        CellPhone bobbyCellphone = new CellPhone();

        getCellInfo(kevCellphone);
        getCellInfo(bobbyCellphone);

        display(kevCellphone);
        display(bobbyCellphone);

        kevCellphone.dial(bobbyCellphone.getPhoneNumber());
        bobbyCellphone.dial(kevCellphone.getPhoneNumber());
    }

    static void display(CellPhone cellPhone){
        println("===================================");
        println("Owner: " + cellPhone.getOwnerName());
        println("Serial number: " + cellPhone.getSerialNumber());
        println("Phone model: " + cellPhone.getModelName());
        println("Phone carrier: " + cellPhone.getCellCarrier());
        println("Phone number: " + cellPhone.getPhoneNumber());
        println("===================================");
    }
    static void println(String message){
        System.out.println(message);
    }
    static void getCellInfo(CellPhone phone){
        println("What is the serial number?:");
        phone.setSerialNumber(input.nextInt());
        input.nextLine();

        println("What model is the phone?");
        phone.setModelName(input.nextLine());

        println("Who is the carrier?");
        phone.setCellCarrier(input.nextLine());

        println("What is the phone number?");
        phone.setPhoneNumber(input.nextLine());

        println("Who is the owner of the phone?");
        phone.setOwnerName(input.nextLine());
    }
}
