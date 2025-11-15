import java.util.Arrays;

public class primeNumber {
    public static void main(String[] args) {
        int num = 50;

        boolean[] arr = new boolean[num];

        Arrays.fill(arr, true);

        arr[0] = false;
        arr[1] = false;


        for(int k = 2; k<num; k++){
            if(arr[k] == true){
                makingCheck(arr, k);
            }
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == true){
                System.out.println(i);
            }
        }
    }
    static void makingCheck(boolean[] arr, int num){
        int i = num+num; 
        while(i<arr.length){
            arr[i] = false;
            i += num;
        }
    }
    
}
