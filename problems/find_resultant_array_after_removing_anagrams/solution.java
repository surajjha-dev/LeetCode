class Solution {
    public List<String> removeAnagrams(String[] words) {
         String prev = words[0];
         List<String> res = new ArrayList<>();
        
         for (int i = 1; i < words.length; i++) {
             
             String curr = words[i];
             
             if (!isAnagram(prev, curr)) {
                 res.add(prev);
                 prev = curr;
             }
             
         }
        
         res.add(prev);
        
         return res;
    }
    
    public boolean isAnagram(String string1, String string2) {
        
        if (string1.length() != string2.length())
           return false;
        
        int n = string1.length();
        
        int [] hash = new int[256];
        
        for (int i = 0; i < n; i++) {
            hash[string1.charAt(i)]++;
        }
        for (int i = 0; i < n; i++) {
            if (hash[string2.charAt(i)] > 0)
                hash[string2.charAt(i)]--;
            else
                return false;
        }
        
        return true;
    }
}