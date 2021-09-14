class Solution {
    public int findPeakElement(int[] arr) {
       int low = 0, high = arr.length - 1, mid = 0, n = arr.length;
       
       if (high == 0)
            return 0;
       if (arr[n-1] > arr[n-2]) 
            return n-1;             
       if (arr[0] > arr[1])
            return 0;
            
       while (low <= high) {
            mid = (low + high)/2;
               
           if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1])
                return mid;
          
           if (arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1])
                 high = mid - 1;
           else
                 low = mid + 1;
       }
            
            return 0;
       
    }
}