class ParkingSystem {
        
    // public static Map<Integer, Integer> space = new HashMap<>();    
    public static int [] space = new int [3];
        
    public ParkingSystem(int big, int medium, int small) {
        /* space = new HashMap<>();
        space.put(1, big);
        space.put(2, medium);
        space.put(3, small); */
            
        space[0] = big;
        space[1] = medium;
        space[2] = small;
    }
    
    public boolean addCar(int carType) {
      /*  Integer capacity = space.get(carType);
        if (capacity > 0)
          space.put(carType, capacity-1);
        return capacity >= 1;  */
            
        if (space[carType - 1] - 1 < 0)
              return false;
            
        space[carType - 1]--;
            
        return true;
            
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */