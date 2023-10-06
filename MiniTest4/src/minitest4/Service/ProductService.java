/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minitest4.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import minitest4.Model.Product;

/**
 *
 * @author alvin
 */
public class ProductService {

    List<Product> list = new ArrayList<>();

    public List<Product> getAll() {
        return list;
    }

    public ProductService() {
        list.add(new Product("sp1", "Mạnh Dũng", 2000));
        list.add(new Product("sp2", "Kiên", 11450));
        list.add(new Product("sp3", "Long", 16440));
    }

    public void writeData() {
        try {
            FileOutputStream fo = new FileOutputStream("D:/mini4.dat");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void readData() {
        try {
            FileInputStream fi = new FileInputStream("D:/mini4.dat");
            ObjectInputStream oi = new ObjectInputStream(fi);
            list = (List<Product>) oi.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
