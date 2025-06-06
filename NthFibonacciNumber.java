class Solution {
     static final int MOD = 1000000007;
    public int nthFibonacci(int n) {
        // code here
         if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = (a + b) % MOD;
            a = b;
            b = c;
        }
        return b;
    }
}