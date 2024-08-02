package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class MaxConcatenation {
    public static void main(String[] args) {
        Integer[] numbers = {8,9, 7, 4, 3};

              Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                String order1 = a.toString() + b.toString();
                String order2 = b.toString() + a.toString();
                return order2.compareTo(order1);
            }
        });


        StringBuilder maxNumber = new StringBuilder();
        for (Integer num : numbers) {
            maxNumber.append(num.toString());
        }

        System.out.println(maxNumber.toString());
    }
}