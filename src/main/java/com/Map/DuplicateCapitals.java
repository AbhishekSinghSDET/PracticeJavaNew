package com.Map;

import java.util.*;

public class DuplicateCapitals {

    //Print State number whose capital is more than once

    public static void main(String[] args) {
        // Map of state -> capital
        Map<String, String> stateCapital = new HashMap<>();
        stateCapital.put("State1", "CapitalA");
        stateCapital.put("State2", "CapitalB");
        stateCapital.put("State3", "CapitalA");
        stateCapital.put("State4", "CapitalC");
        stateCapital.put("State5", "CapitalB");

        // Set to track duplicates
        Set<String> duplicates = new HashSet<>();
        Set<String> seen = new HashSet<>();


        // Find duplicate capitals
        for (String capital : stateCapital.values()) {
            if (!seen.add(capital)) {
                duplicates.add(capital); // add to duplicates if already seen
            }
        }


        // Print states with duplicate capitals
        System.out.println("States with duplicate capitals:");
        for (Map.Entry<String, String> entry : stateCapital.entrySet()) {
            if (duplicates.contains(entry.getValue())) {
                System.out.println("State: " + entry.getKey() + ", Capital: " + entry.getValue());
            }
        }
    }
}