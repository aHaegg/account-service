package se.andreas.accountservice.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = AccountRoleSerializer.class)
public class AccountRole extends BusinessObject {

    private String name;
    private Role role;

    public AccountRole(String name, Role role) {
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
