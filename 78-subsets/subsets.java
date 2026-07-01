class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0, nums, new ArrayList<>());
        return ans;
    }

    void backtrack(int index, int[] nums, List<Integer> temp) {
        ans.add(new ArrayList<>(temp));

        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(i + 1, nums, temp);
            temp.remove(temp.size() - 1);
        }
    }
}