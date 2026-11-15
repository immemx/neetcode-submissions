class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        Set<String> symbols = new HashSet<>(Arrays.asList("+", "-", "/", "*"));

        for (String token : tokens) {
            if (!symbols.contains(token)) {
                s.push(Integer.parseInt(token));
            } else {
                int value = 0;
                int two = s.pop();
                int one = s.pop();

                if (token.equals("+")) {
                    value = one + two;
                } else if (token.equals("-")) {
                    value = one - two;
                } else if (token.equals("*")) {
                    value = one * two;
                } else if (token.equals("/")) {
                    value = one / two;
                }

                s.push(value);
            }
        }

        return s.pop();
    }
}
