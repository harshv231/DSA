public class excercise {
    public static void main(String[] args) {
        String s = "Move#Hash#to#Front";
        StringBuilder letter = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch == '#'){
                sb.append('#');
            }
            if(ch != '#'){
                letter.append(ch);
            }
        }
        System.out.println(sb.toString() + letter.toString());
    }
}
