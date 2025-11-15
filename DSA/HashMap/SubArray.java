import java.util.*;
public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 2;
        System.out.print(subArray(arr, k));
    }
    static int subArray(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;
        map.put(0,1);
        for(int num: arr){
            sum += num;
        if(map.containsKey(sum - k)){
            count += map.get(sum-k);
        }
        map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return count;


    }
    
}
