package Practice.Task2_2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Строка 1");
        map.put(2, "Строка 2");
        map.put(3, "Строка 3");
        map.put(4, "Строка 4");
        map.put(5, "Строка 5");
        map.put(6, "Строка 6");
        map.put(7, "Строка 7");
        map.put(8, "Строка 8");
        map.put(9, "Строка 9");
        map.put(10, "Строка 10");

        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            builder.append(entry.getKey()).append(" --> ").append(entry.getValue());
            builder.append("\n");
        }
        System.out.println(builder);
    }
}
