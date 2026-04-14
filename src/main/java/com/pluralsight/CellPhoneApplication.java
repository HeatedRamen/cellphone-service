package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CellPhone kevCellphone = new CellPhone();

        println("What is the serial number?:");
        kevCellphone.setSerialNumber(input.nextInt());
        input.nextLine();

        println("What model is the phone?");
        kevCellphone.setModelName(input.nextLine());

        println("Who is the carrier?");
        kevCellphone.setCellCarrier(input.nextLine());

        println("What is the phone number?");
        kevCellphone.setPhoneNumber(input.nextLine());

        println("Who is the owner of the phone?");
        kevCellphone.setOwnerName(input.nextLine());

        displayMenu(kevCellphone);
    }

    static void displayMenu(CellPhone cellPhone){
        println("Serial number: " + cellPhone.getSerialNumber());
        println("Phone model: " + cellPhone.getModelName());
        println("Phone carrier: " + cellPhone.getCellCarrier());
        println("Phone number: " + cellPhone.getPhoneNumber());
        println("Owner: " + cellPhone.getOwnerName());
    }
    static void println(String message){
        System.out.println(message);
    }

}
