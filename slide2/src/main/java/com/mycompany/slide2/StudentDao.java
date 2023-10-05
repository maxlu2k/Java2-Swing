/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slide2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvin
 */
public interface StudentDao {
    void add(Student st);
    void update(Student st);
    void delete(String fullname);
    Student find(String fullname);
}
