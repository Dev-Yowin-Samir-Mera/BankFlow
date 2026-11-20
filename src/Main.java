import domain.Account;
import domain.Customer;
import domain.IdentificationType;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("BANK");

        System.out.println("-------------------------");

        Customer customer = new Customer("Carlos",
                "Gomez",
                25,
                IdentificationType.ID.getType(),
                "22432134",
                IdentificationType.ID.getDescription());

        System.out.println("-------------------------");

        Account account = new Account(
                22456789,
                customer,
                new BigDecimal(0)
        );


    }
}