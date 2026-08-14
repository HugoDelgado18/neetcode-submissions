class Solution {
    public boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put('}', '{');
        pairs.put(']', '[');

        // lets explore this.. we have an array of characters..would it be      better to have a personal to manipulate? How should I check symbols? is the next index the closing symbol for the current symbol?

        for (Character c : s.toCharArray()) {
            // I could use this to collect them seperately
            if (pairs.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == pairs.get(c)) {
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
