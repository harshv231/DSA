import java.util.*;
public class subSet {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> list = subSetDuplicate(arr);
        for(List<Integer> ans: list){
            System.out.println(ans);
        }
    }
    // static List<List<Integer>> subset(int[] arr){
    //     ArrayList<List<Integer>> outer = new ArrayList<>();
    //     outer.add(new ArrayList<>());

    //     for(int num: arr){
    //         int n = outer.size();
    //         for(int i = 0; i<n; i++){
    //             List<Integer> inner = new ArrayList<>(outer.get(i));
    //             inner.add(num);
    //             outer.add(inner);
    //         }
    //     }
    //     return outer;

    // }


    // static List<List<Integer>> subSetDuplicate(int[] arr){
    //     ArrayList<List<Integer>> outer = new ArrayList<>();
    //     outer.add(new ArrayList<>());
    //     int start = 0;
    //     int end = 0;

    //     for(int i = 0; i<arr.length; i++){
    //         start = 0;
    //         if(i>0 && arr[i] == arr[i-1]){
    //             start = end+1;
    //         }
    //         end = outer.size() - 1;
    //         int n = outer.size();
    //         for(int j = start; j<n; j++){
    //             List<Integer> inner = new ArrayList<>(outer.get(j));
    //             inner.add(arr[i]);
    //             outer.add(inner);
    //         }
    //     }
    //     return outer;
    // }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;
        for(int i = 0; i<arr.length; i++){
            start = 0;
            if(i>0 && arr[i] == arr[i-1]){
                start = end +1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for(int j = 0; j<n; j++){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                outer.add(list);
            }
        }
        return outer;
    }
}
