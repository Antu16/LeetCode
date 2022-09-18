class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for(int i=0; i < nums.length; i++){
            sum += nums[i];
        }
        
        int leftSum = 0;
        int leftIndex = 0;
        int rightSum = sum - nums[leftIndex];
        
        while(leftIndex < nums.length){
            
            if (leftSum == rightSum){
                return leftIndex;
            }
            else{
                
                if(leftIndex == nums.length-1){
                    break;
                }
                
                leftSum += nums[leftIndex];
                leftIndex++;
                rightSum -= nums[leftIndex]; 
            }
        }
        return -1;
    }
}