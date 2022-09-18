class Solution {
    public int reverse(int x) {
              
        
        int[] arr = new int[100];
        int i=0;
        int mod = 0;
        long big = 0L;
        boolean isNeg = false;
        int max = (int)Math.pow(2,31) -1;
        int negMax = (int)Math.pow(2,31)*(-1);
        if (x == 0 || x >  max)
        {
           return 0;
        }
        
        if (x < 0)
        {
            
            if (x < negMax)
            {
                return 0;
            }
                x = x*-1;
            
            isNeg = true;
        }
        
        while (x != 0)
        {
            mod = x%10;
            arr[i] = mod;
            x = x/10;
            i++;
        }
        int m = 1;
        for (int j = 0; j<i; j++){
            big  = big* 10 + arr[j];
            
            
            if (big > max)
            {
                return 0;
            }
        }
        
        if(isNeg){
            return (int)big*-1;
        }
        return (int)big;
    }
}

    
