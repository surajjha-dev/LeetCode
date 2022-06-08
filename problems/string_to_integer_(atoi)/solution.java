class Solution {
    public int myAtoi(String s) {
            
          int len = s.length(), sum = 0;
          int max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;
          int sign = 1, index = 0, digit;
            
            
          while (index < len && s.charAt(index) == ' ')
                index++;
            
          if (index < len) {
                if (s.charAt(index) == '+') {
                   sign =  1; 
                   index++;
                }
                else if (s.charAt(index) == '-') {
                   sign = -1;
                   index++;
                }
          }
            
          while (index < len && Character.isDigit(s.charAt(index))) {
                  
                  digit = s.charAt(index) - '0';
                  
                  if (sum > max/10 || (sum == max/10 && digit > 7)) {
                     return sign == 1 ? max : min;
                  }
                  
                  sum = sum*10 + digit;
                  
                  index++;
          }
            
          return sum*sign;  
    }
}