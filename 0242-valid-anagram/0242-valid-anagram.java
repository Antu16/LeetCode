class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() !=  t.length()){
            return false;
        }
        
        for (int i = 0; i<t.length(); i++){
            String str = Character.toString(t.charAt(i));
            if (!s.contains(str)){
                return false;
            }
            else{
                s = s.replaceFirst(str, "");
            }
        }
        
        return true;
    }
}