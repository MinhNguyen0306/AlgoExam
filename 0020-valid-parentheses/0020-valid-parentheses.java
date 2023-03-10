class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length() <= 1) return false;
        for(char c : s.toCharArray()) {
            if(c == '[') {
                stack.push(']');
            } else if(c == '(') {
                stack.push(')');
            } else if(c == '{') {
                stack.push('}');
            } else if(stack.empty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.empty();
    }
}