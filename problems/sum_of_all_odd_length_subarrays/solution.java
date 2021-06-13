class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       int n = arr.length, sum = 0;
        
            // Sliding Window
       for (int windowSize = 1; windowSize<=n; windowSize+=2) {
           for (int i=0; i <= (n-windowSize); i++) {
                 for (int j=0;j<windowSize;j++) {
                         sum+=arr[i+j];
                 }
           }
       }
            return sum;
    }
}