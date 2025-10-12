package exceptionandfilehandling;

import java.io.*;

public class ContactRunner {
    //Serialozation

    public static void main(String[] args) {
        Contact contactOne = new Contact("Abhi","9876543210");
        try {
            FileOutputStream fos = new FileOutputStream("contact.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(contactOne);
            System.out.println("Contact is serialized");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(contactOne);
    }
}
