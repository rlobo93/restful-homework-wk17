package com.herokuapp.model;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class StudentPojo {



    private String firstname;
    private String lastname;
    private Integer totalPrice;
    private Boolean depositpaid;
    private String additionalneeds;



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getTotalprice() {
        return totalPrice;
    }

    public void setTotalprice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Boolean getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(Boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }





}

