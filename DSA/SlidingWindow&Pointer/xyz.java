import java.util.HashMap;

public class xyz {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, -2, 5, 1, 1, -1, 2};
        int k = 5;
        System.out.println(subarraySum(num, k));
    }
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
       
        // }
        map.put(0,1);
        int sum = 0;
        int count = 0;

        for(int num: nums){
            sum += num;

            if(map.containsKey(sum - k)){
            count += map.get(sum-k);
        }
        map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
