class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int sum1 = 0;
        for (int i=0;i<=nums.length;i++) {
            sum+=i;
        }
        for (int j=0;j<nums.length;j++) {
            sum1+=nums[j];
        }
        return sum-sum1;
    }
}