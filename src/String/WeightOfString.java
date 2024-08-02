package String;

public class WeightOfString {
    public static void main(String[] args) {
        String s = "apPle";
        int sum_weight = 0;

        s= s.toLowerCase();
       for(char ch:s.toCharArray()){
          int  weight = ch -'a'+1;
          sum_weight += weight;
       }
       System.out.println(sum_weight);
    }
}
