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

    public void setNumber(long number) {
        this.number = number;
    }

    public Customer getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(Customer customerInfo) {
        this.customerInfo = customerInfo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

}
