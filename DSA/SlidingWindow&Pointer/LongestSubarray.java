public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr =  {10,5,1,10,8};
        int k = 14;
        int maxLength = 0;
        for(int i = 0; i<arr.length; i++){
            int sum = 0;
            for(int j = i; j<arr.length; j++){
                sum += arr[j];
                if(sum<=k){
                    maxLength = Math.max(maxLength, j-i+1);
                }
            }
        }
        System.out.println(maxLength);
    }
}
