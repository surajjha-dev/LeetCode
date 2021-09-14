class Solution {
    public int[] twoSum(int[] nums, int target) {
         
         int n = nums.length;
         int [] res = new int[2];
            
         HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();   
            
          for (int i = 0; i < n; i++)   {
                if (!hash.containsKey(nums[i])) {
                     hash.put(nums[i], i);   
                }
          }
            
          for (int i = 0; i < n; i++) {                 
              if (hash.containsKey(target - nums[i])) {
                      res[0] = i;
                      res[1] = hash.get(target - nums[i]);
              }   
          }  
            
          return res; 
    }
}