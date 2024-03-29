class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int total = 0, diff = 0, index = 0;

        for (int i = 0; i < gas.length; i++) {
            total += gas[i]-cost[i];
            diff += gas[i]-cost[i];
            if (diff < 0) {
                diff = 0;
                index = i+1;
            }
        }

        if (total < 0)
          return -1;

        return index;   
    }
}