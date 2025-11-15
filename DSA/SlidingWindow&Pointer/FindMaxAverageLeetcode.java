public class FindMaxAverageLeetcode {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0;
        int r = k-1;
        double tempSum = Integer.MIN_VALUE;
        double maxAverage = Integer.MIN_VALUE;
        while(r<=nums.length-1){
            double sum = 0;
            double avg = 0;
            for(int i = l; i<=r; i++){
                sum += nums[i];
            }
            tempSum = Math.max(sum, tempSum);
            
            if(tempSum>=sum){
                avg = sum/k;
            maxAverage = Math.max(avg, maxAverage);
            }
            
            l++;
            r++;
        }
        return maxAverage;
    }
}
