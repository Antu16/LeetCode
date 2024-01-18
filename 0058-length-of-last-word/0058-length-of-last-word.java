class Solution {
    public int lengthOfLastWord(String s) {
        String[] splited = s.split(" ");
        int len = splited.length - 1;
        String temp = splited[len];
        return temp.length();
    }
}