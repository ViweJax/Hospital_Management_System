package za.ac.cput.domain;
/*
Doctor.java
Doctor Class
Author: Ashlyn Jordan January 230577644
Date: 18 March 2025
*/

public class Doctor {
    private String doctorID;
    private String firstName;
    private String lastName;
    private String specialization;
    private int licenceNumber;
    private int yearsOfExperience;
    private String hospitalAffiliation;
    private String email;
    private String gender;
    private String availability;

    public Doctor() {

    }
    public Doctor(Builder builder) {
        this.doctorID = builder.doctorID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.specialization = builder.specialization;
        this.licenceNumber = builder.licenceNumber;
        this.yearsOfExperience = builder.yearsOfExperience;
        this.hospitalAffiliation = builder.hospitalAffiliation;
        this.email = builder.email;
        this.gender = builder.gender;
        this.availability = builder.availability;
    }

    public String getDoctorID() {
    return doctorID;
}

        public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getSpecialization() {
        return specialization;
    }
    public int getLicenceNumber() {
        return licenceNumber;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public String getHospitalAffiliation() {
        return hospitalAffiliation;
    }
    public String getEmail() {
        return email;
    }
    public String getGender() {
        return gender;
    }
    public String getAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorID='" + doctorID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialization='" + specialization + '\'' +
                ", licenceNumber=" + licenceNumber +
                ", yearsOfExperience=" + yearsOfExperience +
                ", hospitalAffiliation='" + hospitalAffiliation + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }

    public static class Builder {
        private String doctorID;
        private String firstName;
        private String lastName;
        private String specialization;
        private int licenceNumber;
        private int yearsOfExperience;
        private String hospitalAffiliation;
        private String email;
        private String gender;
        private String availability;

        public Builder setdoctorID(String doctorID) {
            this.doctorID = doctorID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setSpecialization(String specialization) {
            this.specialization = specialization;
            return this;
        }

        public Builder setLicenceNumber(int licenceNumber) {
            this.licenceNumber = licenceNumber;
            return this;
        }

        public Builder setYearsOfExperience(int yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
            return this;
        }

        public Builder setHospitalAffiliation(String hospitalAffiliation) {
            this.hospitalAffiliation = hospitalAffiliation;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setAvailability(String availability) {
            this.availability = availability;
            return this;
        }

        public Builder copy(Doctor doctor) {
            this.doctorID = doctor.getDoctorID();
            this.firstName = doctor.getFirstName();
            this.lastName = doctor.getLastName();
            this.specialization = doctor.getSpecialization();
            this.licenceNumber = doctor.getLicenceNumber();
            this.yearsOfExperience = doctor.getYearsOfExperience();
            this.hospitalAffiliation = doctor.getHospitalAffiliation();
            this.email = doctor.getEmail();
            this.gender = doctor.getGender();
            this.availability = doctor.getAvailability();
            return this;
        }

        public Doctor build() {
            return new Doctor(this);
        }

    }

    }
