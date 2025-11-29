import java.util.HashMap;

public class excercise2 {
    public static void main(String[] args) {
        String s = "aabbbbeeeeffggg";
        StringBuilder sb = new StringBuilder();
        // int count = 1;
        // for(int i = 0; i<s.length()-1; i++){
        //     if(s.charAt(i) != s.charAt(i+1)){
        //         sb.append(s.charAt(i));
        //         sb.append(count);
        //         count = 1;
        //     }

        //     if(s.charAt(i) == s.charAt(i+1)){
        //         count++;
        //     }

        //     if(i == s.length()-2){
        //         sb.append(s.charAt(s.length()- 1));
        //         sb.append(count);
        //     }
        // }
        // System.out.println(sb.toString());
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i= 0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(char ch: map.keySet()){
            sb.append(ch);
            sb.append(map.get(ch));
        }

        System.out.println(sb.toString());
    }
}
