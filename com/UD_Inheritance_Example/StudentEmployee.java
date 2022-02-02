package com.UD_Inheritance_Example;

public class StudentEmployee extends Student{
    double rateOfPerHour;
    String employeeId;


    public StudentEmployee(String firstName, String lastName, String studentId, String employeeId, double rateOfPerHour) {
        super(firstName, lastName, studentId);
        this.rateOfPerHour = rateOfPerHour;
        this.employeeId = employeeId;
    }

    public double getRateOfPerHour() {
        return rateOfPerHour;
    }

    public void setRateOfPerHour(double rateOfPerHour) {
        this.rateOfPerHour = rateOfPerHour;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String toString(){
        return super.toString() + ", employeeId: " + employeeId + " pay: " + this.rateOfPerHour;
    }
}
