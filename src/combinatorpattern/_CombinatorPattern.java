package combinatorpattern;

import java.time.LocalDate;

public class _CombinatorPattern {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gamil.com",
                "+0134134",
                LocalDate.of(2000, 1, 1));
        CustomerValidatorService cvs = new CustomerValidatorService();
        System.out.println(cvs.isValid(customer));

        CustomerRegistrationValidator.ValidationResult result = CustomerRegistrationValidator
                .isEmailValid()
                .and(CustomerRegistrationValidator.isAnAdult())
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .apply(customer);

        System.out.println("Result " + result);


        if(result != CustomerRegistrationValidator.ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }

    }

}
