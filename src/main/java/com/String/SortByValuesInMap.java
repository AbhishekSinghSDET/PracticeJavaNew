package com.String;

import java.util.*;

public class SortByValuesInMap {

//    Store data in Map of type key as String and value as Integer
//    Then sort the map using Integer

    public static void main(String[] args) {
        // Step 1: Create and populate Map
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Banana", 2);
        map.put("Mango", 8);
        map.put("Orange", 3);

        // Step 2: Convert Map to List of Entries
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Step 3: Sort list by values
        list.sort(Map.Entry.comparingByValue());

        // Step 4: Preserve order using LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Step 5: Print sorted map
        sortedMap.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
