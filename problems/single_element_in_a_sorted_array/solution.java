class Solution {
    public int singleNonDuplicate(int[] nums) {
      
     int low = 0, high = nums.length - 1, mid = 0, n = nums.length;
            
     if (n == 1)
        return nums[0];
            
     /* while (low <= high) {
        
         mid = (low+high)/2;

         if (mid == 0 || mid == n-1)
            return nums[mid];     
         else if (nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1])
            return nums[mid];
         else if (nums[low] == nums[low+1])
            low += 2;
         else if (nums[high] == nums[high-1])
            high -= 2;
     }  */
            
        while (low < high) {
            
            mid = (low+high)/2;
                
            if (mid % 2 == 0 && nums[mid] == nums[mid+1] || mid % 2 == 1 && nums[mid] == nums[mid-1])
                low = mid + 1;
            else
                high = mid;
        }
  
        return nums[low];
    }
}