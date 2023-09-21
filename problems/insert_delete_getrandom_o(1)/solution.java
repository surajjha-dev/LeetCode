class RandomizedSet {

    Set<Integer> s;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        s = new HashSet<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (s.contains(val)) {
            return false;
        } else {
            s.add(val);
            return true;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (s.contains(val)) {
            s.remove(val);
            return true;
        } else  {
            return false;
        }
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        List<Integer> list = new ArrayList<Integer>(s);
        int r = (int)(Math.random()*s.size());
        return list.get(r);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */