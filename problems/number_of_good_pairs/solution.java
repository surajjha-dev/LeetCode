class Solution {
    public int numIdenticalPairs(int[] nums) {
       int [] index = new int[101];
       int [] hash = new int[101];
       int count = 0, temp = 0;

       for (int i = 0; i < nums.length; i++)
         hash[nums[i]]++;
            
       for (int j = 0; j < 101; j++) {
           temp = 0;    
               
           if (hash[j] > 1) {
                   
              temp = hash[j]*(hash[j] - 1);
                   
              temp = temp/2;
              
              count += temp;     
           }    
       }     
       return count;
    }
}