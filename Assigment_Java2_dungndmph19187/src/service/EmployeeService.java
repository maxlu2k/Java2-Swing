/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import model.Employee;
import service.impl.EmployeeNameComparator;

/**
 *
 * @author alvin
 */
public class EmployeeService {

    List<Employee> list = new ArrayList<>();

    public List<Employee> getAll() {
        return list;
    }

    public EmployeeService() {
        list.add(new Employee("nv1", "manhdung", 20, "gmail", 30.2));
        list.add(new Employee("nv2", "minh", 22, "gmail", 10.2));
        list.add(new Employee("nv3", "chau", 23, "gmail", 21.2));
        list.add(new Employee("nv4", "toan", 24, "gmail", 22.2));
        list.add(new Employee("nv5", "huong", 19, "gmail", 50.2));
    }

    public List<Employee> search(String ma) {
        List<Employee> result = new ArrayList<>();
        boolean found = false;
        for (Employee em : list) {
            if (em.getId().contains(ma)) {
                result.add(em);
                found = true;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Không có nhân viên với mã " + ma + " như vậy!");
            return list;
        }
        return result;
    }

    public List<Employee> sortBySalaryDesc() {
        Collections.sort(list, new EmployeeNameComparator());
        return list;
    }

    public void writeData() {
        try {
            FileOutputStream fo = new FileOutputStream("D:/ass2.dat");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(list);
            oo.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void readData() {
        try {
            FileInputStream fi = new FileInputStream("D:/ass2.dat");
            ObjectInputStream oi = new ObjectInputStream(fi);
            list = (List<Employee>) oi.readObject();
            oi.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
