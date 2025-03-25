package za.ac.cput.factory;

/*
DepartmentFactory.java
Department Factory
Author: Dean Jantjies 222644702
Date: 22 March 2025
*/

import za.ac.cput.domain.Department;

public class DepartmentFactory {

    public static Department createDepartment(String departmentIdentity, String departmentName, String headDoctor, Integer staffCount, String departmentPhoneNumber, String location) {

    // If any field is left empty, return null
        if (departmentIdentity == null || departmentName == null || headDoctor == null || staffCount == null || departmentPhoneNumber == null || location == null) {
            return null;
        }

    // Validation checks: Throw an error for invalid values
        if (departmentIdentity.isEmpty()) {
            throw new IllegalArgumentException("Dapartment ID cannot be empty.");
        }
        if (departmentName.isEmpty()) {
            throw new IllegalArgumentException("Head doctor name cannot be empty.");
        }
        if (headDoctor.isEmpty()) {
            throw new IllegalArgumentException("Head doctor name cannot be empty.");
        }
        if (staffCount < 0) {
            throw new IllegalArgumentException("Staff count cannot be negative.");
        }
        if (departmentPhoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Department phone number cannot be empty.");
        }
        if (location.isEmpty()) {
            throw new IllegalArgumentException("Location cannot be empty.");
        }

        return new Department.Builder()
                .setDepartmentIdentity(departmentIdentity)
                .setDepartmentName(departmentName)
                .setHeadDoctor(headDoctor)
                .setStaffCount(staffCount)
                .setDepartmentPhoneNumber(departmentPhoneNumber)
                .setLocation(location)
                .build();
    }
}
