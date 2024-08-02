package String;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class SecondNonRepeatedCharacter {


    public static void main(String[] args) {
        String inp1 = "Apple";
        Map<Character, Integer> map = new LinkedHashMap();

        int count;
        for(count = 0; count < inp1.length(); ++count) {
            char ch = inp1.charAt(count);
            map.put(ch, (Integer)map.getOrDefault(ch, 0) + 1);
        }

        count = 0;
        Iterator var6 = map.entrySet().iterator();

        while(var6.hasNext()) {
            Map.Entry<Character, Integer> map1 = (Map.Entry)var6.next();
            if ((Integer)map1.getValue() == 1) {
                ++count;
                if (count == 2) {
                    System.out.println("non repeating character  " + String.valueOf(map1.getKey()));
                }
            }
        }

    }
}
