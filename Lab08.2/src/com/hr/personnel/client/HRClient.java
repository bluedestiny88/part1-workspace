/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new HourlyEmployee("Jason", LocalDate.of(1990, 8,
            24)));
        dept.addEmployee(new SalariedEmployee("Julie", LocalDate.of(2000, 2,
            2)));
        //TODO: Create at least one HourlyEmployee and one Salaried Employee, passing to the addEm
        dept.addEmployee(new SalariedEmployee("Elisha", LocalDate.of(2019, 6,
            12), 105000));
        dept.addEmployee(new HourlyEmployee("Patrick", LocalDate.of(2022, 8,
            28), 53.13, 40));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        //  Pay its employees
        System.out.println("\nPay employees: ");
        dept.payEmployees();
    }
}