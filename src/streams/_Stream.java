package streams;

import static imperative.Main.*;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        // Filter all females
        List<Person> females = people.stream()
                .filter(person -> Gender.FEMALE.equals(person.getGender()))
                .collect(Collectors.toList());


        females.forEach(System.out::println);

        //Sorting
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getGender).thenComparing(Person::getName))
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);

        //All match
        boolean allMatch = people.stream()
                                        .allMatch(person -> person.getGender().name().contains("MALE"));
        System.out.println("All contain male in gender: " + allMatch);

        //Any match
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getName().equals("Maria"));
        System.out.println("There is a Maria: " + anyMatch);

        //None match
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Maria"));
        System.out.println("There is not a Maria: " + noneMatch);

        //Max
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        //Min
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        //Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people.forEach(System.out::println);
            System.out.println();
        });

        //Complex operations

        Optional<String> oldestFemaleName = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        oldestFemaleName.ifPresent(System.out::println);
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("John", Gender.MALE, 12),
                new Person("Maria", Gender.FEMALE, 40),
                new Person("Aisha", Gender.FEMALE, 50),
                new Person("Alex", Gender.MALE, 27),
                new Person("Alice", Gender.FEMALE, 45)
        );
    }
}
