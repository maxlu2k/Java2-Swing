/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import model.SinhVien;

/**
 *
 * @author alvin
 */
public class SinhVienService {

    List<SinhVien> list = new ArrayList<>();

    public List<SinhVien> getAll() {
        return list;
    }

    public SinhVienService() {
        list.add(new SinhVien("sv1", "Dũng", 10));
        list.add(new SinhVien("sv2", "Dương", 9));
        list.add(new SinhVien("sv3", "Tiến", 5));
        list.add(new SinhVien("sv4", "Quân", 8));
        list.add(new SinhVien("sv5", "Thiện", 6));
        list.add(new SinhVien("sv6", "Minh", 7));
        list.add(new SinhVien("sv7", "Hằng", 5));
    }

    public List<SinhVien> search(String ma) {
        List<SinhVien> result = new ArrayList<>();
        for (SinhVien sv : list) {
            if (sv.getMa().contains(ma)) {
                result.add(sv);
            }

        }
        return result;
    }

    public List<SinhVien> sort() {
        List<SinhVien> result = new ArrayList<>(list);
        Collections.sort(result, (sv1, sv2) -> Integer.compare(sv2.getDiem(), sv1.getDiem()));
        return result;
    }

}
