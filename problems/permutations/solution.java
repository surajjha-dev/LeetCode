class Solution {
        
    static List<List<Integer>> permutations = new ArrayList<>();
            
    public List<List<Integer>> permute(int[] nums) {
         permutations = new ArrayList<>();   
         generatePermutations(nums, new HashSet<>(), new ArrayList<>());          
         return permutations;   
    }
        
    public void generatePermutations(int [] nums, Set<Integer> hash, List<Integer> arrangement) {
 
        if (arrangement.size() == nums.length) 
           permutations.add(new ArrayList<>(arrangement));
            
        for (int i = 0; i < nums.length; i++) {
             if (hash.contains(nums[i])) continue;
             
             arrangement.add(nums[i]);
             hash.add(nums[i]);
                
             generatePermutations(nums, hash, arrangement);
              
             // arrangement and hashset should be unique for next interation   
             arrangement.remove(arrangement.size()-1);
             hash.remove(nums[i]);
         }
    }    
}