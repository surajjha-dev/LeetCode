class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int big = 0, end = n-1;
        int mid = 0;
        
        
        // Binary Search 
        while(big<=end) {   
            mid = (big+end)/2;
            
            if (nums[mid] == target)
                return mid;
            
            if (target<nums[mid]) {
                end = mid - 1;
            } else if (target>nums[mid]) {
                big = mid+1;
            }
        }
          if (nums[mid] == target)
             return mid;
          else
             return big;
    }
}