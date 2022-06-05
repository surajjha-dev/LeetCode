class Solution {
    public String intToRoman(int num) {
            
         if (num > 3999)
              return "";   
            
         int [] integers = new int [] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
         String [] romanStr = new String [] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
                                             "IX", "V", "IV", "I"};
            
         return getRomanByFindingMinimum(num, integers, romanStr);
            
    }
        
    public String getRomanByFindingMinimum(int num, int [] integers, String [] romanStr) {
           int start = 0, end = integers.length - 1;
           
           StringBuilder str = new StringBuilder();    
            
           while (num > 0) {
                   while (integers[start] <= num) {
                         num = num - integers[start];
                         str.append(romanStr[start]);    
                   }
                   start++;
           } 

           return str.toString(); 
    }
        
    public String getRomanSeparatingChars(int num, int [] integers, String [] romanStr) {
         List<Integer> placeValues = new ArrayList<>();
         int i = 10, temp = 1;
            
         while (num != 0) {
                 
              placeValues.add(Integer.valueOf(num % i * temp));
              num = num/10;
              i *= 10;
              temp *= 10;   
                 
         }
            
         Collections.reverse(placeValues);   
            
         StringBuffer str = new StringBuffer();
         Integer t = 0;  
         for (Integer v : placeValues) {
              t += v;    
             str.append(getRoman(integers, romanStr, v));
         }
           
         return String.valueOf(placeValues.get(2));  
    }    
        
    public String getRoman(int [] integers, String [] romans, Integer temp) {
            
            int value = temp;
            
            StringBuffer keyValue = new StringBuffer();
            
            for (int i = 0; i < integers.length; i++) {
                   if (integers[i] <= value) {
                         value -= integers[i];
                         keyValue.append(romans[i]);
                   } 
            }
            if (value < 4 || value > 1) {
                 while (value != 0) {
                     value -= 1;
                     keyValue.append("I");    
                 }   
            }
            
            return keyValue.toString();
    }     
        
    public Map<Integer, String> getRomanMap() {
        Map<Integer, String> roman = new HashMap<Integer, String>();
            
        roman.put(1, "I");
        roman.put(4, "IV");    
        roman.put(5, "V");
        roman.put(9, "IX");    
        roman.put(10, "X");
        roman.put(40, "XL");    
        roman.put(50, "L");
        roman.put(90, "XC");    
        roman.put(100, "C");
        roman.put(400, "CD");      
        roman.put(500, "D");
        roman.put(900, "CM");    
        roman.put(1000, "M");
        return roman;    
    }    
}