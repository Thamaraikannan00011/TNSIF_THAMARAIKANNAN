package com.Thamaraikannan.assignment1;

import com.Thamaraikannan.assignment1.Employees.Developer;
import com.Thamaraikannan.assignment1.Employees.Manager;
import com.Thamaraikannan.assignment1.Utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Developer developer = new Developer();

        EmployeeUtilities.displayEmployeeInfo(manager);
        EmployeeUtilities.displayEmployeeInfo(developer);
    }
}
