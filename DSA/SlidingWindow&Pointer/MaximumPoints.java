public class MaximumPoints {
    public static void main(String[] args) {
        int[] arr = {6,2,3,4,7,2,1,7,1};
        int k = 4;
        int leftSum = 0;
        int maxSum = 0;
        int rSum = 0;
        for(int i =0; i<=k-1; i++){
            leftSum += arr[i];
        }
        maxSum = leftSum;
        int rIndex = arr.length-1;
        for(int i = k-1; i>=0; i--){
            leftSum = leftSum - arr[i];
            rSum   += arr[rIndex];
            rIndex--;
            maxSum = Math.max(maxSum, leftSum+rSum);
        }
        System.out.println(maxSum);
    }
}
