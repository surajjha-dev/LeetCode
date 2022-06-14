class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length, p1 = 0, p2 = 0, p3 = 0;   
            
        int [] res = new int[n];
                
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                 p1++;
            else if (nums[i] == 1)
                 p2++;
            else if (nums[i] == 2)
                 p3++;        
        }
            
        int r = 0;
            
        while (p1 != 0) {
            nums[r++] = 0;
            p1--;
        }
        while (p2 != 0) {
            nums[r++] = 1;
            p2--;    
        }    
        while (p3 != 0) {
            nums[r++] = 2;
            p3--;
        }
    }
}