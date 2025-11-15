import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args){
        int[] arr = {2,4,7,6,6,6,6,6,9};
        System.out.println(findAllIndex(arr, 6, 0));
        
    }
    // static boolean checkSort(int[] arr, int i){
    //     if(i < arr.length-1){
    //         return (arr[i]< arr[i+1]) && checkSort(arr, i+1);
    //     }
    //     return true;
    // static boolean linearSearch(int[] arr, int target, int i){
    //     if(i == arr.length)return false;

    //     return arr[i] == target || linearSearch(arr, target, i+1);
    
    // } 
    // static ArrayList<Integer> list = new ArrayList<>();
    // static void findAllIndex(int[] arr, int target, int i){
    //     if(i == arr.length)return;
    //     if(arr[i] == target){
    //        list.add(i); 
    //     }
    //     findAllIndex(arr, target, i+1);
    // }

    // static ArrayList<Integer> findAllIndex(int[] arr, int target, int i, ArrayList<Integer> list){
    //     if(i == arr.length)return list;
    //     if(arr[i] == target){
    //        list.add(i); 
    //     }
    //     return findAllIndex(arr, target, i+1, list);
    // }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length)return list;
        if(arr[i] == target){
           list.add(i); 
        }
        ArrayList<Integer> answerFromBelow = findAllIndex(arr, target, i+1);
        list.addAll(answerFromBelow);
        return list;
    }
}

