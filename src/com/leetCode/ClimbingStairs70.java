package com.leetCode;

public class ClimbingStairs70 {
    public int climbStairs(int n) {
        int first = 1;
        int second = 1;
        int fn = 0;
        if(n <= 1)
            return (n == 1 ? 1 : 0);
        int i;
        for(i = 2; i <= n; i++) {
            fn = first + second;
            first = second;
            second = fn;
        }
        return fn;


    }
}
