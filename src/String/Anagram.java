package String;

public class Anagram {
    public static void main(String[] args) {
        String firstString = "cat";
        String secondString = "tac8";
        System.out.println(isAnagram(firstString, secondString));
    }

    public static boolean isAnagram(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        } else if (firstString.equals(secondString)) {
            return false;
        } else {
            int[] primeNumbers = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
            long p1 = 1L;
            long p2 = 1L;

            for(int i = 0; i < firstString.length(); ++i) {
                p1 *= (long)primeNumbers[firstString.charAt(i) - 97];
                p2 *= (long)primeNumbers[secondString.charAt(i) - 97];
            }

            return p1 == p2;
        }
    }
}

