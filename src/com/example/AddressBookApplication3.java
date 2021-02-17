package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Creates a new instance of an AddressBook object and adds 2 AddressEntry with the given data
 * then lists the entries in the output
 */
public class AddressBookApplication3 {
    private static void initAddressBookExercise(AddressBook ab) {
        // Create 1st instance of AddressEntry
        AddressEntry entry1 = new AddressEntry("John", "Doe", "Carlos Bee", "Hayward", "CA", 94544, "555-55-5555", "john@doe.com");

        // Create 2nd instance of AddressEntry
        AddressEntry entry2 = new AddressEntry();
        entry2.setFirstName("Jane");
        entry2.setLastName("Smith");
        entry2.setStreet("Mission Blvd");
        entry2.setCity("San Francisco");
        entry2.setState("CA");
        entry2.setZip(93434);
        entry2.setPhone("444-444-4444");
        entry2.setEmail("jane@smith.com");

        // Add the entries in AddressBook
        ab.add(entry1);
        ab.add(entry2);
    }

    public static void init(String filename, AddressBook ab) {
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            int count = 0;
            ArrayList info = new ArrayList();

            while (input.hasNextLine()) {
                while (count < 8) {
                    info.add(input.nextLine());
                    count++;
                }
                count = 0;
                AddressEntry entry = new AddressEntry(info.get(0).toString(), info.get(1).toString(), info.get(2).toString(), info.get(3).toString(), info.get(4).toString(), Integer.parseInt(info.get(5).toString()), info.get(6).toString(), info.get(7).toString());
                ab.add(entry);
                info = new ArrayList();
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Create an instance of AddressBook
        AddressBook ab = new AddressBook();

        // Create 2 entries in AddressBook
        initAddressBookExercise(ab);

        // Read data from file and add to AddressBook
        init("../../../AddressInputDataFile2.txt", ab);
        // Iterate through the entries and print in the output
        ab.list();
    }

}
