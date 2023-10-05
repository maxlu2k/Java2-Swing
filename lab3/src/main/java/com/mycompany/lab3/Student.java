/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author alvin
 */
public class Student {

    private String name;
    private Double mark;
    private String major;

    public Student() {
    }

    public Student(String name, Double mark, String major) {
        this.name = name;
        this.mark = mark;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public Double getMark() {
        return mark;
    }

    public String getMajor() {
        return major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        if (this.mark < 3) {
            return "Kém";
        }
        if (this.mark < 5) {
            return "Yếu";
        }
        if (this.mark < 6.5) {
            return "Trung bình";
        }
        if (this.mark < 7.5) {
            return "Khá";
        }
        if (this.mark < 9) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }

    public boolean isBonus() {
        return this.mark >= 7.5;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", mark=" + mark + ", major=" + major + '}';
    }
    
}
