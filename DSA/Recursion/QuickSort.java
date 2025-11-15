import java.util.Arrays;
public interface QuickSort {
    public static void main(String[] args) {
        int[] nums = {1,5,6,4,2,3,7};
        quickSort(nums, 0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    static void quickSort(int[] arr, int low , int high){
        if(low >= high)return;
        int s = low;
        int e = high;

        int pivot = s + (e - s)/2;

        while(s<= e){
            while(arr[s] < arr[pivot]){
                s++;
            }

            while (arr[e] > arr[pivot]) {
                e--;
            }

            if(s <= e){
                int temp = arr[e];
                arr[e] = arr[s];
                arr[s] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
