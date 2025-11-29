import java.util.Arrays;

public class excercise4 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 10, 10};

        Arrays.sort(arr);
        int max = arr[arr.length-1];
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            count += max - arr[i];
        }
        System.out.println(count);
    //     System.out.println(Arrays.toString(divide(arr)));
    //     int count = 0;
    //     int max = arr[arr.length-1];
    //     for(int i = arr.length-1; i>=0; i--){
    //         count += max - arr[i];
    //     }
    //     System.out.println(count);
    // }   

    // static int[] divide(int[] arr){
    //     if(arr.length == 1)return arr;

    //     int mid = arr.length/2;

    //     int[] left = divide(Arrays.copyOfRange(arr, 0, mid));
    //     int[] right = divide(Arrays.copyOfRange(arr, mid, arr.length));

    //     return merged(left, right);
    // }

    // static int[] merged(int[] left, int[] right){
    //     int[] merge = new int[left.length + right.length];

    //     int i = 0;
    //     int j = 0;
    //     int k = 0;

    //     while(i<left.length && j<right.length){
    //         if(left[i] > right[j]){
    //             merge[k++] = right[j++];
    //         }else{
    //             merge[k++] = left[i++];
    //         }
    //     }

    //     while(i<left.length){
    //         merge[k++] = left[i++];
    //     }

    //     while(j<right.length){
    //         merge[k++] = right[j++];
    //     }
    //     return merge;
    }
}
