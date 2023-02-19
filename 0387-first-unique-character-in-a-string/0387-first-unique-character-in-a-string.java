class Solution {
    public int firstUniqChar(String s) {

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            boolean dup = false;

            for(int j=0; j<s.length(); j++){
                if(j==i) continue;
                if(ch==s.charAt(j)){
                    dup = true;
                    break;
                }
            }

            if(!dup){
                return i;
            }
        }

        return -1;

    }
}