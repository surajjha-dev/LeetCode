class Solution {
    public int maximumTop(int[] nums, int k) {

        if (nums.length == 1 && k%2 == 1)
          return -1;
        
        int max = -1;
        int len = Math.min(nums.length, k-1);

        for (int i = 0; i < len; i++) {
            max = Math.max(max, nums[i]);
        }
        if (k < nums.length) {
            return Math.max(max, nums[k]);
        }
        return max;
    }
}