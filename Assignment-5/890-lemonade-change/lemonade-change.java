class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0; // count of five
        int ten=0; // count of ten 
        for(int i=0 ; i<bills.length ; i++){
            if(bills[i] == 5) five++;
            else if(bills[i] == 10){
                if(five > 0){
                    five--;
                    ten++;
                }
                else return false;
            }
            else{
                if(five > 0 && ten>0){
                    five--;
                    ten--;
                }
                else if(five >=3){
                    five-=3;
                }
                else return false;
            }
        }
        return true;
    }
}