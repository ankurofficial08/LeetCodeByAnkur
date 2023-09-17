class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Kye Knowledge You should have For This Problem-
        // 1. Array Sorting
        // 2. Substring of an String

        // Step1 - Sort The Array , so that it will ensure that same prefix values are present
        //         at the start and end of the given string array!
        Arrays.sort(strs);

        // Step2 - create two string variables and store first and last word of the array!
        String str1 = strs[0];
        String str2 = strs[strs.length-1];

        // Step4 - For the substring index , we will compare the same character one by one b/w
        //         str1 and str2 , and then we got the value of i. 
        int i = 0;
        while(i < str1.length())
        {
            if(str1.charAt(i) == str2.charAt(i))
               i++;
            else
               break;

        }

        // Step3 - substring will return the prefix but before that we have to find till what ?
        //         the word will return the substring ?
        return str1.substring(0,i);

    }
}
