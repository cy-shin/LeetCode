class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length-2;

        while(n >= 0 && nums[n]>=nums[n+1]){
            n--;
        }

        if(n>=0){
            int m = nums.length -1;
            while(nums[n]>=nums[m]) m--;

            int swap = nums[n];
            nums[n] = nums[m];
            nums[m] = swap;
        }

        for(int i=n+1; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int sort = nums[i];
                nums[i] = nums[j];
                nums[j] = sort;
            }
        }
    }
}