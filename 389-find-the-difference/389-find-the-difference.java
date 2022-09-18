class Solution {
    public char findTheDifference(String s, String t) {
    
        for (int i = 0; i< s.length();i++){
            char ch = s.charAt(i);
            StringBuffer str = new StringBuffer(t);
            int indexOft = t.indexOf(ch);
            str.deleteCharAt(indexOft);
            t = str.toString();
            
        }
        return t.charAt(0);
    }
}