package com.coolie.model;

public class CooliePayroll {
    private Long coolieId;
    private double salary;
    private double bonus;
    private double deductions;

    public CooliePayroll() {}

    public CooliePayroll(Long coolieId, double salary, double bonus, double deductions) {
        this.coolieId = coolieId;
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    // Getters and setters
    public Long getCoolieId() { return coolieId; }
    public void setCoolieId(Long coolieId) { this.coolieId = coolieId; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    public double getDeductions() { return deductions; }
    public void setDeductions(double deductions) { this.deductions = deductions; }
}
