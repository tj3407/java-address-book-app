package com.example;
import java.util.Scanner;

public class AddressBookApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Menu.prompt_FirstName();
        String fname = input.nextLine();

        Menu.prompt_LastName();
        String lname = input.nextLine();

        Menu.prompt_Street();
        String street = input.nextLine();

        Menu.prompt_City();
        String city = input.nextLine();

        Menu.prompt_State();
        String state = input.nextLine();

        Menu.prompt_Zip();
        String zip = input.nextLine();

        Menu.prompt_Telephone();
        String tel = input.nextLine();

        Menu.prompt_Email();
        String email = input.nextLine();

        System.out.println(fname + "\n" + lname + "\n" + street + "\n" + city + "\n" + state + "\n" + zip + "\n" + tel + "\n" + email);
    }
}
