class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
        
       int closest = 0, res = nums[0] + nums[1] + nums[nums.length-1];
                     
       for (int i = 0; i < nums.length - 2; i++ ) {    
               
            int sum = 0, low = i + 1, high = nums.length - 1;      
               
            while (low < high) {
                    
               sum = nums[i] + nums[low] + nums[high];
           
               if (sum > target) {
                   high--;   
               } else 
                   low++;
                    
               if (Math.abs(sum - target) < Math.abs(res - target)) {
                   res = sum;
               }
            }
        
       }
            
            return res;
    }
}