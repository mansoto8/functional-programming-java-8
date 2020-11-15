package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        //Expressions
        Function<String, String> printName = name -> name.toUpperCase();
        Function<String, String> printName2 = String::toUpperCase;
        Function<String, String> printName3 = name -> {
            //Logic with more than one line
            name.toUpperCase();
        };

        //When two arguments use parenthesis for grouping them
        BiFunction<String,Integer, String> printName4 = (name, age) -> {
            //Logic with more than one line
            name.toUpperCase();
        };
    }
}

spring-mongodb
