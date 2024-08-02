package Arrays;

public class PrimeFraction {
    public static void main(String[] args) {
        int n = 24;//2,2,2,3

        while(n/2==0){
            System.out.println(2 + "");
            n/=10;
        }
        for(int i = 3;i<=n/2;i++){
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2)
            System.out.print(n);

    }
}
