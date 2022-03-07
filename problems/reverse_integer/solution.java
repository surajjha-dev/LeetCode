class Solution {
    public int reverse(int x) {
            
        if (x == 0) return 0;    
            
        Integer maxInt = Integer.MAX_VALUE;   // 2147483647
            
        if (x < -1*Integer.MAX_VALUE || x > Integer.MAX_VALUE)
                return 0;
            
        boolean isNegative = x < 0 ? true : false;    
            
        x = Math.abs(x);
            
        int number = 0, count = 0, lastDigit = x%10;
            
        while(x != 0) { 
                
           if (lastDigit >= 2)    
             if (number > maxInt/10)     
                 return 0;    
                
            number = number * 10 + x % 10;
            x = x / 10;
            count++;    
        }
        
        return isNegative ? -1 * number: number;  
    }
}