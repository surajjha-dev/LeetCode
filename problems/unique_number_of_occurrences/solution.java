class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       int [] hash = new int[20001];
            
       // storing the frequency of each element     
       for (int n : arr) {
          hash[n+1000]++;     
       }
            
       Set<Integer> hashSet = new HashSet<>();
            
       // checking the frequency of each element
       for (int h : hash) {
            if (h == 0)
               continue;
            if (!hashSet.add(h))
                return false;  
       }
            return true;
    }
}