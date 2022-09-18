import java.util.Map.Entry;
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        int res = 0;
        for (int i = 0; i< nums.length; i++){
            if (numbers.containsKey(nums[i])){
                int val = numbers.get(nums[i]);
                val++;
                numbers.put(nums[i], val);
            
            }
            else{
                numbers.put(nums[i], 1);
            }
        }
        
        for(Entry<Integer, Integer> entry: numbers.entrySet()) {

          if(entry.getValue() == 1) {
            
              res = entry.getKey();
            
          }
        }
        return res;
    }
}