package se.andreas.accountservice.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = StatusInformationSerializer.class)
public class StatusInformation extends BusinessObject {

    private final Status status;

    public StatusInformation(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public enum Status {
        ACTIVE
    }
}
