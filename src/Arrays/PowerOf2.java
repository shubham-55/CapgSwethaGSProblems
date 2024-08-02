package Arrays;

public class PowerOf2 {
    public static void main(String[] args) {
        int power = 100;
        int n = 2;

       boolean b = checkPower(power, 2);
       System.out.println(b);
    }
        private static boolean checkPower(int power, int n) {
            if (power == 1) {
                return true;
            }
             if (power <= 0 || power % 2 != 0) {
                return false;
            }
             return checkPower(power / 2,n);
        }
}
