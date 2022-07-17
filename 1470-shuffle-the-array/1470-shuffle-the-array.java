class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res;
        int j =1;
        res = new int[2*n];
        for (int i =0; i<2*n; i++){
            res[i] = 0;
        }
        for (int i =0; i<n; i++){
            res[2*i] = nums[i];
        }
        for (int i=n; i<2*n; i++){
            res[j] = nums[i];
            j += 2;
        }
        return res;
    }
}