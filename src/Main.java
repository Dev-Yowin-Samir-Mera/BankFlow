import domain.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------------");
        System.out.println("           BANK          ");
        System.out.println("-------------------------");

        Customer customer = new Customer(
                "Carlos",
                "Ortiz",
                32,
                IdentificationType.ID,
                "32789976",
                CustomerType.NATURAL_PERSON
        );

        System.out.println("Customer: "+customer.toString());
        System.out.println("-------------------------");

        Account account = new Account(
                22456789,
                customer,
                new BigDecimal(0)
        );

        System.out.println("Account: "+account.toString());
        System.out.println("Saldo Inicial: "+account.getBalance());
        System.out.println("-------------------------");

        try{
            account.deposit(new BigDecimal(100));
        }catch (BankFlowException de){
            System.out.println(de.getMessage());
        }

        System.out.println("Saldo luego deposito: "+account.getBalance());

        try{
            account.withdraw(new BigDecimal(80));
        }catch (BankFlowException de){
            System.out.println(de.getMessage());
        }

        System.out.println("Saldo luego retiro: "+account.getBalance());


    }
}