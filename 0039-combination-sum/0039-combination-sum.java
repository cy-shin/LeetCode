class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        bt(candidates, target, result, new ArrayList<>(), 0);

        return result;
    }

    public void bt(int[] candidates, int target, List<List<Integer>> result, List<Integer> list, int start){
        if(target<0) return;
        else if(target==0){
            result.add(new ArrayList<>(list));
        } else {
            for(int i=start; i<candidates.length; i++){
                list.add(candidates[i]);
                bt(candidates, target-candidates[i], result, list, i);
                list.remove(list.size()-1);
            }
        }
        

    }

}