class Solution {
    public int[] sortArray(int[] nums) {
        //return bubbleSort(nums);
        //return selectionSort(nums);
        //return insertionSort(nums);
        mergeSort(nums, 0, nums.length - 1);
        return nums;    
    }
                
    public int [] bubbleSort(int [] nums) {
         int n = nums.length;   
         boolean swap = false;  
            
         for (int i = 0; i < n; i++) {
                 swap = false;
             for (int j = 0; j < n - i - 1; j++) {
                   if (nums[j] > nums[j+1]) {
                       int temp = nums[j+1];
                       nums[j+1] = nums[j];
                       nums[j] = temp;
                       swap = true;    
                   }   
             }
                 if (swap == false)
                         break;
         }
            
         return nums;   
    }
        
   public int [] selectionSort(int [] nums) {
        int n = nums.length, min_ind = 0;
         
         // Compare ith element in remaining array to find minimum
        for (int i = 0; i < n ; i++) {
                
            min_ind = i;
                
            for (int j = i + 1; j < n; j++) {
                  // Finding and storing the minimum element
                  if (nums[min_ind] > nums[j])
                     min_ind = j;
            }
                
            if (min_ind != i)
               swap(nums, min_ind, i);
        }
           
        return nums;
   }
        
   public int [] insertionSort(int [] nums) {
           
        int n = nums.length, back = 0, temp = 0;
           
        for (int j = 1; j < n; j++) {
              back = j;
              temp = nums[j];  
                
              // Traversing to the left side for finding the correct position  
              while (back != 0 && nums[back - 1] > temp) {
                   swap(nums, back, back-1);                      
                   back--;   
              }   
        }   
           
         return nums; 
   }
        
   public void mergeSort(int [] nums, int l, int r) {
        if (l >= r) return;
           
        int m = (l + r)/2;
           
        mergeSort(nums, l, m);
        mergeSort(nums, m + 1, r);
        merge(nums, l, r);  
   }
        
   public void merge(int [] nums, int l, int r) {
           
           int [] temp = new int [r-l+1];
           
           int m = (l + r)/2, t = 0, p1 = l, p2 = m+1;
           
           while (p1 <= m && p2 <= r) {
                   if (nums[p1] < nums[p2]) {
                      temp[t++] = nums[p1++];
                   } else {
                      temp[t++] = nums[p2++];   
                   }    
           }
           while (p1 <= m) 
                temp[t++] = nums[p1++];
           while (p2 <= r) 
                temp[t++] = nums[p2++];
           
          System.arraycopy(temp, 0, nums, l, r - l + 1);
   }     
        
   private void swap (int [] nums, int i, int j) {
         nums[i] = nums[i] ^ nums[j];
         nums[j] = nums[i] ^ nums[j];
         nums[i] = nums[i] ^ nums[j];
   }     
        
}