class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        x = s.split()
        y = x[len(x)-1]

        return len(y)

'''
So its very simple ....you just have to convert the string into list in words. 
We can do that by applying split() method to the string. as in 3rd line.
now as per the question we have to find the length of the last word.
So in 4th line we are getting the last word in variavle Y and then return the length of the y.

'''
