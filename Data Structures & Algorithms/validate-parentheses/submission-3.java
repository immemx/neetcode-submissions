class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> vals = Map.of(
             ')', '(',
             '}', '{',
             ']', '['
        );

        for (char c : s.toCharArray()) {
            if (vals.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == vals.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
