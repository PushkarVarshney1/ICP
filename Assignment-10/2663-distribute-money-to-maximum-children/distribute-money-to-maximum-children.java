class Solution {
    public int distMoney(int money, int children) {
        if(money < children)return -1;
        money -= children; 
        // Maximum children that can get 7 extra dollars (to make 8)
        int count = Math.min(money / 7, children); 
        
        money -= count * 7; 
        children -= count; 

        // If exactly one child is left and remaining money is 3
        if (children == 1 && money == 3) {
            count--;
        }
        // if all chidren get money but money is stil to be distributed
        if (children == 0 && money > 0) {
            count--;
        }
        return count;
    }
}