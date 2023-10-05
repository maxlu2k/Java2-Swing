/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slidebai1;

import java.util.Scanner;

/**
 *
 * @author alvin
 */
public class Product {

    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double getImportTax() {
        return price * 0.1;
    };

    public void inputt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Full name: ");
        this.name = sc.nextLine();

        System.out.println("Price: ");
        this.price = sc.nextDouble();
    }

    public void outputt() {
        System.out.println("--Full name: " + this.name);
        System.out.println("--Price: " + this.price);
    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập Tên: ");
//        String nameInput = input.nextLine();
//        System.out.println("Nhập Giá: ");
//        Double priceInput = input.nextDouble();
//        System.out.println("Name: " + nameInput);
//        System.out.println("Price: " + priceInput);
//    }
}
