package _09_string_handling;

import java.util.HashMap;

public class Demo10OccurrenceOfWord {
    public static void main(String[] args) {
        String str = "good morning good morning";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String c : str.split(" ")) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map.toString());


    }
}
