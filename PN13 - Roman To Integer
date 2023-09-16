import java.util.*;

class Solution {
    public int romanToInt(String s) {

        HashMap <Character , Integer> map = new HashMap<>();

        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);

        //last variable will store last character of string
        char last = s.charAt(s.length()-1);
        
        //in result we will store value of last character
        int result = map.get(last);

        for(int i= s.length()-2; i>=0; i--)
        {
           if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
              result = result - map.get(s.charAt(i));
           else
              result = result + map.get(s.charAt(i));   
        } 
        return result;       
    }   
}
