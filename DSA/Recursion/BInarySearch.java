

public class BInarySearch {
    public static void main(String[] args) {
    //     int[] arr = {1,2,3,6,33,43};
    //     int target = 13;
    //     int ans = binarySearch(arr, target, 0, arr.length-1);
    //     System.out.println(ans);


    // }
    // public static int binarySearch(int[] arr, int target, int start, int end){
    //     if(start > end){
    //         return -1;
    //     }
    //     int mid = start + (end-start)/2;

    //     if(arr[mid] == target){
    //         return mid;
    //     }
    //     if(arr[mid]>target){
    //         return binarySearch(arr, target, start, mid-1);
    //     }
    //     return binarySearch(arr, target, mid+1, end);
    // }

    //    Scanner sc = new Scanner(System.in);
    //     System.out.println("choose between 1 and 0");
    //    int i = sc.nextInt();
       
    //    if(i == 0){
    //     System.out.println("you re executed");
    //    }

    //     if(i == 1){
    //         int marks = sc.nextInt();
    //         if(marks >= 90){
    //             System.out.println("Your marks are excellent");
    //         }else if(marks>=80 && marks<90){
    //             System.out.println("The marks are Good");
    //         }else if(marks>=60 && marks<= 80){
    //             System.out.println("your marks are average");
    //         }else{
    //             System.out.println("You are just passed!");
    //         }
        // }

       int[] arr = {5,6,7,8,9,1,2,3,4};
       System.out.println(binarySearch(arr, 3, 0, arr.length-1));
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        if(start>end) return -1;

        int mid = start+(end-start)/2;

        if(arr[mid] == target) return mid;
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target<arr[mid]){
                return binarySearch(arr, target, start, mid-1);
            }else{
                return binarySearch(arr, target, mid+1, end);
            }
        }
        if(target> arr[mid] && target<= arr[end]){
            return binarySearch(arr, target, mid+1, end);
        }else{
            return binarySearch(arr, target, start, mid-1);
        }
    }
}
