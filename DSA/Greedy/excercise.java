import java.util.*;
class excercise{
    public static void main(String[] args){
        
        int[] arr = new int[3];
        for(int i = 0; i<arr.length; i++){
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }


        int max = Math.max(arr[0], Math.max(arr[1], arr[2]));
        int total = arr[0] + arr[1] + arr[2];
        System.out.println(Math.max(max, (total+1)/2));
    }
}