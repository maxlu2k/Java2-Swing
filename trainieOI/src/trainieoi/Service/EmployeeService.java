/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trainieoi.Service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import trainieoi.Model.Employee;

/**
 *
 * @author Admin
 */
public class EmployeeService {

    List<Employee> list = new ArrayList<>();

    public List<Employee> getAll() {
        return list;
    }

    public EmployeeService() {
        list.add(new Employee("Mạnh Dũng", 22));
        list.add(new Employee("Bình Minh", 20));
        list.add(new Employee("Kiên Bùi", 21));
        list.add(new Employee("Kiên xu", 19));
        list.add(new Employee("Lâm Dương", 24));
    }

    public void writeData() {
        try {
            FileOutputStream fo = new FileOutputStream("D:/rainie.dat");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void readData() {
        try {
            FileInputStream fi = new FileInputStream("D:/rainie.dat");
            ObjectInputStream oi = new ObjectInputStream(fi);
            list = (List<Employee>) oi.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
