package se.andreas.accountservice.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = RoleInformationSerializer.class)
public class RoleInformation extends BusinessObject {

    private String name;
    private Role role;

    public RoleInformation(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public enum Role {
        CO_OWNER, OWNER
    }
}
