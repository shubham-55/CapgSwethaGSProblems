package String;

public class Numerology {
    public static void main(String[] args) {
        int A,I,J,Q,Y =1,
         B,K,R =2,
        C,G,L,S =3, D,M,T =4,E,H,N,X =5,
                U,V,W =6,O,Z=7, F,p =8;
        String s = "S.KANAPTHY";
        int totalWeight = 0;

        for(char ch : s.toCharArray()){
            int weight = Integer.valueOf(ch);
            totalWeight += weight;
        }
        System.out.println(totalWeight);
    }

}
