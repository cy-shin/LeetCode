class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int area = 0;

        while(i<j){
            int temp = (j-i) * Math.min(height[i],height[j]);
            if(temp > area) area = temp;
            if(height[i]>height[j]){
                j--;
            } else {
                i++;
            }
        }

        return area;
    }
}