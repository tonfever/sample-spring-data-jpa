package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class EmployeeLeave {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String employeeId;

    private String nickName;

    private String firstName;

    private String surname;

    private Double annualLeave;

    private Double takenLeave;

    private Double remaining;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getAnnualLeave() {
        return annualLeave;
    }

    public void setAnnualLeave(Double annualLeave) {
        this.annualLeave = annualLeave;
    }

    public Double getTakenLeave() {
        return takenLeave;
    }

    public void setTakenLeave(Double takenLeave) {
        this.takenLeave = takenLeave;
    }

    public Double getRemaining() {
        return remaining;
    }

    public void setRemaining(Double remaining) {
        this.remaining = remaining;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
