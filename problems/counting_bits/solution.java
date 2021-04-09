class Solution {
    public int[] countBits(int num) {
      int [] result = new int[num+1];   
      int i = 0;
      while(i<=num) {
          int temp = i;
          int count = 0;
          while(temp>0) {
              if((temp&1) == 1)
                count++;      
              temp = temp >> 1;
          } 
          result[i] = count;
          i++;
      }
      return result;
    }
}