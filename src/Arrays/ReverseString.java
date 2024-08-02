package Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String[] str = "reverse".split("");
        //int i = 0, j= str.length()-1;
        for(int i = 0,j=str.length-1;i<=j;i++,j--){
           String ch = str[i];
           str[i] =str[j];
           str[j] = ch;
        }
        for(int i = 0; i<= str.length-1;i++)
        System.out.print(str[i]);


    }
}
