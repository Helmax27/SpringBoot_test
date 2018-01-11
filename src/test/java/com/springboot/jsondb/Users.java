package com.springboot.jsondb;

public class Users {

    private long id;
    private String name;
    private String address;
    private String phone;

    public long getId() {
        return id;
    }

    public Users withId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Users withName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Users withAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Users withPhone(String phone) {
        this.phone = phone;
        return this;
    }
}
