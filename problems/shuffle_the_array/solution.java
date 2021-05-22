class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int x = 0, y = 0;
        while (n<nums.length) {
            ans[x++] = nums[y++];
            ans[x++] = nums[n++];
        }
        return ans;
    }
}