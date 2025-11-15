import java.util.Scanner;
public class binaryToDecimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int pow = 1;
        int decimal = 0;
        while(i > 0){
            if((i & 1) == 1){
                decimal += pow;
            }
            
            i = i>>1;
            pow *= 2;
        }
        System.out.println(decimal);
    }
}