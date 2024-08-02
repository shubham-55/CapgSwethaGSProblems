package Arrays;

public class StrongNumber {
    public static void main(String[] args) {
       int n = 145;
       int k;
       int sum = 0;
     //int k =  String.valueOf(n).length();
        while(n !=0) {
            //int fact = n/10;
            int fact = n%10;
            n = n / 10;

             k = factorial(fact);
             sum +=k;

        }

        System.out.println(sum);

    }

    private static int factorial(int fact) {
        if(fact == 0) return 1;

       return fact*factorial(fact-1);

    }
}
