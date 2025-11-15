public class SquareRoot {
    public static void main(String[] args) {
        // int n = 40;

        // int[] squareRoot = new int[n+1];
        // int left = 0;
        // int right = squareRoot.length-1;

        // while(left<right){
        //     int mid = left + (right-left)/2;

        //     if(mid * mid == n){
        //         System.out.println(mid);
        //     }

        //     if(mid * mid< n){
        //         left = mid + 1;
        //     }else{
        //         right = mid-1;
        //     }
        // }


        int n = 40;
        int p = 3;

        System.out.println(sqrt(n, p));
    }

    static double sqrt(int n, int p){
        int left = 0;
        int right = n;

        double root = 0.0;

        while(left<right){
            int mid = left + (right-left)/2;

            if(mid * mid == n){
                return mid;
            }

            if(mid * mid< n){
                left = mid + 1;
            }else{
                right = mid-1;
            }
        }
        root = right;
        double inr = 0.1;
        for(int i = 0; i<p; i++){
            while(root * root <=n){
                root += inr;
            }

            root -= inr;
            inr /= 10;
        }

        return root;
    }
}
