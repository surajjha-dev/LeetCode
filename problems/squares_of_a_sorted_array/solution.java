class Solution {
    public int[] sortedSquares(int[] nums) {
            int n = nums.length;
            
            int low = 0, high = n-1, k = n-1, val1 = 0, val2 = 0;
            
            int [] sorted = new int[n];
            
            
            while (low <= high) {
                val1 = nums[low]*nums[low];
                val2 = nums[high]*nums[high];
                    
                if (val1 > val2) {
                   sorted[k--] = val1;
                   low++;     
                }  else {
                   sorted[k--] = val2;
                   high--;
                }
            }
            
            return sorted;
    }
}