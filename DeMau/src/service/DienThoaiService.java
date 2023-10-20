/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.DienThoai;

/**
 *
 * @author alvin
 */
public class DienThoaiService {

    List<DienThoai> list = new ArrayList<>();

    public List<DienThoai> getAll() {
        return list;
    }

    public DienThoaiService() {
        list.add(new DienThoai("sp1", "vàng", "samsung", "250", 60000));
        list.add(new DienThoai("sp2", "trắng", "oppo", "250", 11000));
        list.add(new DienThoai("sp3", "đen", "iphone", "64", 26000));
        list.add(new DienThoai("sp4", "trắng", "xiaomi", "120", 25000));
        list.add(new DienThoai("sp5", "đen", "samsung", "250", 22000));
    }

    public DienThoai getAt(int index) {
        return list.get(index);
    }

    public DienThoai getLast() {
        if (list.size() > 0) {
            return list.get(list.size() - 1);
        }
        return null;
    }
}
