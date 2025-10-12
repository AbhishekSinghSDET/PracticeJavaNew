package exceptionandfilehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ContactRunner2 {
    //Deserializatin

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("contact.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Contact data = (Contact) ois.readObject();
            System.out.println(data);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
