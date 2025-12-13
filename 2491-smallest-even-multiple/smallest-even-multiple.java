class Solution {
    public int smallestEvenMultiple(int n) {
        int p;
        int g;
        if(n%2==0){
            p=n*n;
            g=p;
        }
        else{
            g=n*2;
            n=g;
        }
        return n;
    }
}