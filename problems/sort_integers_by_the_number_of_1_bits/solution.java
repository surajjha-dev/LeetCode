class Solution {
    public static int countBits(int n) {
        int res = 0;
        while(n>0) {
            n = n & (n-1);
            res++;
        }
        return res;
    }
    public int[] sortByBits(int[] arr) {
      for (int i=0;i<arr.length;i++) {
          for (int j=i+1; j<arr.length; j++) {
              int set1 = countBits(arr[i]);
              int set2 = countBits(arr[j]);
              if (set1 == set2) {
                  if (arr[i]>arr[j]) {
                      int temp = arr[i];
                      arr[i] = arr[j];
                      arr[j] = temp;
                  }
              } else {
                  if (set1>set2) {
                     int temp = arr[i];
                      arr[i] = arr[j];
                     arr[j] = temp;  
                  }
              }
          }
      }
        return arr;
    }
}