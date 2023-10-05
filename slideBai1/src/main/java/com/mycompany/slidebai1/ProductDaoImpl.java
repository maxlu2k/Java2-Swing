
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
public class ProductDaoImpl implements DAO {

    @Override
    public void add(Product pr) {
        System.out.println("Add");
    }

    @Override
    public void update(Product pr) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Product findByName(String name) {
        return new Product(name,0.0);
    }

  

}
