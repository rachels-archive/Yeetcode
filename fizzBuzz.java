class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> answer = new ArrayList<String>(n);
        
        for (int i = 1; i <= n; i ++){
            
            String ans = (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" :
                         (i % 3 == 0) ? "Fizz" :
                         (i % 5 == 0) ? "Buzz" :
                         Integer.toString(i);
            answer.add(ans);
        }
        return answer;
    }
}
