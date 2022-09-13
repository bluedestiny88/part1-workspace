package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

  private double rate;
  private double hours;


  public HourlyEmployee() {

  }

  public HourlyEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  //TODO: Declare and implement a constructor that takes name, hireDate, rate, and hours
  public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours)  {
    this(name, hireDate);
    this.rate = rate;
    this.hours = hours;
  }

  //TODO: Generate getters and setters
  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }

  //TODO: Override toString method
  @Override
  public String toString() {
    return String.format("%s, rate=%,.2f, hourly=%f", super.toString(), getRate(), getHours());
  }
}
