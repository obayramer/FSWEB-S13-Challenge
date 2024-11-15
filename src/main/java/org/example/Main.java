package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        executeProgram();
    }

    public static void executeProgram() {
        Healthplan healthplan1 = new Healthplan(1, "Basic Health", Plan.BASIC);
        System.out.println(healthplan1);

        String[] employeePlans = new String[3];
        Employee employee1 = new Employee(1, "John Doe", "johndoe@example.com", "password123", employeePlans);
        employee1.addHealthPlan(0, "Basic Health");
        employee1.addHealthPlan(0, "Another Plan"); // Aynı index doluysa mesaj verir
        System.out.println(employee1);

        String[] developers = new String[2];
        Company company1 = new Company(1, "Tech Corp", 50000.0, developers);
        company1.addEmployee(0, "Alice");
        company1.addEmployee(0, "Bob"); // Aynı index doluysa mesaj verir
        System.out.println(company1);
    }
}