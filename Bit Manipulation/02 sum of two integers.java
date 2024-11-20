problem link -> [ https://leetcode.com/problems/sum-of-two-integers/ ]
class Solution {
    public int getSum(int a, int b) {
      int c; 
      while(b !=0 ) {
        temp = (a&b)<<1;
        a = a ^ b;
        b = temp;
      }
      return a;
    }
}

Example:
Add a = 2 (10 in binary) and b = 3 (11 in binary).

Initial Values:

a = 10, b = 11.
First Iteration:

temp = (a & b) << 1 = (10 & 11) << 1 = 10 << 1 = 100 (Carry is 100).
a = a ^ b = 10 ^ 11 = 01 (Partial sum is 01).
b = temp = 100.
Second Iteration:

temp = (a & b) << 1 = (01 & 100) << 1 = 000 << 1 = 000 (Carry is 0).
a = a ^ b = 01 ^ 100 = 101 (Sum becomes 101).
b = temp = 0.
End:

b is 0, so the loop ends, and a (101 in binary = 5) is returned.
