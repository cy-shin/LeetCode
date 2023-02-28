class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        String s = "(";

        generateParenthesis(n, list, s, 1, 0);

        return list;
    }

    public void generateParenthesis(int n, List<String> list, String s, int open, int close){
        if(open < close) return;
        if(open == n && close == n){
            list.add(s);
            return;
        }
        if(open < n){
            generateParenthesis(n, list, s+"(", open+1, close);
        }
        if(close < n){
            generateParenthesis(n, list, s+")", open, close+1);
        }
        return;
    }
}