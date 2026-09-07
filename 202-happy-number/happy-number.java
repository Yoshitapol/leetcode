class Solution {
    public int sum(int n) {
        int s=0;
        while(n!=0) {
            int a=n%10;
            s+=a*a;
            n=n/10;
        }
        return s;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do {
            slow=sum(slow);
            fast=sum(sum(fast));
        } while(slow!=fast);
        return slow==1;
    }
}