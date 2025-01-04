* Brute Force approach -> TC - O(N^2), SC - O(1);
class Solution {
    public boolean isValid(String s) {
        int len;
        do{
            len = s.length();
            s = s.replace("()","")
            .replace("{}","")
            .replace("[]","");
        }
        while(len != s.length());
        return s.isEmpty();
    }
}
-------------------------------------------------
* Optimised approach - TC - O(N), SC - O(N);
  class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
       for(char ch : s.toCharArray()){
        if(ch == '(' ||ch == '{' ||ch == '['){
            stack.push(ch);
        }
        else{
            if(stack.isEmpty()) return false;
            char open = stack.pop();
            if  ((ch == ')' && open != '(') ||
                (ch == '}' && open != '{') ||
                (ch ==']' && open != '[')){
                return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
