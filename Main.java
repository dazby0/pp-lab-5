import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {

    public static void main(String[] args) {

        try {
            Person[] people = new Person[5];
            int b = 10;

            people[0] = new Person("Lily Johnson", 30);
            people[1] = new Person("Max Thompson", 25);
            people[2] = new Person("Emily Davis", 40);
            people[3] = new Person("Oliver Clark", 35);
            people[4] = new Person("Sophia Roberts", 22);

            Messenger messenger = new EmailMessenger();

            for (Person person : people) {
                int sum = MathUtils.add(person.getAge(), b);
                messenger.sendMessage("\nThe sum of age " + person.getName() + " and " + b + " is equal to: " + sum);
            }
        } catch (InvalidAgeException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}
