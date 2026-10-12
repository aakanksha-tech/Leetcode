
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        find(0, candidates, target, new ArrayList<>(), ans);

        return ans;
    }

    public void find(int idx, int[] arr, int target,
                     List<Integer> list,
                     List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (idx == arr.length || target < 0) {
            return;
        }

        // Take the current element
        list.add(arr[idx]);
        find(idx, arr, target - arr[idx], list, ans);

        // Backtrack: remove the current element
        list.remove(list.size() - 1);

        // Skip the current element
        find(idx + 1, arr, target, list, ans);
    }
}
