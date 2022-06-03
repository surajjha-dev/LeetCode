class Solution {
    public boolean isIdealPermutation(int[] nums) {
            
        int gi=0, li=0;
            
        li = localInversions(nums, 0, nums.length - 1);
        gi = globalInversions(nums, 0, nums.length - 1);
            
        return gi == li; 
    }
        
    public int localInversions(int [] nums, int l, int r) {
            int inversion = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] > nums[i + 1])
                            inversion++;
            }
            return inversion;
    } 
        
    public int globalInversions(int [] nums, int l, int r) {
            return countInversions(nums, l, r);
    }
        
    static int countInversions(int arr[], int l, int r) {
        int res = 0;
          
        if (l < r) {
            int mid = (l+r)/2;
            res += countInversions(arr, l, mid);
            res += countInversions(arr, mid + 1, r);
            res += countAndMerge(arr, l, mid, r);
        }
        
        return res;
     }    
        
    static int countAndMerge(int arr[], int l, int mid, int r) {
        
        int temp [] = new int [r - l + 1];       
        int inversionCount = 0;
        int p1 = l, p2 = mid + 1, k = 0;
        while (p1 <= mid && p2 <= r) {
            
            if (arr[p1] <= arr[p2]) {
              temp[k++] = arr[p1++];
            } else {
              temp[k++] = arr[p2++];
              inversionCount += (mid - p1 + 1);
            }
        }   
        while (p1 <= mid) {
            temp[k++] = arr[p1++];
        }
        while (p2 <= r) {
            temp[k++] = arr[p2++];
        }
    
        System.arraycopy(temp, 0, arr, l, k);
            
        return inversionCount;
    }    
}