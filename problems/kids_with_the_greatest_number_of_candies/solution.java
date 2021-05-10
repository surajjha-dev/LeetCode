class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kids = new ArrayList<Boolean>();
        int max = candies[0];
        for (int i=1;i<candies.length;i++) {
            if (candies[i]>max)
                max = candies[i];
        }
        for (int i=0;i<candies.length;i++) {
            if ((max-candies[i]) <= extraCandies)
                kids.add(true);
            else
                kids.add(false);
        }
        return kids;
    }
}