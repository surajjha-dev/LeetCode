class Solution {
    public String reverseWords(String s) {
            
        StringBuilder str = new StringBuilder();
        String S = s.trim();    
        int end = S.length() - 1;
        int initial = 0;
            
        for (int i = S.length() - 1 ; i >= 0 ; i-- ) {
                
            char c  = S.charAt(i);
                
            if (c == ' ') {
                    
                initial = i;
                    
                for (int j = initial + 1; j <= end; j++) {
                    str.append(S.charAt(j));
                }
                    
                str.append(S.charAt(i));
                
                while (S.charAt(i) == ' ') {
                        i--;
                }    
                    
                end = i;   
            }
                
            if (i == 0) {
                    
                for (int k = 0; k <= initial - 1; k++) {
                    str.append(S.charAt(k));
                }
                    
            }
        }
            
       if (str.toString().length() == 0)
               return s;

       return str.toString().trim();
    }
}