public class LCMGCD {
    public static void main(String[] args) {
        System.out.println(lcm(59,48));
        System.out.print(gcd(59,48));

    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
    
    
    static int lcm(int a, int b){
        int result = (a * b) / gcd(a,b);
        return result;
    }
}
