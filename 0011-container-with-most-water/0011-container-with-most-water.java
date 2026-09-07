class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left<right){
            int prod = 0;
            if(height[left]>height[right]){
                prod = height[right] * (right-left);
                right--;
            } else {
                prod = height[left] * (right-left);
                left++;
            }
            if(prod>max){
                max = prod;
            }
        }
        return max;
    }
}