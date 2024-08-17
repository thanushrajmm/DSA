//Question asked in Oracle Coding Round. 
public class LongestSubstringWithKNormals {
    public static int longestSubstringWithKNormals(String s, String charValue, int k) {
        int n = s.length();
        int maxLen = 0;
        int left = 0;
        int normalCount = 0;

        for (int right = 0; right < n; right++) {
            // Check if the current character is normal (charValue = '0')
            if (charValue.charAt(s.charAt(right) - 'a') == '0') {
                normalCount++;
            }

            // If the count of normal characters exceeds k, move the left pointer
            while (normalCount > k) {
                if (charValue.charAt(s.charAt(left) - 'a') == '0') {
                    normalCount--;
                }
                left++;
            }

            // Calculate the maximum length of the valid substring
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abacaba";
        String charValue = "01010101111111111111111111";
        int k = 2;

        System.out.println(longestSubstringWithKNormals(s, charValue, k)); // Output: 5
    }
}
