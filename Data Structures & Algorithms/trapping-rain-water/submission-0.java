class Solution {
    public int trap(int[] height) {
        // min(l,r) - currHeight
        int res = 0;

        int[] lv = new int[height.length];
        int[] rv = new int[height.length];

        for (int i = 0; i < height.length; i++) {
            if (i == 0) {
                lv[i] = 0;
                continue;
            }

            if (height[i-1] > lv[i-1]) {
                lv[i] = height[i-1];
            } else {
                lv[i] = lv[i-1];
            }
        }

        for (int i = height.length-1; i > 0; i--) {
            if (i == height.length-1) {
                rv[i] = 0;
                continue;
            }

            if (height[i+1] > rv[i+1]) {
                rv[i] = height[i+1];
            } else {
                rv[i] = rv[i+1];
            }
        }

        for (int i = 0; i < height.length; i++) {
            int val = Math.min(rv[i], lv[i]) - height[i];

            if (val > 0) {
                res += val;
            }
        }

        return res;
    }
}
