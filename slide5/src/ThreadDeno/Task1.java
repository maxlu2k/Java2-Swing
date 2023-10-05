/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThreadDeno;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alvin
 */
public class Task1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Tôi đang làm việc 1 đưuocj" + ((i + 1) * 10.0 + "%"));
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
