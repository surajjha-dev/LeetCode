class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length, low = 0, high = nums.length - 1, mid = 0;
        
        int [] res = new int[] {-1 , -1};
            
        while (low <= high) {
                
            mid = (low + high)/2;
                
            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }    
                
            if (nums[mid] == target)
               res[0] = mid;
        }
            
        low = 0;
        high = nums.length - 1;
        mid = 0;
            
        while (low <= high) {
                
            mid = (low + high)/2;
                
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }    
                
            if (nums[mid] == target)
               res[1] = mid;
        }
            
            return res;
    }
}