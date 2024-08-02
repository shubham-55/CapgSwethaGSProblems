package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PerfectNumber {
    public static void main(String[] args) {

        int n = 6;
        perfectNumber(n);
    }

    private static void perfectNumber(int n) {
     List<Integer> li = new ArrayList<>();
        for(int i = 2;i<=n/2;i++){
            if(n%2==0){
                int k = n/i;
                li.add(k);
            }
        }
        li.add(n/n);
        System.out.println(li);

       int p = li.stream().collect(Collectors.summingInt(Integer::intValue));
    System.out.println(p);

    if(n == p )
        System.out.println("perfectnumber is " + n);
    }
}
