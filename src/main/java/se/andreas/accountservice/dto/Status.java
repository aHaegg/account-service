package se.andreas.accountservice.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = StatusSerializer.class)
public class Status extends BusinessObject {

    private final StatusType statusType;

    public Status(StatusType statusType) {
        this.statusType = statusType;
    }

    public StatusType getStatusType() {
        return statusType;
    }

    public enum StatusType {
        ACTIVE
    }
}
