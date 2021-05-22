class Solution {
    public int maxProduct(int[] nums) {
      int max = 0;
      int smax = 0;  
      for (int i=0;i<nums.length;i++) {
          if (nums[i]>max) {
              smax = max;
              max = nums[i];
          } else if (nums[i]>smax) {
              smax = nums[i];
          }
      }
      return (smax-1)*(max-1);
    }
}