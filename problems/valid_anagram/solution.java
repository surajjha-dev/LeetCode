class Solution {
    public boolean isAnagram(String s, String t) {
         
         int [] hash = new int [256];
            
         if (s.length() != t.length())
            return false;
            
         for (int i = 0; i < s.length(); i++) {
             hash[s.charAt(i)] += 1;
         }
            
         for (int j = 0; j < t.length(); j++) {
             if (hash[t.charAt(j)] > 0)
                  hash[t.charAt(j)] -= 1;
         }
            
         for (int k = 0; k < hash.length; k++) {
              if (hash[k] > 0)
                    return false;
         }   
         
         return true;   
    }
}