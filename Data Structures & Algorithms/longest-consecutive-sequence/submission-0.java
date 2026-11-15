class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> setNums = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        int count = 0;
        for (int num : nums) {
            if (setNums.contains(num - 1)) continue;
            int length = 1;
            while (setNums.contains(num+length)) {
                length++;
            }
            count = Math.max(count, length);
        }
        return count;
    }
}
