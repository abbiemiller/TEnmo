package com.techelevator.tenmo.Exceptions.Transfer;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( code = HttpStatus.NOT_ACCEPTABLE, reason = "Transfer Receiver Account cannot match User Account")
public class TransferSameAccountException extends Exception {
    private static final long serialVersionUID = 1L;

    public TransferSameAccountException() {
        super("Transfer Receiver Account cannot match User Account");
    }
}

