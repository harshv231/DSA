import java.util.*;

public class Permutation {
    // public static void main(String[] args) {
    //     List<String> list = pad("", "12");
    //     System.out.println(list);
    // }
    // static ArrayList<String> permutations(String p, String up){
    //     if(up.isEmpty()){
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }
    //     ArrayList<String> ans = new ArrayList<>();
    //     char ch= up.charAt(0);

    //     for(int i = 0; i<=p.length(); i++){
    //         String f = p.substring(0, i);
    //         String s = p.substring(i, p.length());
    //         ans.addAll(permutations(f+ch+s, up.substring(1)));
    //     }
    //     return ans;
    // }

    // static List<String> pad(String p, String up){
    //     if(up.isEmpty()){
    //         List<String> list = new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }

    //     int ch = up.charAt(0) - '0';
    //     List<String> ans = new ArrayList<>();

    //     for(int i = (ch - 1)*3; i< ch*3; i++){
    //         char digit = (char)(i + 'a');
    //         ans.addAll(pad(p+digit, up.substring(1)));
    //     }
    //     return ans;
    // }
    public static void main(String[] args) {
        dice("", 4);
    }
    static void dice(String p, int up){
        if(up == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i<=6 && i<=up; i++){
            dice(p + i, up-i);
        }
    }
}
