class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;  
        int sIndex = 0;

        for (int tIndex = 0; tIndex < t.length(); tIndex++) {
            if (t.charAt(tIndex) == s.charAt(sIndex)) {
                sIndex++;
                if (sIndex == s.length()) {
                    return true;
                }
            }
        }
        
        return sIndex == s.length();
    }
}