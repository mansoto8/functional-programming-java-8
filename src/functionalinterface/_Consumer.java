package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        //CONSUMER -> get one argument and returns not result
        Consumer<Customer> greetCostumerConsumer = customer -> System.out.println("Hello " + customer.getName());
        greetCostumerConsumer.accept(new Customer("Maria", 131234));

        //BICONSUMER -> get two arguments and return no result
        BiConsumer<Customer, Boolean> greetCostumerBiConsumer = (customer, showPhone) -> {
            System.out.println("Hello " + customer.getName() + "we are updating your phone " + (showPhone ? customer.getNumber() : ""));
        };
        greetCostumerBiConsumer.accept(new Customer("Maria", 131234), true);
        greetCostumerBiConsumer.accept(new Customer("Maria", 131234), false);
    }

    public static class Customer {
        private String name;
        private int number;

        public Customer(String name, int number) {
            this.name = name;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
}
