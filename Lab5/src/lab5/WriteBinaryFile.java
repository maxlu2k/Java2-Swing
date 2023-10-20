/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author alvin
 */
public class WriteBinaryFile {

    public static void main(String[] args) throws Exception {
        FileOutputStream fo = new FileOutputStream("D:\\testFileSlide\\add.txt");
        byte[] codes = {88, 01, 04, 02};
        fo.write(codes);
        fo.close();
    }
}
