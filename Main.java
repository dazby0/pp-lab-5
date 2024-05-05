import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person("Aurora Bennett", 30);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());
        }

        int a = 15;
        int b = 48;

        int sum = MathUtils.add(a, b);
        System.out.println("Sum: " + sum);

        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("\nSum of " + a + " and " + b + " is equal to: " + sum);
    }
}
