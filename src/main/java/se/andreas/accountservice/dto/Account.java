package se.andreas.accountservice.dto;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String name;
    private List<BusinessObject> businessObjects;

    public Account() {
    }

    public Account(String name) {
        this.name = name;
        this.businessObjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BusinessObject> getBusinessObjects() {
        return businessObjects;
    }

    public void setBusinessObjects(List<BusinessObject> businessObjects) {
        this.businessObjects = businessObjects;
    }
}
