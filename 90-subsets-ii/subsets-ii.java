class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);               // Sort to bring duplicates together
        backtrack(0, nums, new ArrayList<>());
        return ans;
    }

    public void backtrack(int index, int[] nums, List<Integer> temp) {

        ans.add(new ArrayList<>(temp));

        for (int i = index; i < nums.length; i++) {

            // Skip duplicate elements at the same recursion level
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            temp.add(nums[i]);

            backtrack(i + 1, nums, temp);

            temp.remove(temp.size() - 1);   // Backtrack
        }
    }
}