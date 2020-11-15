package optionals;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        Optional.ofNullable(null).orElseGet(() -> "value is null");
    }
}
