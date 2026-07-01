class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0, nums, new ArrayList<>());
        return ans;
    }

    void backtrack(int index, int[] nums, List<Integer> temp) {

        // Base Case
        if (index == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        // Include current element
        temp.add(nums[index]);
        backtrack(index + 1, nums, temp);

        // Backtrack
        temp.remove(temp.size() - 1);

        // Exclude current element
        backtrack(index + 1, nums, temp);
    }
}