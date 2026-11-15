class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // count frequencies in a map
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : nums){
            m.put(num, m.getOrDefault(num, 0) + 1);
        }

        // create bucket
        List<Integer>[] buckets = new List[nums.length + 1];

        // loop through the map assigning the key/values from the map into the bucket
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (buckets[freq] == null) {
                // create list if non existant
                buckets[freq] = new ArrayList<>();
            }
            // add number to coorsponding count bucket
            buckets[freq].add(num);
        }

        // list of final values
        List<Integer> resultList = new ArrayList<>();

        for (int i = buckets.length - 1; i >= 0 && resultList.size() < k; i--){
            if (buckets[i] != null) {
                for (int num: buckets[i]) {
                    resultList.add(num);
                    if (resultList.size() == k) {
                        break;
                    }
                }
            }
        }

        // convert list to an array
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
