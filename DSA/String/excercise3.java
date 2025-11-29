public class excercise3 {
    public static void main(String[] args) {
        String s = "344523";
        int max = -1;
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if((s.charAt(i)-'0') > max){
                count++;
                max = s.charAt(i) - '0';
            }
        }
        System.out.println(count);
    }
}
