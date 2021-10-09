class Solution {
    public int subarraySum(int[] nums, int k) {
       /* int n = nums.length;
        int sum1 = nums[0], count = 0, s = 0;
        
        if (sum1 == k)
            count++;    
      
        for (int i = 1; i < n; i++) {
                
            sum1 += nums[i];     
            
            while (sum1 > k && s < i-1) {
                
                if (nums[s] < 0)
                   sum1 += nums[s];
                else   
                   sum1 -= nums[s];
                    
                s++;        
            }
                
            if (sum1 == k || nums[i] == k)
                count++;               
        }       
            
            return count; */
            
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
            
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
               count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
            
        return count;
            
    }
}