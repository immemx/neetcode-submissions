class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int supplement = target - nums[i];

            if (m.containsKey(supplement)) {
                return new int[]{m.get(supplement), i};
            } else {
                m.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
