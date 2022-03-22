package se.andreas.accountservice.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Account {

    private final String name;
    private final List<BusinessObject> businessObjects;

    public Account(String name) {
        this.name = name;
        this.businessObjects = new ArrayList<>();
    }

    public List<BusinessObject> getBusinessObjects() {
        return businessObjects;
    }
}
