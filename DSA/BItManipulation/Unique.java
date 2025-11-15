public class Unique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,7,2,4,};
        System.out.println(ans(arr));
    }
    // We have used here XOR bit
    public static int ans(int[] arr){
        int unique = 0;

        for(int n: arr){
            unique ^= n;
        }
        return unique;
    }
}
