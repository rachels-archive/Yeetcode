// Problem 1672
class Solution {
    
    public int add (int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i ++){
            sum += a[i];
        }
        return sum;
    }
    
    public int maximumWealth(int[][] accounts) {  
        int max = add(accounts[0]);
        
        for (int j = 1; j < accounts.length; j ++){
            if( add(accounts[j]) > max) {
                max = add(accounts[j]);
            }
        } return max;
    }
}
