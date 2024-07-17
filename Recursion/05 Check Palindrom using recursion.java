class Demo{
    
    static boolean printReverse(int i , String s ){
        if(i>=s.length()/2) return true;                          //if i reaches middle its a palindrom return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false; //check the i = (0) and the last i = (n-i-1) first and last if not equal return false; 
        return printReverse(i+1, s);                            
        
    } 
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(printReverse(0,s));
        
    }
}
