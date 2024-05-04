import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        final int b = 10;

        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Adam Ostoja", 25);
            people[2] = new Person("Adam Hełczyński", 40);
            people[3] = new Person("Adam Ostoja-Hełczyński", 22);
            people[4] = new Person("Ostoja-Hełczynski", 35);

            Messenger emailMessenger = new EmailMessenger();          
            for (Person person : people) {
                int agePlusB = MathUtils.add(person.getAge(), b);
                String message = "Witaj, " + person.getName() + "! Twój wiek plus 10 wynosi: " + agePlusB;
                emailMessenger.sendMessage(message);
            }

        } catch (InvalidAgeException e) {
            System.err.println("Wystąpił błąd przy tworzeniu osoby: " + e.getMessage());
        }
    }
}