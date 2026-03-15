class Solution {
    public boolean isPowerOfTwo(int n) {
        int power = (int) (Math.log(n) / Math.log(2));
        if ((n ^ (1 << power)) == 0) return true; /* or (n>0 && (n&(n-1))) */
        return false;
    }
}