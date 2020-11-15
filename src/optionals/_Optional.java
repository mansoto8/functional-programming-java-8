package optionals;

import java.sql.SQLOutput;
import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        Optional.ofNullable(null).orElseGet(() -> "value is null");

        System.out.println("Empty value");
        Optional<Object> empty = Optional.empty();

        System.out.println(empty);
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());

        String orElse = (String) empty.orElse("Default");
        System.out.println("Converting or else: " + orElse);

        System.out.println("Non Empty value");
        Optional<Object> nonEmpty = Optional.of("Hellos");

        System.out.println(nonEmpty);
        System.out.println(nonEmpty.isPresent());
        System.out.println(nonEmpty.isEmpty());

        //Optionals allow to do transformations: map
        Optional<String> hello = Optional.ofNullable("Hello 2");
        String value = hello.map(String::toUpperCase)
                .orElse("If null this is default");

        System.out.println("Value: " + value);

        //we can also use a supplier
        Optional<String> helloWithSupplier = Optional.ofNullable(null);
        String valueWithSupplier = helloWithSupplier.map(String::toUpperCase)
                .orElseGet(() -> "this value was retrieved from the database");

        System.out.println("Value: " + valueWithSupplier);

        //IfPresent and ifPesentOrElse -> Use a consumer if present
    }
}
