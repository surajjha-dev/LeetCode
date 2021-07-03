class Solution {
    public int sumOfUnique(int[] nums) {
        int [] hash = new int[101];
        int n = nums.length, sum = 0;
            
        for (int i=0;i<n;i++) {
            hash[nums[i]]+=1;
        }    
        for (int i=0;i<n;i++) {
            if (hash[nums[i]] == 1)
                 sum = sum + nums[i];
        }    
         return sum;   
    }
}