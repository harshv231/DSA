import java.util.Arrays;
public class twoUnique {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4};

        System.out.println(Arrays.toString(ans(arr)));
    }
    public static int[] ans(int[] arr){
        int xor = 0;
        for(int n: arr){
            xor ^= n;
        }
        int mask = xor & -xor;
        int a= 0;
        int b = 0;

        for(int n: arr){
            if((n&mask) == 0){
                a ^= n;
            }else{
                b ^= n;
            }
        }
        return new int[]{a,b};
        
    }
}
