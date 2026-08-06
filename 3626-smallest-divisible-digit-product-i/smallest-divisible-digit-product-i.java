class Solution {
    public int smallestNumber(int n, int t) {
        int k=0,prod=1,dig;
        while(true){
            k = n;
            prod=1;
            while(k != 0){
                dig = k%10;
                prod *= dig;
                k /= 10;
            }
            if(prod%t == 0)
                return n;
            n++;
        }
    }
}