class Solution {
    public int hammingDistance(int x, int y) {
      int xor = x^y;
      int res = 0;
      while(xor!=0){
          if((xor&1) == 1)
              res++;
         xor = xor>>1;
      }
        return res;
    }
}