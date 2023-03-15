class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

        permute(nums, new ArrayList<>(), resultList);

        return resultList;
    }

    public void permute(int[] nums, List<Integer> list, List<List<Integer>> resultList){
        if(list.size () == nums.length){
            resultList.add(new ArrayList<>(new ArrayList<>(list)));
        } else {
            for(int i=0; i<nums.length; i++){
                if(list.contains(nums[i])) continue;
                list.add(nums[i]);
                permute(nums, list, resultList);
                list.remove(list.size()-1);
            }
        }
    }
}