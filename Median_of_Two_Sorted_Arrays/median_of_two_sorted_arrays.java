class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>l1=new ArrayList<>();
        double e=0;
        double f=0;
        double h=0;
        for(int c:nums1){
            l1.add(c);
        }
        for(int d:nums2){
            l1.add(d);
        }
        Collections.sort(l1);
        int m=l1.size();
        int z=m/2;
        if(m%2!=0){
           e=l1.get(z);
           return e; 
        }
        else{
            e=l1.get(z);
            f=l1.get(z-1);
            h=((e+f)/2);
            return (double)h;
        }

        
        
        
    }
}