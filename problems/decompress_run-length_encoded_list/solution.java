class Solution {
    public int[] decompressRLElist(int[] nums) {
        if (nums.length%2 != 0) {
            return null;
        } 
        int size = 0, freq = 0, val = 0, r = 0;
        for (int i=0;i<nums.length; i+=2) {
            size += nums[i];
        }
        int [] res = new int[size];
        for (int j=0;j<nums.length;j+=2)  {
            freq = nums[j];
            val = nums[j+1];
            while(freq>0) {
                res[r] = val;
                r++;
                freq--;
            }
        }
        return res;
    }
}