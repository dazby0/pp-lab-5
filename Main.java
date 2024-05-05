import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;

public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person("Aurora Bennett", 30);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            
            Messenger messenger = new EmailMessenger();
            messenger.sendMessage("\nSample message");
        } catch (InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}
