class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int ori=n;

        while(n>0){
            int digit = n % 10;
            sum+=digit;
            product*=digit;

            n/=10;
        }

        return (ori % (sum+product) ==0 ) ? true:false;
    }
}