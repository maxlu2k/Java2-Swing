/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvin
 */
public class MayTinhService {

    List<MayTinh> list = new ArrayList<>();

    public MayTinhService() {
        list.add(new MayTinh("01", "Dell inprion", 22, "Dell"));
        list.add(new MayTinh("02", "HP ip", 210, "Hp"));
        list.add(new MayTinh("03", "AS x", 22, "Apple"));
        list.add(new MayTinh("04", "AC ax", 22, "Acer"));
    }

    public List<MayTinh> getAll() {
        return list;
    }

    public MayTinh getAt(int i) {
        return list.get(i);
    }

    public MayTinh getLast() {
        return list.get(list.size() - 1);
    }

    public void add(MayTinh mt) {
        list.add(mt);
    }
}
