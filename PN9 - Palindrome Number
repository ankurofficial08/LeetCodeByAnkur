// Problem 09 - Palindrome Number


class Solution {
    public boolean isPalindrome(int x) {

        int ans;
        int temp = x;
        int num = 0;

        while(temp > 0)
        {
            ans = temp % 10;
            num = num * 10 + ans;
            temp = temp/10;
        }

        if(x == num)
           return true;
        else
           return false;   
        
    }
}
