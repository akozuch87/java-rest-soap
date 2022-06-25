package pl.sapiens.javarestsoap.stream;

import java.util.List;

public class StreamMain {

    public static void main(String[] args) {

        // Java 6
        // List<Person> persons = new ArrayList<Person>();

        // Java 7
        // List<Person> persons = new ArrayList<>();

        // Java 9
        // var persons it's the same as List<Person> person
        // var persons = new ArrayList<>();


        List<Person> persons = List.of(
                new Person("Maniek", "P", 38),
                new Person("Mateusz", "W", 28),
                new Person("Adrian", "R", 16)
        );

        persons.stream()
                .filter(person -> person.age() >= 18)
                .map(person -> {
                    String name = person.name();
                    System.out.println(name);
                    return name;
                })
                .forEach(name -> System.out.println("name: " + name));

    }

}
