class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0, i = 0;
            
        while(i < nums.length) {       
             if (k < 2 || nums[i] > nums[k-2]) {
                 nums[k++] = nums[i];     
             }
               i++;
        }
            return k;
    }
}