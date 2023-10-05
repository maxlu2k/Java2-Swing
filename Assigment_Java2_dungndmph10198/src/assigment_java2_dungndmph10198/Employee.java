/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assigment_java2_dungndmph10198;

import java.util.UUID;

/**
 *
 * @author alvin
 */
public class Employee {

    private UUID id;
    private String fullName;
    private Integer age;
    private String email;
    private Double salary;

    public Employee() {
    }

    public Employee(UUID id, String fullName, Integer age, String email, Double salary) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.salary = salary;
    }

    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public UUID getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", fullName=" + fullName + ", age=" + age + ", email=" + email + ", salary=" + salary + '}';
    }

    public static void main(String[] args) {
        UUID uid = new UUID(0, 0);
        Employee em = new Employee(new UUID(0, 0), "", 9, "", 6.9);
        System.out.println(em.toString());
    }
}
