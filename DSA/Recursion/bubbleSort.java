import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr= {4,3,2,1};
        insertionsSort(arr,0, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr, int i, int j){
        if(i == 0) return;

        if(j < i){
            if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            bubble(arr, i, j+1); 
        }
        }else{
            bubble(arr, i-1, 0);
        }
    }

    static void insertionsSort(int[] arr, int max, int i, int j){
        if(i == 0)return;
        if(j<i){
            if(arr[j] > arr[max]){
                insertionsSort(arr, j, i, j+1);
            }else{
                insertionsSort(arr, max, i, j+1);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[i-1];
            arr[i-1] = temp;
            insertionsSort(arr, 0, i-1, 0);
        }
    }
}
