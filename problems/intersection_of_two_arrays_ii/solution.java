class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //return solution1(nums1, nums2);
        
         Arrays.sort(nums1);
         Arrays.sort(nums2);
            
         int a1 = 0, a2 = 0, l1 = nums1.length, l2 = nums2.length;
         List<Integer> list = new ArrayList<>();   
            
         while (true) {
                 
              if (a1 == l1 || a2 == l2)
                   break;   
                 
              if (nums1[a1] == nums2[a2]) {
                  list.add(nums1[a1]);
                  a1++;
                  a2++;    
              } else if (nums1[a1] < nums2[a2]) {
                   a1++; 
              } else if (nums1[a1] > nums2[a2]) {
                   a2++; 
              }   
                 
         }   
            
        int [] res = new int [list.size()];
        int r = 0;  
        for (Integer v: list) {
              res[r++] = v;  
        }
            
        return res;    
    }
        
    public int [] solution1(int [] nums1, int [] nums2) {
        // O(n + m)    
        Set<Integer> hashSet = new HashSet<>();
        int [] count = new int[1001];
        List<Integer> array = new ArrayList<>();    
            
        if (nums1.length >= nums2.length) {
            for (int i = 0; i < nums1.length; i++) {
              hashSet.add(nums1[i]);
              count[nums1[i]]++;      
            }
            
            for (int j = 0; j < nums2.length; j++) {
              if (hashSet.contains(nums2[j])) {
                   if (count[nums2[j]] >= 1)   
                       array.add(nums2[j]);
                      
                   count[nums2[j]]--;   
              }  
            }
        } else {
            for (int i = 0; i < nums2.length; i++) {
              hashSet.add(nums2[i]);
              count[nums2[i]]++;
            }
            
            for (int j = 0; j < nums1.length; j++) {
              if (hashSet.contains(nums1[j])) {
                  if (count[nums1[j]] >= 1)    
                    array.add(nums1[j]);
                      
                   count[nums1[j]]--;    
              }  
            }    
        }
            
        int r = 0;    
        int [] res = new int [array.size()];
        for (Integer v: array) {
              res[r++] = v;  
        }
            
        return res;
    }    
}