// Problem 1480
class Solution {
    public int[] runningSum(int[] nums) {
        
        int len = nums.length;
        
        int[] runningSum = new int[len];
        
        int sum = 0;
        
        for (int i = 0; i<len; i++){
            sum = sum + nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }
}
