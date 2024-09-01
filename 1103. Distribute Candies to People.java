class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int index=0, givenCandy=1;
        int n = num_people;
        int[] res = new int[n];

        while(candies > 0){
            index %= n;
            if(candies <= givenCandy){
                res[index] += candies;
                candies = 0;
                continue;
            }
            res[index] += givenCandy;
            candies -= givenCandy;
            givenCandy++; index++;
        }
        return res;
    }
}
