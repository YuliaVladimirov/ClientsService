package org.example.clients_service.entity;

import lombok.Getter;

@Getter
public enum Role {
    CLIENT ("Client"),
    ADMINISTRATOR ("Administrator");

    private String value;

    Role(String value) {
        this.value = value;
    }

}
