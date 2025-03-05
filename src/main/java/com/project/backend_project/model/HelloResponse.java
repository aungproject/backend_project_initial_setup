package com.project.backend_project.model;

import java.util.Objects;

public class HelloResponse {
    private String name;

    public HelloResponse() {
    }

    public HelloResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelloResponse that = (HelloResponse) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "HelloResponse{" +
                "name='" + name + '\'' +
                '}';
    }
}
