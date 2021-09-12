class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid = 0, contains ;
            
        if (nums.length == 1 && nums[0] == target)
           return 0;
            
        while (low <= high) {
                
             mid = (low + high)/2;
                 
             if (nums[mid] == target)
                 return mid;
            
             if (nums[low] <= nums[mid]) {
                 if (target < nums[mid] && target >= nums[low]) {
                     high = mid - 1;
                 }
                 else {
                     low = mid + 1;
                 }
             } else {
                 if (target > nums[mid] && target <= nums[high]) {
                     low = mid + 1;
                 }
                 else {
                     high = mid - 1;
                 }
             }
                
        }
            return -1;
    }
}