class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int l = 0;
        int r = heights.length - 1;

        while (l < r) {
            int diff = r - l;
            int smallerNum = heights[r] > heights[l] ? heights[l] : heights[r];
            int a = diff * smallerNum;

            if (a > res) {
                res = a;
            }

            if (heights[r] > heights[l]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}
