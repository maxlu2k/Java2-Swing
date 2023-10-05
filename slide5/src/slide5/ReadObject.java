/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide5;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

/**
 *
 * @author alvin
 */
public class ReadObject {

    public static void main(String[] args) throws Exception {
        FileInputStream fi = new FileInputStream("D:\\testFileSlide\\person.dat");
        ObjectInputStream oi = new ObjectInputStream(fi);
        Person[] list = (Person[]) oi.readObject();
        fi.close();
        for (Person p : list) {
            System.out.print(p + "");
        }
    }
}
