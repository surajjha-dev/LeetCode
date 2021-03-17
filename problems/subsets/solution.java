class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();

        int length = nums.length;
        int noOfSets = (int) Math.pow(2, length);

        for (int i=0;i<noOfSets;i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < length; j++) {
                if ((i & (1<<j)) > 0) {
                    temp.add(nums[j]);
                }
            }
            subsets.add(temp);
        }
        return subsets;
    }
}