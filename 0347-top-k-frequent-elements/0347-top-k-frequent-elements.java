class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[] = new int[k];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pQueue = new PriorityQueue<>((a,b) -> a.getValue()-b.getValue());
        for(Map.Entry<Integer, Integer> val:map.entrySet()){
            pQueue.add(val);
            if(pQueue.size()>k){
                pQueue.poll();
            }
        }
        
        for (int i =0; i<k;i++){
            res[i] = pQueue.poll().getKey();
        }
 
        return res;
    }
}