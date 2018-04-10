package com.leetCode;

public class SingleNumber136 {
    /*
    1.if we take XOR of zero and some bit, it will return that bit
        a ⊕ 0 = a
    2.if we take XOR of two same bits, it will return 0
        a ⊕ a = 0
    3.a ⊕ b ⊕ a = (a ⊕ a) ⊕ b = 0 ⊕ b = b
     */
    public int singleNumber(int[] nums) {
        int ans =0;

        for(int i=0;i!= nums.length;i++)
            ans ^= nums[i];

        return ans;

    }

}
