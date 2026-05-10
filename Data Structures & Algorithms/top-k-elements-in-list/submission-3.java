class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /*
            HashMap.
            Could be sorted / check if sorted
            Could end up using a heap? that could take care of sorting?
            
            if we look at it in terms of a form of subarray we could have it sorted then 
            follow up with count until new number doesnt say first frequent its TOP Frequent 
            so in this case we could use a Heap sorted and maintain size to be K?
            then when heap size is at k we poll() to remove lowest frequent to only keep TOP frequent?
            Oh acutally its asking for top frequent not highestNum frequents

            So we are looking at num[i] , frequency? comparison.
            So Maybe We can use a HashMap to track frequency? to num 
            then we use another loop to go through nums and pass highest value (frequency count)
            then return that..
            So we could make a int[] size k?
            issue is duplicates.
        
        */

        Map<Integer, Integer> frequencyTracker = new HashMap<>();

        for (int num : nums) {
            frequencyTracker.put(num, frequencyTracker.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> frequencyTracker.get(a) - frequencyTracker.get(b)
        );

        for (int num : frequencyTracker.keySet()) {
            minHeap.add(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        int index = 0;

        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll();
        }

        return result;
    }
}
