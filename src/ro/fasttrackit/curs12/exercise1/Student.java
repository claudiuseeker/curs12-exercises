package ro.fasttrackit.curs12.exercise1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Student {
    public static void main(String[] args) {
        final Map<String, Integer> nameToGrade = new HashMap<>();

        nameToGrade.put("Mihai", 9);
        nameToGrade.put("Andreea", 5);
        nameToGrade.put("Dragos", 10);
        nameToGrade.put("Cristi", 10);
        nameToGrade.put("Ana", 3);
        nameToGrade.put("Bogdan", 7);

        System.out.println(nameToGrade);

        for (Map.Entry<String, Integer> entry : nameToGrade.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (Map.Entry<String, Integer> entry : nameToGrade.entrySet()) {
            for (Map.Entry<String, Integer> entry1 : nameToGrade.entrySet()) {
                if (!entry.getKey().equals(entry1.getKey())) {
                    if (entry1.getValue().equals(entry.getValue())) {

                        map.put(entry1.getKey(), entry1.getValue());
                    }
                } else {
                    if (map.isEmpty()) {
                        map.put(entry.getKey(), entry.getValue());
                    } else {
                        if (map.containsValue(entry.getValue())) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                }

            }
        }
        System.out.println(map);

    }
}
