package Arrays;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n = 153;int a =0;
        int temp = n;
        int k = String.valueOf(n).length();
        while(n !=0){
            int digit = n%10;
            n = n/10;
            a +=  cube(digit,k);
        }
        if(a==temp){
            System.out.println("Armstronnumber is " + temp);
        }
    }

    private static int cube(int digit, int k) {
        int product = 1;
        for(int i =1;i<=k;i++){
             product *= digit;
        }
        return product;
    }
}
