class Solution {
    public String mergeAlternately(String word1, String word2) {
        int firstWord = word1.length();
        int secondWord = word2.length();
        
        String res = "";
        
        int startIndex= 0;
        for (int i = 0; i < Math.max(firstWord, secondWord); i++) {
            if (startIndex < firstWord)
                res = res.concat((String.valueOf(word1.charAt(i))));
            if (startIndex < secondWord)
                res = res.concat((String.valueOf(word2.charAt(i))));
            
            startIndex++;
            
        }
        
        return res;
        
        
        
    }
}