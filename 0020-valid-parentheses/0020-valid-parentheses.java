class Solution {
    public boolean isValid(String s) {
        Stack<Character> brac = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                brac.push(c);
            } else {
                if (brac.isEmpty())
                    return false;

                char top = brac.pop();

                if (c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '[') {
                    return false;
                }
            }

        }
        return brac.isEmpty();
    }
}