class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
            
            
        // O(n + m)
            
        Set<Integer> hashSet = new HashSet<>();
        List<Integer> array = new ArrayList<>();    
            
        for (int i = 0; i < nums1.length; i++)
              hashSet.add(nums1[i]);
            
        for (int j = 0; j < nums2.length; j++) {
              if (hashSet.contains(nums2[j])) {
                   array.add(nums2[j]);   
              }
                
              hashSet.remove(nums2[j]);  
        }
            
        int r = 0;    
        int [] res = new int [array.size()];
        for (Integer v: array) {
              res[r++] = v;  
        }
            
        return res;    
    }
        
}