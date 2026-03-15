/* code written in LEETCODE */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int y = x;
        int acc = 0;

        while(x > 0) {
            acc = acc * 10 + x % 10;
            x = x / 10;
        }
        return (acc == y);
    }
}