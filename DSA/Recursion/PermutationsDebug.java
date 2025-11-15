import java.util.*;
public class PermutationsDebug {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};  // test input
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        PermutationsDebug pd = new PermutationsDebug();
        pd.backtrack(result, new ArrayList<>(), nums, used, 0);

        System.out.println("\nAll permutations:");
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }

    private void backtrack(List<List<Integer>> result,
                           List<Integer> current,
                           int[] nums,
                           boolean[] used,
                           int depth) {
        System.out.printf("Enter depth=%d current=%s used=%s\n", 
                          depth, current, Arrays.toString(used));

        if (current.size() == nums.length) {
            System.out.println("  --> saving " + current);
            result.add(new ArrayList<>(current)); // snapshot copy
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; // skip used numbers

            // choose
            current.add(nums[i]);
            used[i] = true;

            // explore
            backtrack(result, current, nums, used, depth + 1);

            // undo
            current.remove(current.size() - 1);
            used[i] = false;
        }

        System.out.printf("Exit depth=%d current=%s\n", depth, current);
    }
}
