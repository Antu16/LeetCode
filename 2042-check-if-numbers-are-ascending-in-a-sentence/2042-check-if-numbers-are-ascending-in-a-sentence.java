class Solution {
    public boolean areNumbersAscending(String s) {
        String[] splitStr = s.split(" ");
        int tempVal = -99, check = 0;
        for (int i = 0; i < splitStr.length; i++) {

            if (splitStr[i].matches("\\d+(\\\\d+)?")) {
                tempVal = Integer.parseInt(splitStr[i]);
                if (tempVal >= 0) {
                    if (check < tempVal) {
                        check = tempVal;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}