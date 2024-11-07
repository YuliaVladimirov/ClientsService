package org.example.clients_service.entity;

public enum Status {
    ACTIVE ("Active"),
    NON_ACTIVE("Non active");

    private String value;

    Status(String value){
        this.value = value;
    }
}
