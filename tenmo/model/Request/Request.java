package com.techelevator.tenmo.model.Request;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Request {

    private long requestId;
    private long requester;
    private long requestee;
    private BigDecimal requestedAmount;
    private LocalDateTime timeStamp;
    private String status = "Pending";
    private String description = " ";

    public long getRequestId() {
        return requestId;
    }

    public Request() {
    }

    public Request(long requestId, long requester, long requestee, BigDecimal requestedAmount, LocalDateTime timeStamp, String status, String description) {
        this.requestId = requestId;
        this.requester = requester;
        this.requestee = requestee;
        this.requestedAmount = requestedAmount;
        this.timeStamp = timeStamp;
        this.status = status;
        this.description = description;
    }

    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }

    public long getRequester() {
        return requester;
    }

    public void setRequester(long requestor) {
        this.requester = requestor;
    }

    public long getRequestee() {
        return requestee;
    }

    public void setRequestee(long requestee) {
        this.requestee = requestee;
    }

    public BigDecimal getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(BigDecimal requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
