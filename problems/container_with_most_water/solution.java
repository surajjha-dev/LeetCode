class Solution {
    public int maxArea(int[] height) {
            
        int n = height.length;
        int maxVolume = 0, low = 0, high = n-1;
            
        if (height.length == 0)
            return 0;
            
        while (low < high) {
                
            maxVolume = Math.max( Math.min(height[low], height[high])*(high - low), maxVolume );
            
            if (height[low] < height[high]) {
                   low++;
            } else {
                  high--;  
            }
                
        }
            return maxVolume;
            
    }
}