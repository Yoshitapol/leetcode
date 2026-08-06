class Solution {
    public boolean lemonadeChange(int[] bills) {
        int i,five = 0,ten = 0;
        for(i=0;i<bills.length;i++){
            if(bills[i] == 5)
                five += 1;
            else if(bills[i] == 10)
                if(five < 1)
                    return false;
                else{
                    five--;
                    ten++;
                }
            else if(bills[i] == 20){
                if(ten >= 1 && five >= 1){
                    ten--;
                    five--;
                }
                else if(ten < 1 && five >= 3){
                    five -= 3;
                }
                else 
                    return false;
            }
        }
        return true;
    }
}