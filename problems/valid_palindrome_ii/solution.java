class Solution {
    public boolean validPalindrome(String s) {
        int low = 0, high = s.length()-1, count = 0;
            
        while (low <= high) {
                
             char clow = s.charAt(low);
             char chigh = s.charAt(high);
                
             if (clow != chigh) {
                     
                // check the substring after deleting the left char from string
                if (checkSubPalindrome(s, low + 1, high))
                     return true;    
                     
                // check the substring after deleting the right char from string     
                return  checkSubPalindrome(s, low, high - 1);   
             }
                
             low++;
             high--;
        }
            
        return true;
    }
        
    public boolean checkSubPalindrome(String s, int l, int h) {
           
            while (l <= h) {
                 if (s.charAt(l++) != s.charAt(h--))
                     return false;
            }
            return true;       
    }
}