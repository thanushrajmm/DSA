problem link -> [https://leetcode.com/problems/valid-parentheses/]
class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(')
                st.push(')');
            else if (c == '{')
                st.push('}');
            else if(c=='[')
                st.push(']');
            else if (st.isEmpty() || st.pop() != c)
                return false;
        }
        return st.isEmpty();
    }
}
--------------------------------------------------------------------------------------------------------------
    class Solution {
    public boolean isValid(String s) {
   Stack<Character> st = new Stack<Character>();
        for (char it : s.toCharArray()) {
            if (it == '(' || it == '[' || it == '{')
                st.push(it);
            else {
                if(st.isEmpty()) return false;
                char ch = st.pop(); 
                if((it == ')' && ch == '(') ||  (it == ']' && ch == '[') || (it == '}' && ch == '{')) continue;
                else return false;
            }
        }
        return st.isEmpty();
    }
}
