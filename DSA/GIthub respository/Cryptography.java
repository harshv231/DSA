import java.util.*;
public class Cryptography {
    public static HashMap<Character, Character> buildMap(int shift) {
        HashMap<Character, Character> map = new HashMap<>();
        

        for(char i = 'a'; i<='z'; i++){
            char shifted = (char)((i - 'a' + shift)%26);

            map.put(i, shifted);
        }

        return map;
    }

    public static String encrypt(String text, int shift){
        // Char[] arr = text.toStringArray();
        HashMap<Character, Character> map = buildMap(shift);
        StringBuilder sb = new StringBuilder();

        for(int c: text.toCharArray()){
            
        }
    }
    public static void main(String[] args){

    }
}
