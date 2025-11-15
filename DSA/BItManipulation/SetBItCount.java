public class SetBItCount {
    public static void main(String[] args) {
        int n = 45;

        int count = 0;
        while(n>0){
            n -= (n & -n);
            count++;
        }
        System.out.println(count);
    }
}
