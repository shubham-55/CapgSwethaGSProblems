package Arrays;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,1,13,23,1,40};
        int firstSmallest = Integer.MAX_VALUE,
                secondSmallest = Integer.MAX_VALUE;


        for(int i =0;i< arr.length;i++){
            if (arr[i] < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            } else if (arr[i] > firstSmallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("Second smallest number" + secondSmallest);
    }
}
