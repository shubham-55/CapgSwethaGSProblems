package String;

public class SubStringPresent {
    public static void main(String[] args) {
        String str = "padmaja";
        String s = "maja";
       boolean b = isPartofString(str,s);
       System.out.println(b);
    }

    private static boolean isPartofString(String str , String s) {

        String str1 = str + str;
        if(str1.contains(s)){
            return true;
        }
        return false;
    }
}
