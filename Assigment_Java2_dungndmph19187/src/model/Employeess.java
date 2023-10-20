/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.UUID;

/**
 *
 * @author alvin
 */
public class Employeess {

    private UUID id;
    private String fullName;
    private Integer age;
    private String email;
    private Double salary;

    public Employeess(UUID id, String fullName, Integer age, String email, Double salary) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.salary = salary;
    }

    public Employeess() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        UUID uid = new UUID(0, 0);
        Employeess em = new Employeess(new UUID(0, 0), "", 9, "", 6.9);
        System.out.println(em.toString());
    }
}
