import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j] == target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return new int[] {};
    }
    public static void main(String args[]){
        Solution sl = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int[] res = sl.twoSum(arr,target);
        String arrayAsString = Arrays.toString(res);
    }
}