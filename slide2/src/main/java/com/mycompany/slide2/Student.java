/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slide2;

/**
 *
 * @author alvin
 */
public class Student {

    private String fullname;
    private String Email;
    private String Password;
    private Boolean Gender;
    private String Subject;
    private String Favorites;

    public Student() {
    }

    public Student(String fullname, String Email, String Password, Boolean Gender, String Subject, String Favorites) {
        this.fullname = fullname;
        this.Email = Email;
        this.Password = Password;
        this.Gender = Gender;
        this.Subject = Subject;
        this.Favorites = Favorites;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setGender(Boolean Gender) {
        this.Gender = Gender;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public void setFavorites(String Favorites) {
        this.Favorites = Favorites;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public Boolean getGender() {
        return Gender;
    }

    public String getSubject() {
        return Subject;
    }

    public String getFavorites() {
        return Favorites;
    }

    @Override
    public String toString() {
        return "Student{" + "fullname=" + fullname + ", Email=" + Email + ", Password=" + Password + ", Gender=" + Gender + ", Subject=" + Subject + ", Favorites=" + Favorites + '}';
    }

}
