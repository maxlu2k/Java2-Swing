/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slidebai1;

/**
 *
 * @author alvin
 */
public class NoTaxProduct extends Product {

    public NoTaxProduct(String name, double price) {
        super(name, price);
    };
    @Override
    public double getImportTax() {
        return 0;
    };
     public static void main(String[] args) {
        Product ip15 = new Product("Ip15", 15.5);
        NoTaxProduct amp = new NoTaxProduct("Ampicilin", 0.01);
         System.out.println("ip15: " + ip15.getImportTax());
         System.out.println("AMP: " + amp.getImportTax());
    }
}
