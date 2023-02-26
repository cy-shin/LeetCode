class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> resultList = new ArrayList<>();
        
        if(digits.length() == 0) return resultList;
        
        List<String> keymap = Arrays.asList("","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz");

        String c = "";

        makeCombinations(0, digits, c, keymap, resultList);

        return resultList;

    }   

    public void makeCombinations(int index, String digits, String c, List<String> keymap, List<String> resultList){
        if(c.length() == digits.length()){
            resultList.add(c);
            return;
        }
        while(index<digits.length()){
            // digits.charAt(index); ---> "2"
            // keymap.get(digits.charAt(index)-'0'); ---> "abc"
            // keymap.get(digits.charAt(index)-'0').charAt(0) ---> 'a'
            String temp = keymap.get(digits.charAt(index)-'0');
            for(int i=0; i<temp.length(); i++){
                makeCombinations(index+1, digits, c+temp.charAt(i), keymap, resultList);
            }
            index++;
        }
        return;
    }
}