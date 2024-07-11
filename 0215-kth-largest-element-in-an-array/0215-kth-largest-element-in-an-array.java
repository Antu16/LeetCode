class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Maintain a heap of size k
        for (int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        // The root of the heap is the kth largest element
        return minHeap.peek();

    }
    
}