package com.daiyadeguchi.unitzapi.model;

import jakarta.persistence.Entity;

@Entity
public class Courses extends BaseEntity {

    private String name;
    private String description;
    private int units;

    public Courses(String name, String description, int units) {
        this.name = name;
        this.description = description;
        this.units = units;
    }

    public Courses() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
}
