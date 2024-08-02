package String;

import java.util.HashSet;
import java.util.Set;

public  class Panagram {

    //    Check the given String is String.FrequencyOfCharacter.Panagram or Not.
    //    A. Check the string is String.FrequencyOfCharacter.Panagram or not
    //    B. If not panagram , then print the missing letters

    public static void main(String[] args) {
        String span = "The uick brown fox jumps over the lazy dog";

        MissingLetter(span);

        String str = span.toLowerCase().replace(" ", "");

        Set<Character> set = new HashSet<>();

        for (char s : str.toCharArray()) {
            if (Character.isLetter(s))
                set.add(s);
        }

        if (set.size() == 26) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    /**
     * Second part of panagram
     * @param span
     */
    private static void MissingLetter(String span) {

        String str = span.toLowerCase().replace(" ", "");

        HashSet<Character> allLetters = new HashSet<>();


        for (char c : str.toCharArray()) {

            if (Character.isLetter(c)) {
                allLetters.add(c);
            }
        }
        for (char c = 'a'; c <= 'z'; c++) {
            if( allLetters.add(c)){
                System.out.println("MIssing letter is " + c);
            }
        }

    }
}
