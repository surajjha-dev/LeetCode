class Solution {
    public int trap(int[] height) {
        int n = height.length;
            
        int [] lmax = new int[n];
        int [] rmax = new int[n];
        int water = 0;
            
        if(height.length == 0)
                return water;
            
        // computing all the left max of heights    
        lmax[0] = height[0];
        for (int i = 1; i < n; i++) {
                lmax[i] = Math.max(height[i], lmax[i-1]);
        }
        // computing all the right max of heights
        rmax[n-1] = height[n-1];
        for (int i = n-2; i>=0; i--) {
                rmax[i] = Math.max(height[i], rmax[i+1]);
        }
            
        for (int i=0; i<n; i++) {
                water = water + (Math.min(lmax[i], rmax[i]) - height[i]);
        }
            
        return water;   
            
    }
}