package com.mycompany.slide3.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static class Person {

        private String name, address;

        public Person() {
        }

        public Person(String name, String address) {
            this.name = name;
            this.address = address;
        }
    };

    public static void main(String[] args) {
        Map<String, Person> data = new HashMap<String, Person>();
        data.put("100111", new Person("nguyen van a", "HaNoi"));
        data.put("100222", new Person("nguyen van b", "HaNoi"));
        System.out.println(data.get("100222").name);
    }
}
