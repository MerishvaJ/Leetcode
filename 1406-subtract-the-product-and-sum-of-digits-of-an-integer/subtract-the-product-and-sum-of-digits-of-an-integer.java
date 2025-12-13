class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int p=1;
        int r;
        while(n>0){
            int a=n%10;
            sum+=a;
            p*=a;
            n=n/10;
        }r=p-sum;
        return r;
    }
}