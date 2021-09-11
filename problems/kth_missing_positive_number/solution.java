class Solution {
    public int findKthPositive(int[] arr, int k) {
       
        int count = 0, prevCount = 0, big = 1, n = arr.length, temp = 0;    
            
        count += (arr[0] - 1);
            
        if (k <= count)
          return k;
            
        for (int i = 1; i < n; i++) {
            prevCount = count;
            temp = arr[i] - arr[i-1];
            temp = temp - 1;
            count += temp;
                    
            if (k <= count) {
              temp = k - prevCount;
              temp += arr[i-1];
              return temp;
            }
        }  
            
        if (count < k)
           return arr[n-1] + k - count;
            
         return count;    
    }
}