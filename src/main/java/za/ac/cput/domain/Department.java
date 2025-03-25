package za.ac.cput.domain;

/*
Department.java
Department Class
Author: Dean Jantjies 222644702
Date: 18 March 2025
*/

import java.util.ArrayList;

public class Department {
    private String departmentIdentity;
    private String departmentName;
    private String headDoctor;
    private int staffCount;
    private String departmentPhoneNumber;
    private String location;
    //private List<Appointments> appointments;


    private Department(Builder builder) {
        this.departmentIdentity = builder.departmentIdentity;
        this.departmentName = builder.departmentName;
        this.headDoctor = builder.headDoctor;
        this.staffCount = builder.staffCount;
        this.departmentPhoneNumber = builder.departmentPhoneNumber;
        this.location = builder.location;
        //this.appointments = builder.appointments;
    }

    public String getDepartmentIdentity() {
        return departmentIdentity;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getHeadDoctor() {
        return headDoctor;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public String getDepartmentPhoneNumber() {
        return departmentPhoneNumber;
    }

    public String getLocation() {
        return location;
    }

    /*
    public List<Appointments> getAppointments() {
        return appointments;
    }
    */

    @Override
    public String toString() {
        return "Department{" +
                "departmentIdentity=" + departmentIdentity +
                ", departmentName='" + departmentName + '\'' +
                ", headDoctor='" + headDoctor + '\'' +
                ", staffCount=" + staffCount +
                ", departmentPhoneNumber='" + departmentPhoneNumber + '\'' +
                ", location='" + location + '\'' +
                //", appointments=" + appointments +
                '}';
    }

    public static class Builder {
        private String departmentIdentity;
        private String departmentName;
        private String headDoctor;
        private int staffCount;
        private String departmentPhoneNumber;
        private String location;
        //private List<Appointments> appointments;

        public Builder setDepartmentIdentity(String departmentIdentity) {
            this.departmentIdentity = departmentIdentity;
            return this;
        }

        public Builder setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }

        public Builder setHeadDoctor(String headDoctor) {
            this.headDoctor = headDoctor;
            return this;
        }

        public Builder setStaffCount(int staffCount) {
            this.staffCount = staffCount;
            return this;
        }

        public Builder setDepartmentPhoneNumber(String departmentPhoneNumber) {
            this.departmentPhoneNumber = departmentPhoneNumber;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }
        /*
        public Builder setAppointments(List<Appointments> appointments) {
            this.appointments = appointments;
            return this;
        }
        */
        public Department build() {
            return new Department(this);
        }
    }

}
