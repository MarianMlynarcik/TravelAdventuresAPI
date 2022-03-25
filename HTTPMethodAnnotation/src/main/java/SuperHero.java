package com.codecademy.ccapplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SuperHero {
    public String firstName;
    public String lastName;
    public String superPower;
}