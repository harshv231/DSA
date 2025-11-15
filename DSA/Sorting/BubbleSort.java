
import java.util.Arrays;
public class BubbleSort{
    public static void main(String[] args) {
        int[] arr1 = {2,4,1,5,3};
        sort(arr1);
        System.out.println(Arrays.toString(arr1));

    }
    static void sort(int[] arr){
        boolean swapped;
        for(int i = 0 ; i<arr.length-1 ; i++){
            swapped = false;
            for(int j = 1; j<arr.length -i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        // System.out.println(Arrays.toString(arr));
    }
}