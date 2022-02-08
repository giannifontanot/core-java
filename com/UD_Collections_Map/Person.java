package com.UD_Collections_Map;

public class Person {
    private String name;
    private String email;

    @Override
    public String toString() {
        return this.name + " " + this.email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

