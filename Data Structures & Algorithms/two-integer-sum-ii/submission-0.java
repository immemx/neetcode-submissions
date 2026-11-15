class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length -1;

        while (leftPointer < rightPointer) {
            int summation = numbers[leftPointer] + numbers[rightPointer];

            if (summation == target){
                return new int[]{leftPointer+1, rightPointer+1};
            } 

            if (summation > target) {
                rightPointer -= 1;
            } else {
                leftPointer += 1;
            }
        }
        return new int[]{0, 0};
    }
}
