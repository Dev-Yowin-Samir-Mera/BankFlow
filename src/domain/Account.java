package domain;

import java.math.BigDecimal;

public class Account {

    private long number;
    private Customer customerInfo;
    private BigDecimal balance;

    public Account(long number, Customer customerInfo, BigDecimal balance) {
        this.number = number;
        this.customerInfo = customerInfo;
        allocateBalance(isValidaBalanceCreateAccount(balance), balance);
    }

    private boolean isValidaBalanceCreateAccount(BigDecimal balance){
        return (balance != null && balance.signum() >= 0);
    }

    private boolean isValidBalance(BigDecimal balance) {
        return (balance != null && balance.signum() > 0);
    }

    private void allocateBalance(boolean isValid, BigDecimal balance) {
        if (!isValid) throw new BankFlowException("Error, valor no valido", balance);
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

    public void deposit(BigDecimal amount) {
        if (isValidBalance(amount)){
            this.balance = this.balance.add(amount);
        }else{
            throw new BankFlowException("Error, valor no valido", balance);
        }
    }

    public void withdraw(BigDecimal amount) {
        if (!isValidBalance(amount))  throw new BankFlowException("Error, valor no valido", balance);
        if (this.balance.compareTo(amount) < 0) throw new BankFlowException("Error, no es posible retirar", amount);
        this.balance = this.balance.subtract(amount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", customerInfo=" + customerInfo +
                ", balance=" + balance +
                '}';
    }
}
