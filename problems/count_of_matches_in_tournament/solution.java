class Solution {
    public int numberOfMatches(int n) {
        if (n == 0 || n == 1)
                return 0;
            
        int div = 0, matches = 0, team = n;
            
        while (n != 1) {
            matches += (n/2);
                
            if (n % 2 != 0) {
              n = n/2;
              n += 1;
            }   else {
              n = n/2;
            }
        }
        
        return matches;
    }
}