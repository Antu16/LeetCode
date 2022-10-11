class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int windowSum = 0, maxSum = 0, temp = nums.length;
        boolean flag = false;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];
            while (windowSum >= target) {
                maxSum = Math.abs(windowEnd - (windowStart)) + 1;
                flag = true;
                if (maxSum < temp) {
                    
                    temp = maxSum;
                }
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }
        if (flag) {
            return temp;
        }
        return 0;
    }
}