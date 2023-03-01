class Solution {
    public void nextPermutation(int[] nums) {
        int index = nums.length-1;

        while(index > 0 && nums[index]<=nums[index-1]){
            index--;
        }

        if(index>0){
            int left = nums[index-1];
            int right = Integer.MAX_VALUE;
            int rightIndex = 0;
            
            for(int i=index; i<nums.length; i++){
                if(nums[i] <= right && nums[i] > left){
                    rightIndex = i;
                    right = nums[i];
                }
            }

            nums[index-1] = right;
            nums[rightIndex] = left;
        }

        for(int i=index; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int sort = nums[i];
                nums[i] = nums[j];
                nums[j] = sort;
            }
        }
    }
}