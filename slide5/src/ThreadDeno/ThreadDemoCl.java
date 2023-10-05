/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThreadDeno;

/**
 *
 * @author alvin
 */
public class ThreadDemoCl {

    public static void main(String[] args) throws InterruptedException {
        Task1 t1 = new Task1();
        Thread t2 = new Thread(new Task2());
        t1.start();
        t2.start();
    }

}
