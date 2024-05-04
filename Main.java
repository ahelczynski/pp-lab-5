import company.beans.Person;
import company.exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Adam Ostoja-Hełczyński", 30);
            System.out.println("Osoba: " + person.getName() + ", Wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.err.println("Wystąpił błąd przy tworzeniu osoby: " + e.getMessage());
        }
    }
}