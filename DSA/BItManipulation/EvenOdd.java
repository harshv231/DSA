public class EvenOdd {
    public static void main(String[] args) {
        int n = 64;

        boolean ans = evenOrOdd(n);
        System.out.println(ans);
    }
    // we have used here AND bit
    public static boolean evenOrOdd(int n){

    if((n & 1)  == 1){
        System.out.println("It is Odd");
        return false;
    }
    System.out.println("It is Even");
    return true;
 }
}
