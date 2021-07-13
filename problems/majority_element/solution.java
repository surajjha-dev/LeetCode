class Solution {
    public int majorityElement(int[] nums) {
        int res = 0, count = 1, n = nums.length;
            
         for (int i = 0; i < n; i++) {
                 if (nums[res] == nums[i]) {
                     count++;
                 } else {
                     count--;
                 }
                 
                 if (count == 0) {
                         res = i;
                         count = 1;
                 }
         }
            return nums[res];
    }
}