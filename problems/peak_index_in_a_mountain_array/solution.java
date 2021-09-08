class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int low = 0, high = arr.length - 1, mid = 0;
            
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