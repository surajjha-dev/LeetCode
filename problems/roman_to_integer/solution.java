class Solution {
    public int romanToInt(String s) {
            
        Map<String, Integer> roman = getRomanToIntegerMap();
        int start = 0, end = s.length() - 1;
        Integer sum = 0;
            
        while (start <= end) {
                
             if (start == end) {
                  sum += roman.get(Character.toString(s.charAt(start++)));   
             }
                
             if (start > end)
                  break;   
             String s1 = Character.toString(s.charAt(start));
             Integer i1 = roman.get(s1);   
                
             String s2 = Character.toString(s.charAt(start + 1));
             Integer i2 = roman.get(s2);
                
             if (i2 > i1) {
                 sum += roman.get(s1 + s2);
                 start += 2;
             } else {
                sum += i1;
                start++;     
             }
                
                
        }
            
        return sum.intValue();   
    }
        
    public Map<String, Integer> getRomanToIntegerMap() {
            
        Map<String, Integer> roman = new HashMap<String, Integer>();
        roman.put("I", 1);
        roman.put("IV", 4);    
        roman.put("V", 5);
        roman.put("IX", 9);    
        roman.put("X", 10);
        roman.put("XL", 40);    
        roman.put("L", 50);
        roman.put("XC", 90);    
        roman.put("C", 100);
        roman.put("CD", 400);      
        roman.put("D", 500);
        roman.put("CM", 900);    
        roman.put("M", 1000);
        return roman;    
    }    
}