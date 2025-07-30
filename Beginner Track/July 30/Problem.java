public class Problem {
    // Valid Parentheses
    // Statement: Given a string s containing just the characters '(', ')', '{',
    // '}', '[' and ']', determine if the input string is valid.
    public boolean isValid(String s) {
        Stack<String> st = new Stack<>();

        for (char i : s.toCharArray()) {
            if (i == '(' || i == '{' || i == '[') {
                st.push(String.valueOf(i));
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if (i == ')' && !st.pop().equals("(") || i == '}' && !st.pop().equals("{")
                        || i == ']' && !st.pop().equals("[")) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
