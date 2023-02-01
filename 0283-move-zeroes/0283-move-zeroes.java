class Solution {
    public void moveZeroes(int[] nums) {

    //     int idx = 0, end = nums.length-1;

    //     while(idx <= end){
    //         if(nums[idx] == 0){
    //             for(int i=idx; i<end; i++){
    //                 nums[i] = nums[i+1];
    //             }   
    //             nums[end--] = 0;
    //         } else {
    //             idx++;
    //         }
    //     }
    // }

        int lastChangedIdx = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[lastChangedIdx] = nums[i];

                if(i!=lastChangedIdx){
                    nums[i] = 0;
                }

                lastChangedIdx++;
            }
        }
    }
}