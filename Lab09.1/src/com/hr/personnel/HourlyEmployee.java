package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class HourlyEmployee extends Employee implements TaxPayer {

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
    setRate(rate);
    setHours(hours);
  }

  @Override
  public void pay() {
    System.out.printf("%s is paid hourly, for a total of %,.2f%n",
        getName(), getHours() * getRate());
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
//  return super.toString() + ", rate = " + rate + ", hours = " + hours;
    return String.format("%s, rate = %.2f, hours = %.1f", super.toString(), getRate(), getHours());
  }

  @Override
  public void payTaxes() {
    double taxes = getRate() * getHours() * TaxPayer.HOURLY_TAX_RATE;
  //  System.out.println(getName() + " paid taxes of " + taxes);
    System.out.printf("%s paid taxes of %,.2f %n", getName(), taxes);
  }
}
