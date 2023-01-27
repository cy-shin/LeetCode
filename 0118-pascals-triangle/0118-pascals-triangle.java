class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return new ArrayList<>();
        List<List<Integer>> pascal = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> list = new ArrayList<>();

            for(int j=0; j<=i; j++){
                if(j<=1){
                    list.add(1);
                }
                if(j>1){
                    list.add(j-1, pascal.get(i-1).get(j-2) + pascal.get(i-1).get(j-1));
                }
            }
                        
            pascal.add(list);
        }
        return pascal;
    }
}