package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        //Supplier -> returns a results without initial argument
        Supplier<String> getDBConnectionURLSupplier = () -> "db connection url";
        System.out.println(getDBConnectionURLSupplier.get());

        Supplier<List<String>> getDBConnectionURLsSupplier =
                () -> List.of(
                    "db connection url",
                    "db connection url 2"
                );
        System.out.println(getDBConnectionURLsSupplier.get());
    }
}
