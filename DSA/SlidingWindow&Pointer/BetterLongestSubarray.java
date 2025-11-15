public class BetterLongestSubarray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,10,10};
        int k = 14;
        int maxLength = 0;
        int l = 0;
        int r = 0;
        int sum = 0;
        while(r<arr.length){
            
            
            sum += arr[r];
            // while(sum > k){
            if(sum>k){
                sum += arr[r];
                l++;
            }
            if(sum<=k){
                maxLength = Math.max(maxLength, r-l+1);
                r++;
            }
            
        }
        System.out.println(maxLength);
    }
}

// here for optimal we willl put the if condition in while loop it makes the time complexity to O(n+n) to O(n)
