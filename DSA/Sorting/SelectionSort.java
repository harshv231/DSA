import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    // static void selection(int []arr){
    //     for(int i = 0; i<arr.length; i++){
    //         int last = arr.length-i-1;
    //         int maxIndex = getMax(arr, 0, last);
    //         swap(arr, maxIndex, last);
    //         System.out.println(Arrays.toString(arr));
    //     }
    // }
    // static int getMax(int[] arr, int start , int end){
    //     int max = start;
    //     for(int i = 0; i<=end; i++){
    //         if(arr[i] > arr[max]){
    //             max = i;
    //         }
    //     }
    //     return max;
    // }

    static void selection(int[] arr){
        
        for(int i = 0; i<arr.length; i++){
            int minIndex=1;
            for(int j = 1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
            System.out.println(Arrays.toString(arr));
        }
        // System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
