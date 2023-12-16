package com.example.interfaces;

public class Manager implements Employee{
    private String name;
    private double baseSalary;
    private double bonusPercentage;

    // Constructor
    public Manager(String name, double baseSalary, double bonusPercentage) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public String getRole() {
        return "Manager";
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (baseSalary * bonusPercentage / 100);
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager: " + name);
        System.out.println("Role: " + getRole());
        System.out.println("Salary: $" + calculateSalary());
    }
}
