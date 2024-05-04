import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Adam Ostoja-Hełczyński", 30);
            System.out.println("Osoba: " + person.getName() + ", Wiek: " + person.getAge());

            Messenger emailMessenger = new EmailMessenger();
            emailMessenger.sendMessage("Witaj, " + person.getName() + "!");

        } catch (InvalidAgeException e) {
            System.err.println("Wystąpił błąd przy tworzeniu osoby: " + e.getMessage());
        }
    }
}