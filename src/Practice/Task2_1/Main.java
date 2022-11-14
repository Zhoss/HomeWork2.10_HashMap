package Practice.Task2_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("String1", new ArrayList<>(List.of((int) (Math.random() * 1000), (int) (Math.random() * 1000), (int) (Math.random() * 1000))));
        map.put("String2", new ArrayList<>(List.of((int) (Math.random() * 1000), (int) (Math.random() * 1000), (int) (Math.random() * 1000))));
        map.put("String3", new ArrayList<>(List.of((int) (Math.random() * 1000), (int) (Math.random() * 1000), (int) (Math.random() * 1000))));
        map.put("String4", new ArrayList<>(List.of((int) (Math.random() * 1000), (int) (Math.random() * 1000), (int) (Math.random() * 1000))));
        map.put("String5", new ArrayList<>(List.of((int) (Math.random() * 1000), (int) (Math.random() * 1000), (int) (Math.random() * 1000))));

        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            builder.append(entry.getKey()).append(" --> ").append(entry.getValue());
            builder.append("\n");
        }
        System.out.println(builder);

        Map<String, Integer> anotherMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            Integer total = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                total += entry.getValue().get(i);
            }
            anotherMap.put(entry.getKey(), total);
        }

        StringBuilder anotherBuilder = new StringBuilder();
        for (Map.Entry<String, Integer> entry : anotherMap.entrySet()) {
            anotherBuilder.append(entry.getKey()).append(" --> ").append(entry.getValue());
            anotherBuilder.append("\n");
        }
        System.out.println(anotherBuilder);
    }
}
