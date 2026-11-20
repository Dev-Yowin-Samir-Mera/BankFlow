package domain;

import java.math.BigDecimal;

public class Account {

    private long number;
    private Customer customerInfo;
    private BigDecimal balance;

    public Account(long number, Customer customerInfo, BigDecimal balance) {
        this.number = number;
        this.customerInfo = customerInfo;
        this.balance = balance;
    }

    public long getNumber() {
        return number;
    }

    public Customer getCustomerInfo() {
        return customerInfo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

}
