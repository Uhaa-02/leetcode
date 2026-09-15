class Solution {
    public double myPow(double x, int n) {
        return solve(x, (long) n);
    }

    private double solve(double x, long n) {
        if (n == 0) return 1;
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        double half = solve(x, n / 2);
        double halfPower = half * half;

        if (n % 2 != 0) {
            halfPower = x * halfPower;
        }

        return halfPower;
    }
}