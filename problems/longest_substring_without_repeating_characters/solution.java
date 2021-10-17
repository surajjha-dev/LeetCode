class Solution {
    
    static final int CHAR = 256;
        
    public int lengthOfLongestSubstring(String s) {
            
       if (s.length() == 0 || s.length() == 1)
             return s.length();
            
       int [] hash = new int[CHAR];
            
       int res = 0, n = s.length(), i = 0;
        
       Arrays.fill(hash, -1);
            
       for (int j = 0; j < n; j++) {
               
           i = Math.max(i, hash[s.charAt(j)] + 1);
               
           int maxEnd = j - i + 1;
               
           res = Math.max(res, maxEnd);
               
           hash[s.charAt(j)] = j;
               
       }
            
        return res;
       /* int [] prev = new int[CHAR];    
       
       for (int j = 0; j < 256; j++) {
         hash[j] = 0;
       }
            
       int maxSub = 1, maxCount = 1;
            
       hash[s.charAt(0)]++;
       prev[s.charAt(0)] = 1;     
            
       for (int i = 1; i < s.length(); i++) {
            
            if (hash[s.charAt(i)] == 0) {
                hash[s.charAt(i)]++;
                prev[s.charAt(i)] = i+1;   
                maxCount++;
            } else {     
                maxSub = Math.max(maxSub, maxCount);
                if (s.charAt(i) == s.charAt(i-1)) {
                   maxCount = 1;
                   Arrays.fill(hash, 0);  
                } else {
                   maxCount = maxCount - prev[s.charAt(i)] + 1 + 1;   
                }
                prev[s.charAt(i)] = i+1;    
                hash[s.charAt(i)] = 0;
                hash[s.charAt(i)]++;
            }
       }
          
          maxSub = Math.max(maxSub, maxCount);
          return maxSub; */
       
    }
}