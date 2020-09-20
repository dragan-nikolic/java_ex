package org.dragan.adapter;

public class EmployeeAdapterLdap implements Employee {
    private EmployeeLdap employeeLdap;

    public EmployeeAdapterLdap(EmployeeLdap employeeLdap) {
        this.employeeLdap = employeeLdap;
    }

    @Override
    public String getId() {
        return employeeLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeLdap.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeLdap.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeLdap.getMail();
    }

    @Override
    public String toString() {
        return "{ID: " + getId() + ", First name: " + getFirstName() + ", Last name: " + getLastName() + ", Email: " + getEmail() + "}";
    }
}
