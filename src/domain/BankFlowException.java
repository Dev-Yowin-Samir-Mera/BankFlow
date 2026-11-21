package domain;

import java.math.BigDecimal;

public class BankFlowException extends RuntimeException {

    public BankFlowException(String message, BigDecimal incomingAmount) {
        super(message+ " - valor ingresado: "+incomingAmount);
    }
}
