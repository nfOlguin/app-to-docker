package com.ejercicio.javamysqldocker.model;

import javax.persistence.*;

@Entity
@Table(name="Users")
@Access(AccessType.FIELD)
public class User extends ParentEntity{

    private static final long serialVersionUID = 7425453924182544028L;

    @Column(name="first_name", nullable = false, length = 255)
    private String firstName;

    @Column(name="second_name", nullable = true, length = 255)
    private String secondName;

    @Column(name="first_surename", nullable = false, length = 255)
    private String firstSurename;

    @Column(name="phone", nullable = true, length = 30)
    private String phone;

    @Column(name="address", nullable = false, length = 255)
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstSurename() {
        return firstSurename;
    }

    public void setFirstSurename(String firstSurename) {
        this.firstSurename = firstSurename;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
