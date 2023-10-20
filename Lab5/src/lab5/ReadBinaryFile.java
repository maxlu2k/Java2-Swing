/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.io.FileInputStream;

/**
 *
 * @author alvin
 */
public class ReadBinaryFile {

    public static void main(String[] args) throws Exception {
        FileInputStream fi = new FileInputStream("D:\\testFileSlide\\add.txt");
        byte[] codes = fi.readAllBytes();
        for (byte code : codes) {
            System.out.print(code + "");
        }
    }
}
