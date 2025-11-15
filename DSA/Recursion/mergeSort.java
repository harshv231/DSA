import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {3,4,9,0,1,6,58};
        // arr = divide(arr);
        // System.out.println(Arrays.toString(arr));    
        mergeInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    // static int[] divide(int[] arr){
    //     if(arr.length == 1) return arr;

    //     int mid = arr.length/2;

    //     int[] left = divide(Arrays.copyOfRange(arr, 0, mid));
    //     int[] right = divide(Arrays.copyOfRange(arr, mid, arr.length));

    //     return merge(left, right);
    // }
    // static int[] merge(int[] first, int[] last){
    //     int[] merge = new int[first.length+last.length];
    //     int i = 0;
    //     int j = 0;
    //     int k = 0;
    //     while(i<first.length && j<last.length){
    //         if(first[i] > last[j]){
    //             merge[k] = last[j];
    //             j++;
    //         }else{
    //             merge[k] = first[i];
    //             i++;
    //         }
    //         k++;
    //     }

    //     while(i<first.length){
    //         merge[k] = first[i];
    //         i++;
    //         k++;
    //     }

    //     while(j<last.length){
    //         merge[k] = last[j];
    //         k++;
    //         j++;
    //     }

    //     return merge;
        
    // }


    static void mergeInPlace(int[] arr, int s, int e){
        if(e - s == 1) return;

        int mid = (s+e)/2;

        mergeInPlace(arr, s, mid);
        mergeInPlace(arr, mid, e);
        merge(arr, s, mid, e);
    }
    static void merge(int[] arr, int s, int mid, int e){
        int[] mix = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;
        while(i<mid && j<e){
            if(arr[i] > arr[j]){
                mix[k] = arr[j];
                j++;
            }else{
                mix[k] = arr[i];
                i++;
            }
            k++;
        }

        while(i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j<e){
            mix[k] = arr[j];
            k++;
            j++;
        }

        for(int l = 0; l<mix.length; l++){
            arr[s + l] = mix[l];
        }
    }

}
