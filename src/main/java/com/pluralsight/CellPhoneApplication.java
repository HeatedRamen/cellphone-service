package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CellPhone kevCellphone = new CellPhone();

        System.out.printf("What is the serial number?: ");
        kevCellphone.setSerialNumber(input.nextInt());
        input.nextLine();

        System.out.printf("What model is the phone?: ");
        kevCellphone.setModelName(input.nextLine());

        System.out.printf("Who is the carrier?: ");
        kevCellphone.setCellCarrier(input.nextLine());

        System.out.printf("What is the phone number?: ");
        kevCellphone.setPhoneNumber(input.nextLine());

        System.out.printf("Who is the owner of the phone?: ");
        kevCellphone.setOwnerName(input.nextLine());


    }
}
