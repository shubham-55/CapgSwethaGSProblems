package String;

import java.util.HashSet;
import java.util.Set;

public class RemoveDublicates {
    public static void main(String[] args) {
        String s = "good good day day bye bye";

       String[] strArray =  s.toLowerCase().split(" ");

        Set<String> set = new HashSet<>();
        for(String str :strArray){
            set.add(str);
        }
       System.out.println(set);
    }
}
