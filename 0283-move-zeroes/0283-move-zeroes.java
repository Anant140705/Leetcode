class Solution {
    public void moveZeroes(int[] nums) {
        int back = nums.length-1;
        int front = 0;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr[back] = nums[i];
                back--;
            } else {
                arr[front]=nums[i];
                front++;
            }
        }
        for(int i = 0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}