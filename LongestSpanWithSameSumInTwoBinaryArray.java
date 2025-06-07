class Solution {
    public int longestCommonSum(int[] a1, int[] a2) {
        // Code here
        // int n = a1.length;
        // int result = 0;
        
        // for(int i = 0; i < n; i++){
        //     int sum1 = 0;
        //     int sum2 = 0;
            
        //     for(int j = i; j < n; j++){   //     TIME LIMIT EXCEEDS
        //         sum1 = sum1 + a1[j];
        //         sum2 = sum2 + a2[j];
                
        //         if(sum1 == sum2){
        //             result = Math.max(result, j - i + 1);
        //         }
        //     }
        // }
        // return result;
        int n = a1.length;

        // HashMap to store the first occurrence of prefix sum difference
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxLength = 0;
        int prefixDiff = 0;  // Difference of prefix sums of a1 and a2

        for (int i = 0; i < n; i++) {
            // Update the prefix difference
            prefixDiff += (a1[i] - a2[i]);

            // If prefix difference is 0, from index 0 to i arrays are balanced
            if (prefixDiff == 0) {
                maxLength = i + 1;
            }

            // If this prefixDiff was seen before, we found a balanced subarray
            if (map.containsKey(prefixDiff)) {
                int prevIndex = map.get(prefixDiff);
                int len = i - prevIndex;
                maxLength = Math.max(maxLength, len);
            } else {
                // Store the first occurrence of this prefix difference
                map.put(prefixDiff, i);
            }
        }

        return maxLength;
    }
}