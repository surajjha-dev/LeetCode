class Solution {
    public int candy(int[] ratings) {
        int len = ratings.length, sum = 0;
        int candies[] = new int[len];
        Arrays.fill(candies, 1);
        
        if ( len == 0 || len == 1)
           return len;

        for (int i = 1; i < len; i++) {
            if (ratings[i] > ratings[i-1])
              candies[i] = candies[i-1] + 1;
        }
        for (int i = len - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i+1])
              candies[i] = Math.max(candies[i], candies[i+1] + 1);

              // [1, 3, 4, 5, 2] - candies [1, 2, 3, 4, 1]
        }

        for (int i = 0; i < len; i++) {
            sum+=candies[i];
        }

        return sum;   
    }
}
