import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Adam Ostoja-Hełczyński", 30);
            System.out.println("Osoba: " + person.getName() + ", Wiek: " + person.getAge());

            // Dodawanie dwóch liczb za pomocą klasy MathUtils
            int suma = MathUtils.add(5, 7);
            System.out.println("Suma liczby 5 i 7 to: " + suma);

            Messenger emailMessenger = new EmailMessenger();
            emailMessenger.sendMessage("Witaj, " + person.getName() + "! Suma liczby 5 i 7 to: " + suma);

        } catch (InvalidAgeException e) {
            System.err.println("Wystąpił błąd przy tworzeniu osoby: " + e.getMessage());
        }
    }
}
