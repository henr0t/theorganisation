package com.theorganisation.domain;

import javax.persistence.Entity;

@Entity
public class Consultant extends Employee{
    private final String titel = "Consultant";

    public String getTitel() {
        return titel;
    }
}
