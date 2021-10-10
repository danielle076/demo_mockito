package com.example.demo_mockito.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    private Customer customer;

    @BeforeEach
    void setUp() {
        this.customer = new Customer("Albert", "Einstein");
        this.customer.setDateOfBirth(LocalDate.of(1879, 3, 14));
    }

    @Test
    void testGetFullName() {
        String expectedFullName = "Albert Einstein";
        String actualFullName = this.customer.getFullName();
        assertEquals(expectedFullName, actualFullName);
    }

    @Test
    void testGetAge() {
        int expectedAge = 76;
        int actualAge = customer.getAge(LocalDate.of(1955, 4, 18));
        assertEquals(expectedAge, actualAge);
    }
}