package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);

        // FUNCTION -> takes 1 argument and return 1 result
        Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

        int multiply = multiplyBy10Function.apply(2);
        System.out.println(multiply);

        // COMBINING FUNCTIONS
        Function<Integer, Integer> addOneAndThenMultiplyByTenFunction = incrementByOneFunction.andThen(multiplyBy10Function);

        int result = addOneAndThenMultiplyByTenFunction.apply(2);
        System.out.println(result);


        //BIFUNCTION gets two arguments and return one result
        BiFunction<Integer, Integer, Integer> multiplyAndAdd1BiFunction = (number1, number2) -> (number1 * number2) + 1;

        int resultBiFunction = multiplyAndAdd1BiFunction.apply(2, 3);
        System.out.println(resultBiFunction);

    }


    static int increment(int number) {
        return number + 1;
    }
}
