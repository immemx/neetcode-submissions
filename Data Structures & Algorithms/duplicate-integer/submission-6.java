class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hashNums = new HashSet<>();

        for (int num : nums) {
            if (hashNums.contains(num)) {
                return true;
            } else {
                hashNums.add(num);
            }
        }

        return false;
    }
}