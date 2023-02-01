class Solution {
    public int titleToNumber(String columnTitle) {
        int col = 0;
        int digit = 1;

        for(int i=columnTitle.length()-1; i>=0; i--){
            col += (columnTitle.charAt(i)-'A'+1) * digit;
            digit *= 26;
        }

        return col;
    }
}