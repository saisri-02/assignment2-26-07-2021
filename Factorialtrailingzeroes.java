class Solution {
    public int trailingZeroes(int n) {
        int i,f=1;
        for(i=0;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
}

output:

Your input  3
Output      0
Expected    0