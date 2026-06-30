class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1, high = 0;

        for (int p : piles) {
            high = Math.max(high, p);
        }

        while (low < high) {

            int mid = (low+high)/2;

            if (canFinish(piles, h, mid)) {
                high = mid;   // try smaller k
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canFinish(int[] piles, int h, int k) {

        long hours = 0;

        for (int p : piles) {
            hours += (p + k - 1) / k;
        }

        return hours <= h;
    }
}