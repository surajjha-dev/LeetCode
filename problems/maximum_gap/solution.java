class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max = 0, temp = 0;
        for (int i=0;i<nums.length-1;i++) {
            temp = nums[i+1] - nums[i];
            if (temp>max) {
                  max = temp;
            }
        }
            return max;
    }
}