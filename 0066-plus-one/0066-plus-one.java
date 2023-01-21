class Solution {
    public int[] plusOne(int[] digits) {
        if(++digits[digits.length-1]<10) return digits;

        for(int i=digits.length-1; i>0; i--){
            if(digits[i]>=10){
                digits[i] -= 10;
                digits[i-1]++;
            }
        }

        if(digits[0]<10) return digits;

        digits[0] -= 10;
        digits = new int[digits.length  +1];
        digits[0] = 1;
        return digits;



    }
}