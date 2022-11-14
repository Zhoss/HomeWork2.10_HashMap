package Practice.Task1_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Новая строка", 111);
        map.put("Еще строка", 222);
        map.put("Еще одна строка", 333);
        map.put("И еще одна строка", 444);

        addElement(map, "Опять новая строка", 555);
//        addElement(map, "Еще одна строка", 333);
        addElement(map, "Новая строка", 666);

        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            builder.append(entry.getKey()).append(" --> ").append(entry.getValue());
            builder.append("\n");
        }
        System.out.println(builder);
    }

    public static void addElement(Map<String, Integer> map, String str, Integer integer) {
        if (!map.containsKey(str) || !Objects.equals(map.get(str), integer)) {
            map.put(str, integer);
        } else {
            throw new IllegalArgumentException("Данная пара \"" + str +  "-" + integer + "\" уже присутсвует в коллекции");
        }
    }
}
