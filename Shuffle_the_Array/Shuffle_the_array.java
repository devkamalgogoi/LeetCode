class Solution {
    public int[] shuffle(int[] nums, int n) {
    int b[]=new int[n*2];
int f=0,s=1;
for(int i=0;i<n;i++)
{
b[f]=nums[i];
b[s]=nums[i+n];
f+=2;
s+=2;
}
return b;
}
}    
    