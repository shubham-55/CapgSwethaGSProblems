package String;

public class RunningLengthOfString {
    public static void main(String[] args) {
        String str = "aaabbaa";

        String input = compressString(str);

        System.out.println(input);
    }

    private static String compressString(String str) {
        if(str == null || str.isEmpty()) return str;

        StringBuilder compress = new StringBuilder();
        int count =1;
        for(int i =0;i<str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compress.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        compress.append(str.charAt(str.length()-1)).append(count);

        return compress.toString();
    }
}
