/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slidebai1;

import java.util.List;

/**
 *
 * @author alvin
 */
public interface DAO{
    void add(Product pr);
    void update(Product pr);
    void delete(String name);
    Product findByName(String name);
    
    
}
