package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        // Predicate receives one argument and returns boolean
        Predicate<String> isValidNumberPredicate = number -> number.startsWith("07") && number.length() == 11;
        System.out.println(isValidNumberPredicate.test("07123123123"));
        System.out.println(isValidNumberPredicate.test("08123123124"));

        //Chaining predicates
        Predicate<String> containsNumberThree = number -> number.contains("3");

        Predicate<String> isValidAndContains3Predicate = isValidNumberPredicate.and(containsNumberThree);
        System.out.println(isValidAndContains3Predicate.test("07123123123"));
        System.out.println(isValidAndContains3Predicate.test("07444444444"));

        //BiPredicates
    }
}
