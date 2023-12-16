package com.example.interfaces;

public class Developer implements Employee{
    private String name;
    private double baseSalary;
    private int yearsOfExperience;

    public Developer(String name, double baseSalary, int yearsOfExperience) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String getRole() {
        return "Developer";
    }

    @Override
    public double calculateSalary() {
        // Additional logic can be applied, for example, based on experience
        return baseSalary + (1000 * yearsOfExperience);
    }

    @Override
    public void displayInfo() {
        System.out.println("Developer: " + name);
        System.out.println("Role: " + getRole());
        System.out.println("Salary: $" + calculateSalary());
    }
}
