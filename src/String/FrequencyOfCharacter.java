package String;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter {

    public static void main(String[] args) {
//        frequency of char  ex:
//        input: "aaabbaa"  expected output: a5b2

        String s = "aaabbaa";
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        for (Map.Entry<Character, Integer> map1 : map.entrySet()) {
            // System.out.println("Frequencycount");
            System.out.print(map1.getKey().toString() + map1.getValue());
        }
    }
}
