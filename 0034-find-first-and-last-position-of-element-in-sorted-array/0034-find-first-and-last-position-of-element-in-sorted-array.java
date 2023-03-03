class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int start = -1;
        int end = -1;
        
        while(left<=right){
            if(nums[left]==target && nums[right]==target){
                start = left;
                end = right;
                break;
            } else if(nums[left]!=target){
                left++;
            } else if(nums[right]!=target){
                right--;
            } else {
                left++;
                right--;
            }
        }

        int[] result = {start, end};

        return result;
    }
}