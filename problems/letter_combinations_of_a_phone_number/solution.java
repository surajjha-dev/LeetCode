class Solution {
        
          /*
                      ""
                a      b      c 
          ad ae af  bd be bf  cd ce cf
          
          */
        
            
    public static List<String> res = new ArrayList<>(); 
        
    public List<String> letterCombinations(String digits) {
            
           res = new ArrayList<>(); 
            
           List<List<String>> dialpad = getDialPad();
            
           if (digits.length() == 0) {
               return new ArrayList<>();    
           }
            
           this.combinations(digits, "", 0, dialpad);
            
           return res; 
    }
        
    static void combinations(String digits, String pattern, int index, List<List<String>> dialpad) {
            
            if (index == digits.length()) {
                 res.add(pattern);
                 return;   
            }

            int digit = Character.getNumericValue(digits.charAt(index));
            
            List<String> dialChar = dialpad.get(digit-1);
            
            for (String s : dialChar) {
                    combinations(digits, pattern + s, index + 1, dialpad);
            }
    }    
        
    List<List<String>> getDialPad () {
            
        List<List<String>> dialpad = new ArrayList<>();
        
        dialpad.add(new ArrayList<>());
        dialpad.add(Arrays.asList(new String [] {"a", "b", "c"}));
        dialpad.add(Arrays.asList(new String [] {"d", "e", "f"}));
        dialpad.add(Arrays.asList(new String [] {"g", "h", "i"}));
        dialpad.add(Arrays.asList(new String [] {"j", "k", "l"}));
        dialpad.add(Arrays.asList(new String [] {"m", "n", "o"}));
        dialpad.add(Arrays.asList(new String [] {"p", "q", "r", "s"}));
        dialpad.add(Arrays.asList(new String [] {"t", "u", "v"}));
        dialpad.add(Arrays.asList(new String [] {"w", "x", "y", "z"}));
            
       return dialpad;     
    }    
}