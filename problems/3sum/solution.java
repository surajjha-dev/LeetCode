class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
            
       List<List<Integer>> result = new ArrayList<>();
            
       for (int i = 0; i < nums.length - 2; i++ ) {
           
          if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {     
               
            int res = 0, low = i + 1, high = nums.length - 1;                                           
            while (low < high) {
                    
               res = nums[i] + nums[low] + nums[high];
           
               if (res == 0) {                                                                             result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                  
                  while (low < high && nums[low] == nums[low+1]) low++;
                  while (low < high && nums[high] == nums[high-1]) high--;
                  low++;
                  high--;
               } else if (res < 0) {
                   low++;   
               } else {
                   high--;
               }
            }
           }
       }
            
            return result;
    }
}