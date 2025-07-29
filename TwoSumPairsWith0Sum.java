// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        HashSet<Integer> seenNumbers = new HashSet<>();
        
        HashSet<String> uniquePairs = new HashSet<>();
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        for(int num : arr){
            int opposite = -num;
            
            if(seenNumbers.contains(opposite)){
                int first = Math.min(num, opposite);
                int second = Math.max(num, opposite);
                
                String pairKey = first + ","+ second;
                
                
                if(!uniquePairs.contains(pairKey)){
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(first);
                    pair.add(second);
                    
                    result.add(pair);
                    uniquePairs.add(pairKey);
                }
            }
            
            seenNumbers.add(num);
        }
        
         result.sort((pair1, pair2) -> {
            if (!pair1.get(0).equals(pair2.get(0))) {
                return pair1.get(0) - pair2.get(0);
            } else {
                return pair1.get(1) - pair2.get(1);
            }
        });

        return result;
    }
}
