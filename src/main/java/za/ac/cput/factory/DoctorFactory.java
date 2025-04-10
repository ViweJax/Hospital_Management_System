package za.ac.cput.factory;
import za.ac.cput.domain.Doctor;
import za.ac.cput.util.Helper;

/*
DoctorFactory.java
DoctorFactory Class
Author: Ashlyn Jordan January 230577644
Date: 22 March 2025
*/

public class DoctorFactory {
    public static Doctor createDoctor(String doctorID, String firstName, String lastName, String specialization,
                                      int licenceNumber, int yearsOfExperience,
                                      String hospitalAffiliation, String email, String gender, String availability) {

        if (doctorID == null || firstName == null || lastName == null || specialization == null || hospitalAffiliation == null || gender == null || availability == null) {
            return null;
        }

        if (doctorID.isEmpty()) {
            throw new IllegalArgumentException("Doctor ID cannot be empty");
        }
        if (firstName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty.");
        }
        if (lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be empty.");
        }
        if (licenceNumber < 0) {
            throw new IllegalArgumentException("Licence Number cannot be negative.");
        }
        if (specialization.isEmpty()) {
            throw new IllegalArgumentException("Specialization cannot be empty.");
        }
        if (hospitalAffiliation.isEmpty()) {
            throw new IllegalArgumentException("Hospital affiliation cannot be empty.");
        }
        if (gender.isEmpty()) {
            throw new IllegalArgumentException("Gender cannot be empty.");
        }
        if (availability.isEmpty()) {
            throw new IllegalArgumentException("Availability cannot be empty.");
        }

        if (Helper.isNullOrEmpty(email)) {
            return null;
        }


        return new Doctor.Builder()
                .setdoctorID(doctorID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setSpecialization(specialization)
                .setHospitalAffiliation(hospitalAffiliation)
                .setEmail(email)
                .setGender(gender)
                .setAvailability(availability)
                .setLicenceNumber(licenceNumber)
                .setYearsOfExperience(yearsOfExperience)
                .build();
    }
}
