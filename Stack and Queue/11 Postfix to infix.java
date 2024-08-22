problem link -> [ https://www.geeksforgeeks.org/problems/postfix-to-infix-conversion/ ] 
import java.util.Stack;

class Solution {
    static String postToInfix(String s) {
        Stack<String> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isLetterOrDigit(c)) {
                st.push(Character.toString(c));
            } else {
                String t1 = st.pop();
                String t2 = st.pop();
                st.push('(' + t2 + c + t1 + ')');
            }
        }
        
        return st.peek();
    }
}
