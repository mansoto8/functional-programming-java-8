package finalsection;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        hello("John", null, value -> System.out.println("No last name provided for " + value));
        helloWithRunnable("John", null, () -> System.out.println("No last name provided (Runnable) "));
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void helloWithRunnable(String firstName, String lastName, Runnable callback) {
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            //For this case we don't have the option of doing a parameter
            callback.run();
        }
    }
}
