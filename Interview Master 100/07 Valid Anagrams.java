Brute ->
  class Solution {
    public boolean isAnagram(String s, String t) {
        char [] arr1=s.toCharArray();
        char [] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String str1=new String(arr1);
        String str2=new String(arr2);
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
}

Optimised ->
class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n!=m){
            return false;
        }

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i = 0; i<n; i++){
            map1.put(s.charAt(i),1 + map1.getOrDefault(s.charAt(i),0));
            map2.put(t.charAt(i),1 + map2.getOrDefault(t.charAt(i),0));
            
        }
        return map1.equals(map2);
    }
}
