/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
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
        list.add(new SinhVien("sv1", "Dũng", true, 2002));
        list.add(new SinhVien("sv2", "Trang", false, 2001));
        list.add(new SinhVien("sv3", "Kiên", true, 2002));
        list.add(new SinhVien("sv4", "Minh", false, 2000));

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

}
