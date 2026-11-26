import java.util.*;
class Solution {
    public String reverseParentheses(String s) {
        Deque<StringBuilder> st = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(sb);
                sb = new StringBuilder();
            }
            else if (Character.isLetter(ch)) {
                sb.append(ch);
            }
            else if (ch == ')') {
                sb.reverse();
                StringBuilder prev = st.pop();
                prev.append(sb);
                sb = prev;
            }
        }
        return sb.toString();
    }
}