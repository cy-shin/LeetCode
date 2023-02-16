class Solution {
    public boolean isPowerOfThree(int n) {
        if(n < 0 || (n != 1 && n%3 != 0)) return false;

        int prev = 1;
        int curr = 3;

        while(curr < n){
            if(n%3!=0) break;
            prev = curr;
            curr *= 3;
            n /= 3;
        }

        if(prev == n || curr == n) return true;

        return false;
    }
}