import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        // CODE BY ME
        // int i = 0; 
        // while(i<arr.length){
        //     if(arr[i] != i+1 ){
        //          swap(arr, i , arr[i]-1);
        //      }else{
        //         i++;
        //      }
            
        // }
        // System.err.println(Arrays.toString(arr));
        

        
        int i = 0;
        while(i <arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr, i, arr[i] -1);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
