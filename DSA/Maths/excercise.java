import java.util.Scanner;
import java.util.*;

class excercise{
    public static void main(String[] args) {
        long MOD = 1_000_000_007L;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        HashMap<Integer, Long> freq = new HashMap<>();
        for(int[] point: arr){
            freq.put(point[1], freq.getOrDefault(point[1], 0L) + 1);
        }   
        
        ArrayList<Long> ways = new ArrayList<>();
        for(long f: freq.values()){
            if(f >= 2){
                long w = (f * (f-1)/2)%MOD;
                ways.add(w);
            }
        }
        long ans = 0;
        long prefix = 0;
        for(long a : ways){
            long add = (a % MOD) * (prefix % MOD) % MOD;
            ans = (ans + add) %MOD;
            prefix = (prefix+a) %MOD;
        }
        if(ans < 0) ans += MOD;
        System.out.println(ans);
    }
}