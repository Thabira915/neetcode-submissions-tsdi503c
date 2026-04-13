class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
    
        for(int i = 0; i < nums.length; i++){

            int currentSum = 0;

            for(int j = i; j < nums.length; j++){
                currentSum = currentSum + nums[j];

                res = Math.max(res, currentSum);
            }
        }

        return res;
    }
}
