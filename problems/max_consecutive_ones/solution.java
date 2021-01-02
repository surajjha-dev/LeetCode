class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0, max = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1) {
                temp++;
            } else {
                if(temp > max) {
                    max = temp;
                }
                temp = 0;
            }
        }
        if (temp > max) {
            max = temp;
        }
        if (nums.length == 1) {
            return temp;
        } else {
            return max;   
        }  
    }
}