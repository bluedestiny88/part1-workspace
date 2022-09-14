package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {



  private double salary;


  public SalariedEmployee() {

  }

  public SalariedEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  //TODO: Declare and implement a constructor that takes name, hireDate, rate, and hours
  public SalariedEmployee(String name, LocalDate hireDate, double salary)  {
    super(name, hireDate);
    setSalary(salary);
  }

  @Override
  public void pay() {
    System.out.printf("%s is paid a salary of %,.2f%n",
        getName(), getSalary());
  }

  //TODO: Generate getters and setters
  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  //TODO: Override toString method

  @Override
  public String toString() {
    return String.format("%s, salary=%,.2f", super.toString(), getSalary());
  }
}