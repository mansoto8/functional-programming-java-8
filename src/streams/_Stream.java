package streams;

import static imperative.Main.*;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE)
        );

        people.stream()
                .map(person -> person.getGender())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.getGender()));
    }
}
