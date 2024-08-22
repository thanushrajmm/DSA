problem link -> [ https://www.geeksforgeeks.org/problems/prefix-to-postfix-conversion/ ] 
class Solution {
    static String preToPost(String pre_exp) {
        Stack<String> s = new Stack<>();
        
        // Iterate from right to left of the prefix expression
        for (int i = pre_exp.length() - 1; i >= 0; i--) {
            char c = pre_exp.charAt(i);
            
            if (Character.isLetterOrDigit(c)) {
                // If the character is an operand, push it to the stack
                s.push(String.valueOf(c));
            } else {
                // If the character is an operator, pop two elements from the stack
                String op1 = s.pop();
                String op2 = s.pop();
                // Form a new postfix expression and push it back to the stack
                s.push(op1 + op2 + c);
            }
        }
        
        // The final element of the stack is the postfix expression
        return s.pop();
    }
}
