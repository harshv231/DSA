import java.util.Arrays;

public class Unique2 {
    public static void main(String[] args) {
        // int[] arr = {2,2,3,2,7,8,7,8,8,7};
        // ArrayList<Integer> list = new ArrayList<>();

        // for(int n: arr){
        //     String num = Integer.toBinaryString(arr[n]);

        //     for(int i = num.length()-1; i>=0; i--){
        //         for(int m = list.size()-1; m>=0; m--){
        //         list.set(m, num.charAt(i) + list.get(m));
        //         }
        //     }
        // }
        // int power = 0;
        // int decimal = 0;
        // for(int j = list.size() -1; j>=2; j--){
        //     list.set(j,list.get(j) % 3);


        //     decimal += list.get(j)*Math.pow(2, power);
        //     power++;

        // }

        // System.out.println(decimal);





        //In this there are three numbers will be repeat and we have to find the unique number
        //If there 


        int[] arr = {2,2,3,2,7,8,7,8,8,7};
        int[] bitCount = new int[32];

        for(int n: arr){
            String binary = String.format("%32s",Integer.toBinaryString(n)).replace(" ", "0");
            System.out.println("Processing number " + n + " -> " + binary);

            for(int i = 0; i<32; i++){
                if((n & (1 << i)) != 0){
                    bitCount[i]++;
                }
            }
        }
        System.out.println("\nBit counts (before %3): " + Arrays.toString(bitCount));
        for(int i = 0; i<32; i++){
            bitCount[i] %= 3;
        }
        System.out.println("Bit counts (after %3):  " + Arrays.toString(bitCount));

        int result = 0;
        for(int i = 0; i<32; i++){
            if(bitCount[i] != 0){
                result |=(1<<i);
            }
        }
        System.out.println(result);

    }
    
}
