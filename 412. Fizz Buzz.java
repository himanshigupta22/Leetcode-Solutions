class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        int fizz=0, buzz=0;
        for(int idx=1; idx<=n; idx++){
            fizz++; buzz++;
            if(fizz == 3 && buzz == 5){
                ans.add("FizzBuzz");
                fizz=0; buzz=0;
            } else if(fizz == 3){
                  ans.add("Fizz");
                  fizz=0;
            } else if(buzz == 5){
                  ans.add("Buzz");
                  buzz=0;
            } else {
                  ans.add(String.valueOf(idx));
            }
        }
        return ans;
    }
}
