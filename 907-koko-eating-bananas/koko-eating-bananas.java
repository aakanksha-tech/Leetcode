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

// class Solution {

//      public int minEatingSpeed(int[] piles, int h) {
//         int max=0;
//         for(int i=0;i<piles.length;i++){
//             if(piles[i]>max){
//                 max=piles[i];
//             }
//         }
//         for(int k=1;k<max;k++){
//             int hours=0;
//             for(int i=0;i<piles.length;i++){
//                 hours=hours+(piles[i]+k-1)/k;
//             }
//             if(hours<=h){
//                 return k;
//             }
//         }
//         return max;
//      }
// }
