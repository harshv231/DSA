package String;

public class Performance {
    public static void main(String[] args) {
        String alph = "";
        for(int i = 0; i<26; i++){
            char ch = (char)('a'+i);
            alph += ch;
        }
        System.out.println(alph);
    }
}
// everytime it creates a new object because the string are immutable

