 problem link -> [ https://www.geeksforgeeks.org/problems/prefix-to-infix-conversion/ ] 
class Solution {
    static String preToInfix(String pre_exp) {
       String str = "";
       for(int i = pre_exp.length() - 1; i >= 0; i--){
           str += pre_exp.charAt(i); 
           
       }
        Stack<String>s=new Stack <>();
        
        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            if( (curr >= 'A' && curr <= 'Z') ||
                (curr >= 'a' && curr <= 'z') ||
                (curr >= '0' && curr <= '9')
            ){
                s.push(curr + "");// use + "" to convert char to string
                
            }
            else{
                String a = s.pop();
                String b = s.pop();
                String x = "(" + a + curr + b + ")";
                s.push(x);
            }
        }
        return s.peek();
        
    }
}
