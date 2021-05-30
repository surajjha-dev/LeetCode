class Solution {
    public void moveZeroes(int[] nums) {
        int beg = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] != 0) {
                nums[beg] = nums[i];
                beg++;
            }
        }
        for (int i=beg; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}