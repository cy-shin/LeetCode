class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        if(nums[0] != 0) return 0;
        
        int missing = 0;
    
        for(int i=0; i<nums.length; i++){
            if(missing != nums[i]){
                break;
            } else {
                missing++;
            }
        }

        return missing;
    }
}