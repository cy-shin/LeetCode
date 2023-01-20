class Solution {
    public int lengthOfLastWord(String s) {

        int count = 0;
        int end = s.length();

        while(s.charAt(end-1)==' '){
            end--;
            if(end==0) return 0;
        }

        while(s.charAt(end-1)!=' '){
            count++;
            end--;
            if(end==0) break;
        }

        return count; 

    }
}