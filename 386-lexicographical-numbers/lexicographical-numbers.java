class Solution {

    List<Integer> ans = new ArrayList<>();

    public List<Integer> lexicalOrder(int n) {

        for (int i = 1; i <= 9; i++) {
            dfs(i, n);
        }

        return ans;
    }

    void dfs(int curr, int n) {

        if (curr > n) return;

        ans.add(curr);

        for (int i = 0; i <= 9; i++) {
            int next = curr * 10 + i;
            if (next > n) return;
            dfs(next, n);
        }
    }
}