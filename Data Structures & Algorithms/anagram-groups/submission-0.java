class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();

        for(String currentString : strs) {
            // convert string to array "string" -> ["s", "t", ...]
            char[] sorted = currentString.toCharArray();

            // sort based on number
            Arrays.sort(sorted);

            // convert sorted array back into string to use as a key
            String sortedKey = new String(sorted);

            List<String> group = m.computeIfAbsent(sortedKey, k -> new ArrayList<>());

            group.add(currentString);
        }

        return new ArrayList<>(m.values());
    }
}
