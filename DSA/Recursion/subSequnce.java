import java.util.ArrayList;

public class subSequnce {
    public static void main(String[] args) {
        subSet("", "abc");
    }
    // static void subSet(String p, String up){
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }

    //     subSet(p+up.charAt(0), up.substring(1));
    //     subSet(p, up.substring(1));
    // }

    static ArrayList<String> subSet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list =  new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> left = subSet(p+up.charAt(0), up.substring(1));
        ArrayList<String> right = subSet(p, up.substring(1));

        left.addAll(right);
    }
    
}
