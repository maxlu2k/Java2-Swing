/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide5;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author alvin
 */
public class WriteObject {

    static Person[] list = {
        new Person("Minh", 20),
        new Person("Dung", 22)
    };
    public static void main(String[] args) throws Exception{
        FileOutputStream fo = new FileOutputStream("D:\\testFileSlide\\person.dat");
        ObjectOutputStream oo = new ObjectOutputStream(fo);
        oo.writeObject(list);
        fo.close();
        
    }
}
