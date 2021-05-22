class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int m=0; m<accounts.length; m++) {
            int temp = 0;
            for (int n=0; n<accounts[m].length; n++) {
                temp+=accounts[m][n];
            }
            if (temp>maxWealth) {
                maxWealth = temp;
            }
        }
        return maxWealth;
    }
}