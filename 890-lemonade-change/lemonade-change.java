class Solution {
    public boolean lemonadeChange(int[] bills) {
        int i;
        int[] bal = new int[3];
        for(i=0;i<bills.length;i++){
            if(bills[i] == 5)
                bal[0] += 1;
            else if(bills[i] == 10)
                if(bal[0]<1)
                    return false;
                else{
                    bal[0] -= 1;
                    bal[1] += 1;
                }
            else if(bills[i] == 20){
                if(bal[1] >= 1 && bal[0] >= 1){
                    bal[1] -= 1;
                    bal[0] -= 1;
                }
                else if(bal[1] < 1 && bal[0] >= 3){
                    bal[0] -= 3;
                }
                else 
                    return false;
                bal[2] += 1;
            }
        }
        return true;
    }
}